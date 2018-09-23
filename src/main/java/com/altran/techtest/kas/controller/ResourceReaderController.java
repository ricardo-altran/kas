package com.altran.techtest.kas.controller;

import com.altran.techtest.kas.dto.ItemDTO;
import com.altran.techtest.kas.dto.SolrMessageDTO;
import com.altran.techtest.kas.service.IResourceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ResourceReaderController {
    @Autowired
    private IResourceClient resourceReaderService;

    /**
     * Function to return the list of {@link ItemDTO} stored in
     * the remote API resource.
     * @return Data Transfer Object which depicts the list of {@link ItemDTO}.
     */
    @GetMapping("/result")
    public Flux<SolrMessageDTO> getAllResultsFromResource(
            @RequestParam(defaultValue = "0", required = false) Integer page,
            @RequestParam(defaultValue = "10", required = false) Integer rows) {
        return resourceReaderService.getAllResultsFromResource(page, rows);
    }

    /**
     * Function to return an specific {@link ItemDTO} stored in
     * the remote API resource.
     * @param id the unique identifier which specifies which item is desired.
     * @return Data Transfer Object which depicts the specific {@link ItemDTO}.
     */
    @GetMapping("/result/{id}")
    public Mono<SolrMessageDTO> getResultFromResourceById(@PathVariable String id) {
        return resourceReaderService.getResultFromResourceById(id);
    }

}
