/*
 * Woovi
 * A Woovi é uma Plataforma de Gestão de Pagamentos. Para utilizar nossa API você deve acessar  __[https://api.woovi.com/](https://api.woovi.com/)__ e somente o mesmo. A Woovi não aceita subdominios para a API.  Veja como configurar seu acesso a nossa API [aqui](https://developers.woovi.com/docs/apis/api-getting-started).
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package br.com.openpix.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import br.com.openpix.sdk.model.ApiV1ChargeGet200ResponsePageInfo;
import br.com.openpix.sdk.model.Customer;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import br.com.openpix.sdk.JSON;

/**
 * ApiV1CustomerGet200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-09T10:01:02.014525-03:00[America/Sao_Paulo]")
public class ApiV1CustomerGet200Response {
  public static final String SERIALIZED_NAME_CUSTOMERS = "customers";
  @SerializedName(SERIALIZED_NAME_CUSTOMERS)
  private List<Customer> customers;

  public static final String SERIALIZED_NAME_PAGE_INFO = "pageInfo";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private ApiV1ChargeGet200ResponsePageInfo pageInfo;

  public ApiV1CustomerGet200Response() {
  }

  public ApiV1CustomerGet200Response customers(List<Customer> customers) {
    
    this.customers = customers;
    return this;
  }

  public ApiV1CustomerGet200Response addCustomersItem(Customer customersItem) {
    if (this.customers == null) {
      this.customers = new ArrayList<>();
    }
    this.customers.add(customersItem);
    return this;
  }

   /**
   * Get customers
   * @return customers
  **/
  @javax.annotation.Nullable
  public List<Customer> getCustomers() {
    return customers;
  }


  public void setCustomers(List<Customer> customers) {
    this.customers = customers;
  }


  public ApiV1CustomerGet200Response pageInfo(ApiV1ChargeGet200ResponsePageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public ApiV1ChargeGet200ResponsePageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(ApiV1ChargeGet200ResponsePageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1CustomerGet200Response apiV1CustomerGet200Response = (ApiV1CustomerGet200Response) o;
    return Objects.equals(this.customers, apiV1CustomerGet200Response.customers) &&
        Objects.equals(this.pageInfo, apiV1CustomerGet200Response.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customers, pageInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1CustomerGet200Response {\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("customers");
    openapiFields.add("pageInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiV1CustomerGet200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiV1CustomerGet200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV1CustomerGet200Response is not found in the empty JSON string", ApiV1CustomerGet200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiV1CustomerGet200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV1CustomerGet200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("customers") != null && !jsonObj.get("customers").isJsonNull()) {
        JsonArray jsonArraycustomers = jsonObj.getAsJsonArray("customers");
        if (jsonArraycustomers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("customers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `customers` to be an array in the JSON string but got `%s`", jsonObj.get("customers").toString()));
          }

          // validate the optional field `customers` (array)
          for (int i = 0; i < jsonArraycustomers.size(); i++) {
            Customer.validateJsonElement(jsonArraycustomers.get(i));
          };
        }
      }
      // validate the optional field `pageInfo`
      if (jsonObj.get("pageInfo") != null && !jsonObj.get("pageInfo").isJsonNull()) {
        ApiV1ChargeGet200ResponsePageInfo.validateJsonElement(jsonObj.get("pageInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV1CustomerGet200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV1CustomerGet200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV1CustomerGet200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV1CustomerGet200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV1CustomerGet200Response>() {
           @Override
           public void write(JsonWriter out, ApiV1CustomerGet200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV1CustomerGet200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiV1CustomerGet200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiV1CustomerGet200Response
  * @throws IOException if the JSON string is invalid with respect to ApiV1CustomerGet200Response
  */
  public static ApiV1CustomerGet200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV1CustomerGet200Response.class);
  }

 /**
  * Convert an instance of ApiV1CustomerGet200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

