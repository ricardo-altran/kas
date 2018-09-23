package com.altran.techtest.kas.controller;

import com.altran.techtest.kas.service.IResourceClient;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(ResourceReaderController.class)
public class ResourceReaderControllerTest {
    private static final Integer PAGE = 0;
    private static final Integer ROWS = 10;

    @Autowired
    private MockMvc mvc;

    @MockBean
    private IResourceClient resourceReaderServiceMock;

//    @Test
//    public void whenGetDataFromResouceThenReturnListOfResults() throws Exception {
//        SolrMessageDTO solrMessageDTO = new SolrMessageDTO();
//        ResultDTO resultDTO = new ResultDTO();
//        ItemDTO itemDTO = new ItemDTO();
//        itemDTO.setId("testItemResult");
//        List<ItemDTO> itemDTOList = new ArrayList<>();
//        itemDTOList.add(itemDTO);
//        resultDTO.setResults(itemDTOList);
//        solrMessageDTO.setSuccess(true);
//        solrMessageDTO.setResult(resultDTO);
//
//        given(resourceReaderServiceMock.getAllResultsFromResource(PAGE, ROWS)).willReturn(solrMessageDTO);
//
//        mvc.perform(get("/results")
//                .contentType(MediaType.APPLICATION_JSON));
//    }

}