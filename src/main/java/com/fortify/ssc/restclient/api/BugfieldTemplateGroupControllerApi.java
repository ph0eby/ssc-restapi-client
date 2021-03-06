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

import com.fortify.ssc.restclient.ApiCallback;
import com.fortify.ssc.restclient.ApiClient;
import com.fortify.ssc.restclient.ApiException;
import com.fortify.ssc.restclient.ApiResponse;
import com.fortify.ssc.restclient.Configuration;
import com.fortify.ssc.restclient.Pair;
import com.fortify.ssc.restclient.ProgressRequestBody;
import com.fortify.ssc.restclient.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.fortify.ssc.restclient.model.ApiResult;
import com.fortify.ssc.restclient.model.ApiResultBugfieldTemplateGroupDto;
import com.fortify.ssc.restclient.model.ApiResultListBugfieldTemplateGroupDto;
import com.fortify.ssc.restclient.model.ApiResultVoid;
import com.fortify.ssc.restclient.model.BugfieldTemplateGroupDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BugfieldTemplateGroupControllerApi {
    private ApiClient apiClient;

    public BugfieldTemplateGroupControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BugfieldTemplateGroupControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createBugfieldTemplateGroup
     * @param data data (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createBugfieldTemplateGroupCall(BugfieldTemplateGroupDto data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;

        // create path and map variables
        String localVarPath = "/bugfieldTemplateGroups";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "FortifyToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createBugfieldTemplateGroupValidateBeforeCall(BugfieldTemplateGroupDto data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new ApiException("Missing the required parameter 'data' when calling createBugfieldTemplateGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = createBugfieldTemplateGroupCall(data, progressListener, progressRequestListener);
        return call;

    }

    /**
     * create
     * 
     * @param data data (required)
     * @return ApiResultBugfieldTemplateGroupDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultBugfieldTemplateGroupDto createBugfieldTemplateGroup(BugfieldTemplateGroupDto data) throws ApiException {
        ApiResponse<ApiResultBugfieldTemplateGroupDto> resp = createBugfieldTemplateGroupWithHttpInfo(data);
        return resp.getData();
    }

    /**
     * create
     * 
     * @param data data (required)
     * @return ApiResponse&lt;ApiResultBugfieldTemplateGroupDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultBugfieldTemplateGroupDto> createBugfieldTemplateGroupWithHttpInfo(BugfieldTemplateGroupDto data) throws ApiException {
        com.squareup.okhttp.Call call = createBugfieldTemplateGroupValidateBeforeCall(data, null, null);
        Type localVarReturnType = new TypeToken<ApiResultBugfieldTemplateGroupDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * create (asynchronously)
     * 
     * @param data data (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createBugfieldTemplateGroupAsync(BugfieldTemplateGroupDto data, final ApiCallback<ApiResultBugfieldTemplateGroupDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createBugfieldTemplateGroupValidateBeforeCall(data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultBugfieldTemplateGroupDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteBugfieldTemplateGroup
     * @param id id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteBugfieldTemplateGroupCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/bugfieldTemplateGroups/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "FortifyToken" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteBugfieldTemplateGroupValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteBugfieldTemplateGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteBugfieldTemplateGroupCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * delete
     * 
     * @param id id (required)
     * @return ApiResultVoid
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultVoid deleteBugfieldTemplateGroup(Long id) throws ApiException {
        ApiResponse<ApiResultVoid> resp = deleteBugfieldTemplateGroupWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * delete
     * 
     * @param id id (required)
     * @return ApiResponse&lt;ApiResultVoid&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultVoid> deleteBugfieldTemplateGroupWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteBugfieldTemplateGroupValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<ApiResultVoid>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * delete (asynchronously)
     * 
     * @param id id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteBugfieldTemplateGroupAsync(Long id, final ApiCallback<ApiResultVoid> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteBugfieldTemplateGroupValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultVoid>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listBugfieldTemplateGroup
     * @param fields Output fields (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listBugfieldTemplateGroupCall(String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/bugfieldTemplateGroups";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "FortifyToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listBugfieldTemplateGroupValidateBeforeCall(String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listBugfieldTemplateGroupCall(fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * list
     * 
     * @param fields Output fields (optional)
     * @return ApiResultListBugfieldTemplateGroupDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultListBugfieldTemplateGroupDto listBugfieldTemplateGroup(String fields) throws ApiException {
        ApiResponse<ApiResultListBugfieldTemplateGroupDto> resp = listBugfieldTemplateGroupWithHttpInfo(fields);
        return resp.getData();
    }

    /**
     * list
     * 
     * @param fields Output fields (optional)
     * @return ApiResponse&lt;ApiResultListBugfieldTemplateGroupDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultListBugfieldTemplateGroupDto> listBugfieldTemplateGroupWithHttpInfo(String fields) throws ApiException {
        com.squareup.okhttp.Call call = listBugfieldTemplateGroupValidateBeforeCall(fields, null, null);
        Type localVarReturnType = new TypeToken<ApiResultListBugfieldTemplateGroupDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * list (asynchronously)
     * 
     * @param fields Output fields (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listBugfieldTemplateGroupAsync(String fields, final ApiCallback<ApiResultListBugfieldTemplateGroupDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listBugfieldTemplateGroupValidateBeforeCall(fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultListBugfieldTemplateGroupDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for multiDeleteBugfieldTemplateGroup
     * @param ids A comma-separated list of resource identifiers (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call multiDeleteBugfieldTemplateGroupCall(String ids, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/bugfieldTemplateGroups";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ids", ids));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "FortifyToken" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call multiDeleteBugfieldTemplateGroupValidateBeforeCall(String ids, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new ApiException("Missing the required parameter 'ids' when calling multiDeleteBugfieldTemplateGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = multiDeleteBugfieldTemplateGroupCall(ids, progressListener, progressRequestListener);
        return call;

    }

    /**
     * multiDelete
     * 
     * @param ids A comma-separated list of resource identifiers (required)
     * @return ApiResultVoid
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultVoid multiDeleteBugfieldTemplateGroup(String ids) throws ApiException {
        ApiResponse<ApiResultVoid> resp = multiDeleteBugfieldTemplateGroupWithHttpInfo(ids);
        return resp.getData();
    }

    /**
     * multiDelete
     * 
     * @param ids A comma-separated list of resource identifiers (required)
     * @return ApiResponse&lt;ApiResultVoid&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultVoid> multiDeleteBugfieldTemplateGroupWithHttpInfo(String ids) throws ApiException {
        com.squareup.okhttp.Call call = multiDeleteBugfieldTemplateGroupValidateBeforeCall(ids, null, null);
        Type localVarReturnType = new TypeToken<ApiResultVoid>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * multiDelete (asynchronously)
     * 
     * @param ids A comma-separated list of resource identifiers (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call multiDeleteBugfieldTemplateGroupAsync(String ids, final ApiCallback<ApiResultVoid> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = multiDeleteBugfieldTemplateGroupValidateBeforeCall(ids, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultVoid>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for readBugfieldTemplateGroup
     * @param id id (required)
     * @param fields Output fields (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call readBugfieldTemplateGroupCall(Long id, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/bugfieldTemplateGroups/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "FortifyToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call readBugfieldTemplateGroupValidateBeforeCall(Long id, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling readBugfieldTemplateGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = readBugfieldTemplateGroupCall(id, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * read
     * 
     * @param id id (required)
     * @param fields Output fields (optional)
     * @return ApiResultBugfieldTemplateGroupDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultBugfieldTemplateGroupDto readBugfieldTemplateGroup(Long id, String fields) throws ApiException {
        ApiResponse<ApiResultBugfieldTemplateGroupDto> resp = readBugfieldTemplateGroupWithHttpInfo(id, fields);
        return resp.getData();
    }

    /**
     * read
     * 
     * @param id id (required)
     * @param fields Output fields (optional)
     * @return ApiResponse&lt;ApiResultBugfieldTemplateGroupDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultBugfieldTemplateGroupDto> readBugfieldTemplateGroupWithHttpInfo(Long id, String fields) throws ApiException {
        com.squareup.okhttp.Call call = readBugfieldTemplateGroupValidateBeforeCall(id, fields, null, null);
        Type localVarReturnType = new TypeToken<ApiResultBugfieldTemplateGroupDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * read (asynchronously)
     * 
     * @param id id (required)
     * @param fields Output fields (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call readBugfieldTemplateGroupAsync(Long id, String fields, final ApiCallback<ApiResultBugfieldTemplateGroupDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = readBugfieldTemplateGroupValidateBeforeCall(id, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultBugfieldTemplateGroupDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateBugfieldTemplateGroup
     * @param id id (required)
     * @param resource resource (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateBugfieldTemplateGroupCall(Long id, BugfieldTemplateGroupDto resource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = resource;

        // create path and map variables
        String localVarPath = "/bugfieldTemplateGroups/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "FortifyToken" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateBugfieldTemplateGroupValidateBeforeCall(Long id, BugfieldTemplateGroupDto resource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateBugfieldTemplateGroup(Async)");
        }
        
        // verify the required parameter 'resource' is set
        if (resource == null) {
            throw new ApiException("Missing the required parameter 'resource' when calling updateBugfieldTemplateGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = updateBugfieldTemplateGroupCall(id, resource, progressListener, progressRequestListener);
        return call;

    }

    /**
     * update
     * 
     * @param id id (required)
     * @param resource resource (required)
     * @return ApiResultBugfieldTemplateGroupDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultBugfieldTemplateGroupDto updateBugfieldTemplateGroup(Long id, BugfieldTemplateGroupDto resource) throws ApiException {
        ApiResponse<ApiResultBugfieldTemplateGroupDto> resp = updateBugfieldTemplateGroupWithHttpInfo(id, resource);
        return resp.getData();
    }

    /**
     * update
     * 
     * @param id id (required)
     * @param resource resource (required)
     * @return ApiResponse&lt;ApiResultBugfieldTemplateGroupDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultBugfieldTemplateGroupDto> updateBugfieldTemplateGroupWithHttpInfo(Long id, BugfieldTemplateGroupDto resource) throws ApiException {
        com.squareup.okhttp.Call call = updateBugfieldTemplateGroupValidateBeforeCall(id, resource, null, null);
        Type localVarReturnType = new TypeToken<ApiResultBugfieldTemplateGroupDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * update (asynchronously)
     * 
     * @param id id (required)
     * @param resource resource (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateBugfieldTemplateGroupAsync(Long id, BugfieldTemplateGroupDto resource, final ApiCallback<ApiResultBugfieldTemplateGroupDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateBugfieldTemplateGroupValidateBeforeCall(id, resource, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultBugfieldTemplateGroupDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
