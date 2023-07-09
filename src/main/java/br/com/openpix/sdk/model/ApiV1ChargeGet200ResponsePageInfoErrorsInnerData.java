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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;

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
 * ApiV1ChargeGet200ResponsePageInfoErrorsInnerData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-09T10:01:02.014525-03:00[America/Sao_Paulo]")
public class ApiV1ChargeGet200ResponsePageInfoErrorsInnerData {
  public static final String SERIALIZED_NAME_SKIP = "skip";
  @SerializedName(SERIALIZED_NAME_SKIP)
  private BigDecimal skip;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private BigDecimal limit;

  public ApiV1ChargeGet200ResponsePageInfoErrorsInnerData() {
  }

  public ApiV1ChargeGet200ResponsePageInfoErrorsInnerData skip(BigDecimal skip) {
    
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


  public ApiV1ChargeGet200ResponsePageInfoErrorsInnerData limit(BigDecimal limit) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1ChargeGet200ResponsePageInfoErrorsInnerData apiV1ChargeGet200ResponsePageInfoErrorsInnerData = (ApiV1ChargeGet200ResponsePageInfoErrorsInnerData) o;
    return Objects.equals(this.skip, apiV1ChargeGet200ResponsePageInfoErrorsInnerData.skip) &&
        Objects.equals(this.limit, apiV1ChargeGet200ResponsePageInfoErrorsInnerData.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skip, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1ChargeGet200ResponsePageInfoErrorsInnerData {\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
    openapiFields.add("skip");
    openapiFields.add("limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiV1ChargeGet200ResponsePageInfoErrorsInnerData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiV1ChargeGet200ResponsePageInfoErrorsInnerData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV1ChargeGet200ResponsePageInfoErrorsInnerData is not found in the empty JSON string", ApiV1ChargeGet200ResponsePageInfoErrorsInnerData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiV1ChargeGet200ResponsePageInfoErrorsInnerData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV1ChargeGet200ResponsePageInfoErrorsInnerData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV1ChargeGet200ResponsePageInfoErrorsInnerData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV1ChargeGet200ResponsePageInfoErrorsInnerData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV1ChargeGet200ResponsePageInfoErrorsInnerData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV1ChargeGet200ResponsePageInfoErrorsInnerData.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV1ChargeGet200ResponsePageInfoErrorsInnerData>() {
           @Override
           public void write(JsonWriter out, ApiV1ChargeGet200ResponsePageInfoErrorsInnerData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV1ChargeGet200ResponsePageInfoErrorsInnerData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiV1ChargeGet200ResponsePageInfoErrorsInnerData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiV1ChargeGet200ResponsePageInfoErrorsInnerData
  * @throws IOException if the JSON string is invalid with respect to ApiV1ChargeGet200ResponsePageInfoErrorsInnerData
  */
  public static ApiV1ChargeGet200ResponsePageInfoErrorsInnerData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV1ChargeGet200ResponsePageInfoErrorsInnerData.class);
  }

 /**
  * Convert an instance of ApiV1ChargeGet200ResponsePageInfoErrorsInnerData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
