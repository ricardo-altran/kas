package com.altran.techtest.kas.service;

import com.altran.techtest.kas.dto.SolrMessageDTO;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ResourceClientImplTest {
    private IResourceClient resourceClient;

    @Before
    public void setUp() {
        this.resourceClient = new ResourceClientImpl();
    }

    @Test
    public void whenReadingFromResourceThenNotNullResponse() throws Exception {
        SolrMessageDTO response = this.resourceClient.getResourceData();
        assertTrue(response.isSuccess());
        assertNotNull(response.getHelp());
        assertNotNull(response.getResult());
    }

}