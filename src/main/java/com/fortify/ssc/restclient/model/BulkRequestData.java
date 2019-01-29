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


package com.fortify.ssc.restclient.model;

import java.util.Objects;
import com.fortify.ssc.restclient.model.ApiBulkRequestItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BulkRequestData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class BulkRequestData {
  @SerializedName("requests")
  private List<ApiBulkRequestItem> requests = null;

  public BulkRequestData requests(List<ApiBulkRequestItem> requests) {
    this.requests = requests;
    return this;
  }

  public BulkRequestData addRequestsItem(ApiBulkRequestItem requestsItem) {
    if (this.requests == null) {
      this.requests = new ArrayList<ApiBulkRequestItem>();
    }
    this.requests.add(requestsItem);
    return this;
  }

   /**
   * A list of bulk request items that represents requests that could have been issued independently (or use HATEOAS \&quot;response\&quot; scheme requests that map to individual requests).
   * @return requests
  **/
  @ApiModelProperty(value = "A list of bulk request items that represents requests that could have been issued independently (or use HATEOAS \"response\" scheme requests that map to individual requests).")
  public List<ApiBulkRequestItem> getRequests() {
    return requests;
  }

  public void setRequests(List<ApiBulkRequestItem> requests) {
    this.requests = requests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkRequestData bulkRequestData = (BulkRequestData) o;
    return Objects.equals(this.requests, bulkRequestData.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkRequestData {\n");
    
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
