/*
 * Fortify Software Security Center API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1:18.20
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.fortify.ssc.restclient.api;

import com.fortify.ssc.restclient.ApiException;
import com.fortify.ssc.restclient.model.ApiResult;
import com.fortify.ssc.restclient.model.ApiResultCustomTag;
import com.fortify.ssc.restclient.model.ApiResultListCustomTag;
import com.fortify.ssc.restclient.model.CustomTag;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomTagOfProjectVersionControllerApi
 */
@Ignore
public class CustomTagOfProjectVersionControllerApiTest {

    private final CustomTagOfProjectVersionControllerApi api = new CustomTagOfProjectVersionControllerApi();

    
    /**
     * create
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCustomTagOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        CustomTag resource = null;
        ApiResultCustomTag response = api.createCustomTagOfProjectVersion(parentId, resource);

        // TODO: test validations
    }
    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCustomTagOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        String fields = null;
        Integer start = null;
        Integer limit = null;
        String q = null;
        String orderby = null;
        Boolean includeall = null;
        ApiResultListCustomTag response = api.listCustomTagOfProjectVersion(parentId, fields, start, limit, q, orderby, includeall);

        // TODO: test validations
    }
    
    /**
     * updateCollection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCollectionCustomTagOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        List<CustomTag> data = null;
        ApiResultListCustomTag response = api.updateCollectionCustomTagOfProjectVersion(parentId, data);

        // TODO: test validations
    }
    
    /**
     * update
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomTagOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        Long id = null;
        CustomTag data = null;
        ApiResultCustomTag response = api.updateCustomTagOfProjectVersion(parentId, id, data);

        // TODO: test validations
    }
    
}