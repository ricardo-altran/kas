package com.altran.techtest.kas.service;

import com.altran.techtest.kas.dto.SolrMessageDTO;
import org.junit.Test;

import static org.junit.Assert.*;

public class ResourceClientImplTest {
    @Test
    public void getResourceData() throws Exception {
        IResourceClient resourceClient = new ResourceClientImpl();
        SolrMessageDTO response = resourceClient.getResourceData();
        assertNotNull(response);
    }

}