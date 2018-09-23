package com.altran.techtest.kas.service;

import com.altran.techtest.kas.dto.SolrMessageDTO;
import org.junit.Before;
import org.junit.Test;
import reactor.core.publisher.Flux;

import static org.junit.Assert.assertNotNull;

public class ResourceClientImplTest {
    private static final Integer PAGE = 0;
    private static final Integer ROWS = 10;

    private IResourceClient resourceClient;

    @Before
    public void setUp() {
        this.resourceClient = new ResourceClientImpl();
    }

    @Test
    public void whenReadingFromResourceThenNotNullResponse() throws Exception {
        Flux<SolrMessageDTO> solrMessage = this.resourceClient.getAllResultsFromResource(PAGE, ROWS);
        assertNotNull(solrMessage);
    }

}