package com.altran.techtest.kas.controller;

import com.altran.techtest.kas.dto.ItemDTO;
import com.altran.techtest.kas.service.IResourceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResourceReaderController {
    @Autowired
    private IResourceClient resourceReaderService;

    /**
     * Function to return the list of {@link ItemDTO} stored in
     * the remote API resource.
     * @return Data Transfer Object which depicts the list of {@link ItemDTO}.
     */
    @GetMapping("/getDataFromResource")
    public List<ItemDTO> getDataFromResource() {
        return resourceReaderService.getResourceData().getResult().getResults();
    }

}
