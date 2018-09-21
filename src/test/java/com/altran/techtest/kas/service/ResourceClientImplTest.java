package com.altran.techtest.kas.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class ResourceClientImplTest {
    @Test
    public void getResourceData() throws Exception {
        IResourceClient resourceClient = new ResourceClientImpl();
        String response = resourceClient.getResourceData();
        assertNotNull(response);
    }

}