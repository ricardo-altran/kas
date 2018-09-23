package com.altran.techtest.kas.service;

import com.altran.techtest.kas.dto.ItemDTO;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class ResourceClientImplTest {
    private IResourceClient resourceClient;

    @Before
    public void setUp() {
        this.resourceClient = new ResourceClientImpl();
    }

    @Test
    public void whenReadingFromResourceThenNotNullResponse() throws Exception {
        List<ItemDTO> itemDTOList = this.resourceClient.getAllResultsFromResource();
        assertNotNull(itemDTOList);
    }

}