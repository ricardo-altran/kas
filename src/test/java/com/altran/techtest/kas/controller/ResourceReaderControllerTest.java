package com.altran.techtest.kas.controller;

import com.altran.techtest.kas.dto.ItemDTO;
import com.altran.techtest.kas.dto.ResultDTO;
import com.altran.techtest.kas.dto.SolrMessageDTO;
import com.altran.techtest.kas.service.IResourceClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest(ResourceReaderController.class)
public class ResourceReaderControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private IResourceClient resourceReaderServiceMock;

    @Test
    public void whenGetDataFromResouceThenReturnListOfResults() throws Exception {
        SolrMessageDTO solrMessageDTO = new SolrMessageDTO();
        ResultDTO resultDTO = new ResultDTO();
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setId("testItemResult");
        List<ItemDTO> itemDTOList = new ArrayList<>();
        itemDTOList.add(itemDTO);
        resultDTO.setResults(itemDTOList);
        solrMessageDTO.setSuccess(true);
        solrMessageDTO.setResult(resultDTO);

        given(resourceReaderServiceMock.getAllResultsFromResource()).willReturn(itemDTOList);

        mvc.perform(get("/results")
                .contentType(MediaType.APPLICATION_JSON));
    }

}