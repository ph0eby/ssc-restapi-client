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
import com.fortify.ssc.restclient.model.ApiResultListReportLibrary;
import com.fortify.ssc.restclient.model.ApiResultReportLibrary;
import com.fortify.ssc.restclient.model.ApiResultVoid;
import com.fortify.ssc.restclient.model.ReportLibrary;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportLibraryControllerApi
 */
@Ignore
public class ReportLibraryControllerApiTest {

    private final ReportLibraryControllerApi api = new ReportLibraryControllerApi();

    
    /**
     * create
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReportLibraryTest() throws ApiException {
        ReportLibrary resource = null;
        ApiResultReportLibrary response = api.createReportLibrary(resource);

        // TODO: test validations
    }
    
    /**
     * delete
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteReportLibraryTest() throws ApiException {
        Long id = null;
        ApiResultVoid response = api.deleteReportLibrary(id);

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
    public void listReportLibraryTest() throws ApiException {
        String fields = null;
        Integer start = null;
        Integer limit = null;
        ApiResultListReportLibrary response = api.listReportLibrary(fields, start, limit);

        // TODO: test validations
    }
    
    /**
     * multiDelete
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void multiDeleteReportLibraryTest() throws ApiException {
        String ids = null;
        ApiResultVoid response = api.multiDeleteReportLibrary(ids);

        // TODO: test validations
    }
    
    /**
     * read
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readReportLibraryTest() throws ApiException {
        Long id = null;
        String fields = null;
        ApiResultReportLibrary response = api.readReportLibrary(id, fields);

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
    public void updateReportLibraryTest() throws ApiException {
        Long id = null;
        ReportLibrary resource = null;
        ApiResultReportLibrary response = api.updateReportLibrary(id, resource);

        // TODO: test validations
    }
    
}
