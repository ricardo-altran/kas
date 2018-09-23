package com.altran.techtest.kas.service;

import com.altran.techtest.kas.dto.ItemDTO;

import java.util.List;

/**
 * This interface defines the service for gathering information
 * from the service API.
 */
public interface IResourceClient {

    List<ItemDTO> getAllResultsFromResource(Integer page, Integer rows);
    ItemDTO getResultFromResourceById(String id);
}
