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
import br.com.openpix.sdk.model.ApiV1ChargeGet200ResponsePageInfoErrorsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
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
 * ApiV1ChargeGet200ResponsePageInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-09T10:01:02.014525-03:00[America/Sao_Paulo]")
public class ApiV1ChargeGet200ResponsePageInfo {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<ApiV1ChargeGet200ResponsePageInfoErrorsInner> errors;

  public static final String SERIALIZED_NAME_SKIP = "skip";
  @SerializedName(SERIALIZED_NAME_SKIP)
  private BigDecimal skip;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private BigDecimal limit;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private BigDecimal totalCount;

  public static final String SERIALIZED_NAME_HAS_PREVIOUS_PAGE = "hasPreviousPage";
  @SerializedName(SERIALIZED_NAME_HAS_PREVIOUS_PAGE)
  private Boolean hasPreviousPage;

  public static final String SERIALIZED_NAME_HAS_NEXT_PAGE = "hasNextPage";
  @SerializedName(SERIALIZED_NAME_HAS_NEXT_PAGE)
  private Boolean hasNextPage;

  public ApiV1ChargeGet200ResponsePageInfo() {
  }

  public ApiV1ChargeGet200ResponsePageInfo errors(List<ApiV1ChargeGet200ResponsePageInfoErrorsInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public ApiV1ChargeGet200ResponsePageInfo addErrorsItem(ApiV1ChargeGet200ResponsePageInfoErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  public List<ApiV1ChargeGet200ResponsePageInfoErrorsInner> getErrors() {
    return errors;
  }


  public void setErrors(List<ApiV1ChargeGet200ResponsePageInfoErrorsInner> errors) {
    this.errors = errors;
  }


  public ApiV1ChargeGet200ResponsePageInfo skip(BigDecimal skip) {
    
    this.skip = skip;
    return this;
  }

   /**
   * Get skip
   * @return skip
  **/
  @javax.annotation.Nullable
  public BigDecimal getSkip() {
    return skip;
  }


  public void setSkip(BigDecimal skip) {
    this.skip = skip;
  }


  public ApiV1ChargeGet200ResponsePageInfo limit(BigDecimal limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  public BigDecimal getLimit() {
    return limit;
  }


  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }


  public ApiV1ChargeGet200ResponsePageInfo totalCount(BigDecimal totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  public BigDecimal getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(BigDecimal totalCount) {
    this.totalCount = totalCount;
  }


  public ApiV1ChargeGet200ResponsePageInfo hasPreviousPage(Boolean hasPreviousPage) {
    
    this.hasPreviousPage = hasPreviousPage;
    return this;
  }

   /**
   * Get hasPreviousPage
   * @return hasPreviousPage
  **/
  @javax.annotation.Nullable
  public Boolean getHasPreviousPage() {
    return hasPreviousPage;
  }


  public void setHasPreviousPage(Boolean hasPreviousPage) {
    this.hasPreviousPage = hasPreviousPage;
  }


  public ApiV1ChargeGet200ResponsePageInfo hasNextPage(Boolean hasNextPage) {
    
    this.hasNextPage = hasNextPage;
    return this;
  }

   /**
   * Get hasNextPage
   * @return hasNextPage
  **/
  @javax.annotation.Nullable
  public Boolean getHasNextPage() {
    return hasNextPage;
  }


  public void setHasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1ChargeGet200ResponsePageInfo apiV1ChargeGet200ResponsePageInfo = (ApiV1ChargeGet200ResponsePageInfo) o;
    return Objects.equals(this.errors, apiV1ChargeGet200ResponsePageInfo.errors) &&
        Objects.equals(this.skip, apiV1ChargeGet200ResponsePageInfo.skip) &&
        Objects.equals(this.limit, apiV1ChargeGet200ResponsePageInfo.limit) &&
        Objects.equals(this.totalCount, apiV1ChargeGet200ResponsePageInfo.totalCount) &&
        Objects.equals(this.hasPreviousPage, apiV1ChargeGet200ResponsePageInfo.hasPreviousPage) &&
        Objects.equals(this.hasNextPage, apiV1ChargeGet200ResponsePageInfo.hasNextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, skip, limit, totalCount, hasPreviousPage, hasNextPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1ChargeGet200ResponsePageInfo {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    hasPreviousPage: ").append(toIndentedString(hasPreviousPage)).append("\n");
    sb.append("    hasNextPage: ").append(toIndentedString(hasNextPage)).append("\n");
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
    openapiFields.add("errors");
    openapiFields.add("skip");
    openapiFields.add("limit");
    openapiFields.add("totalCount");
    openapiFields.add("hasPreviousPage");
    openapiFields.add("hasNextPage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiV1ChargeGet200ResponsePageInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiV1ChargeGet200ResponsePageInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV1ChargeGet200ResponsePageInfo is not found in the empty JSON string", ApiV1ChargeGet200ResponsePageInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiV1ChargeGet200ResponsePageInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV1ChargeGet200ResponsePageInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
        if (jsonArrayerrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
          }

          // validate the optional field `errors` (array)
          for (int i = 0; i < jsonArrayerrors.size(); i++) {
            ApiV1ChargeGet200ResponsePageInfoErrorsInner.validateJsonElement(jsonArrayerrors.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV1ChargeGet200ResponsePageInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV1ChargeGet200ResponsePageInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV1ChargeGet200ResponsePageInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV1ChargeGet200ResponsePageInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV1ChargeGet200ResponsePageInfo>() {
           @Override
           public void write(JsonWriter out, ApiV1ChargeGet200ResponsePageInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV1ChargeGet200ResponsePageInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiV1ChargeGet200ResponsePageInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiV1ChargeGet200ResponsePageInfo
  * @throws IOException if the JSON string is invalid with respect to ApiV1ChargeGet200ResponsePageInfo
  */
  public static ApiV1ChargeGet200ResponsePageInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV1ChargeGet200ResponsePageInfo.class);
  }

 /**
  * Convert an instance of ApiV1ChargeGet200ResponsePageInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

