package com.altran.techtest.kas.service;

import com.altran.techtest.kas.dto.ItemDTO;
import com.altran.techtest.kas.dto.SolrMessageDTO;
import org.junit.Before;
import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ResourceClientImplTest {
    private static final Integer PAGE = 0;
    private static final Integer ROWS = 10;
    private static final String ID = "cb293930-f483-4457-bf57-50a68e9b01b3";

    private IResourceClient resourceClient;

    @Before
    public void setUp() {
        this.resourceClient = new ResourceClientImpl();
    }

    @Test
    public void whenReadingFromResourceThenNotNullResponse() throws Exception {
        Flux<SolrMessageDTO> solrMessage = this.resourceClient.getAllResultsFromResource(PAGE, ROWS);
        assertEquals(solrMessage.blockFirst().isSuccess(), true);
    }

    @Test
    public void whenReadingFromResourceByIdThenNotNullResponse() throws Exception {
        Mono<SolrMessageDTO> solrMessage = this.resourceClient.getResultFromResourceById(ID);
        assertNotNull(solrMessage.block());
        ItemDTO expectedResult = solrMessage.block().getResult().getResults().get(0);
        assertEquals(expectedResult.getId(), ID);
    }

}