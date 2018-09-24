package com.altran.techtest.kas.controller;

import com.altran.techtest.kas.dto.SolrMessageDTO;
import org.assertj.core.api.Assertions;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResourceReaderControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void whenGetAllResourcesWithoutSpecifyingPageAndRowsThenReceiveSolrMessage() {
        webTestClient.get().uri("/kasapi/result")
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8)
                .expectBodyList(SolrMessageDTO.class);
    }

    @Test
    public void whenGetSingleResourceByIdThenRecieveNotNull() {
        webTestClient.get()
                .uri("/kasapi/result/{id}", "cb293930-f483-4457-bf57-50a68e9b01b3")
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .consumeWith(response ->
                        Assertions.assertThat(response.getResponseBody()).isNotNull());
    }

    @Test
    public void whenGetSingleResourceByIdThenRecieveExpectedId() {
        webTestClient.get()
                .uri("/kasapi/result/{id}", "cb293930-f483-4457-bf57-50a68e9b01b3")
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$.success").isEqualTo(true)
                .jsonPath("$.result.results[0].id").isEqualTo("cb293930-f483-4457-bf57-50a68e9b01b3");
    }

    @Test
    public void whenGetSingleResourceByIdThenNotSuchId() {
        webTestClient.get()
                .uri("/kasapi/result/{id}", "madeUpId")
                .exchange()
                .expectStatus().isNotFound();
    }

}