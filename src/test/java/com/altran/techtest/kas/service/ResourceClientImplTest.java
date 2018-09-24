package com.altran.techtest.kas.service;

import com.altran.techtest.kas.dto.ItemDTO;
import com.altran.techtest.kas.dto.SolrMessageDTO;
import com.altran.techtest.kas.exception.KasNoSuchItem;
import com.altran.techtest.kas.exception.KasNoSuchItemWithThisName;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ResourceClientImplTest {
    private static final Integer PAGE = 0;
    private static final Integer ROWS = 10;
    private static final String ID = "cb293930-f483-4457-bf57-50a68e9b01b3";
    private static final String NAME = "est-demo-altes-omissio-edat-quinquenal";
    private static final String QUERY = "frequency:ANUAL";

    private IResourceClient resourceClient;

    @Before
    public void setUp() {
        this.resourceClient = new ResourceClientImpl();
    }

    @Test
    public void whenReadingFromResourceThenNotNullResponse() throws Exception {
        Flux<SolrMessageDTO> solrMessage = this.resourceClient.getAllResultsFromResource(PAGE, ROWS);
        assertEquals(solrMessage.blockFirst().isSuccess(), true);
        List<ItemDTO> listResults = solrMessage.blockFirst().getResult().getResults();
        assertTrue(listResults.size() == ROWS);
    }

    @Test
    public void whenReadingFromResourceByIdThenNotNullResponse() throws Exception {
        Mono<SolrMessageDTO> solrMessage = this.resourceClient.getResultFromResourceById(ID);
        assertNotNull(solrMessage.block());
        ItemDTO expectedResult = solrMessage.block().getResult().getResults().get(0);
        assertEquals(expectedResult.getId(), ID);
    }

    @Test(expected=KasNoSuchItem.class)
    public void whenReadingFromResourceByIdThenNoMatches() throws Exception {
        this.resourceClient.getResultFromResourceById("madeUpValue");
    }

    @Test
    public void whenReadingFromResourceByNameThenNotNullResponse() throws Exception {
        Mono<SolrMessageDTO> solrMessage = this.resourceClient.getResultFromResourceByName(NAME);
        assertNotNull(solrMessage.block());
        ItemDTO expectedResult = solrMessage.block().getResult().getResults().get(0);
        assertEquals(expectedResult.getName(), NAME);
    }

    @Test(expected=KasNoSuchItemWithThisName.class)
    public void whenReadingFromResourceByNameThenNoMatches() throws Exception {
        this.resourceClient.getResultFromResourceByName("madeUpValue");
    }

    @Test
    public void whenReadingFromResourceWithQueryThenNotNullResponse() throws Exception {
        Flux<SolrMessageDTO> solrMessage = this.resourceClient.getAllResultsThatMatchTheQuery(QUERY);
        assertEquals(solrMessage.blockFirst().isSuccess(), true);
    }

}