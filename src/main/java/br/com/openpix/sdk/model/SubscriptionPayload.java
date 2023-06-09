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
import br.com.openpix.sdk.model.SubscriptionPayloadCustomer;
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
 * SubscriptionPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-09T10:01:02.014525-03:00[America/Sao_Paulo]")
public class SubscriptionPayload {
  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private SubscriptionPayloadCustomer customer;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private BigDecimal value;

  public static final String SERIALIZED_NAME_DAY_GENERATE_CHARGE = "dayGenerateCharge";
  @SerializedName(SERIALIZED_NAME_DAY_GENERATE_CHARGE)
  private BigDecimal dayGenerateCharge = new BigDecimal("5");

  public SubscriptionPayload() {
  }

  public SubscriptionPayload customer(SubscriptionPayloadCustomer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nonnull
  public SubscriptionPayloadCustomer getCustomer() {
    return customer;
  }


  public void setCustomer(SubscriptionPayloadCustomer customer) {
    this.customer = customer;
  }


  public SubscriptionPayload value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value in cents of this subscription
   * @return value
  **/
  @javax.annotation.Nonnull
  public BigDecimal getValue() {
    return value;
  }


  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public SubscriptionPayload dayGenerateCharge(BigDecimal dayGenerateCharge) {
    
    this.dayGenerateCharge = dayGenerateCharge;
    return this;
  }

   /**
   * Day of the month that the charges will be generated. Maximun of 27.
   * minimum: 0
   * maximum: 27
   * @return dayGenerateCharge
  **/
  @javax.annotation.Nullable
  public BigDecimal getDayGenerateCharge() {
    return dayGenerateCharge;
  }


  public void setDayGenerateCharge(BigDecimal dayGenerateCharge) {
    this.dayGenerateCharge = dayGenerateCharge;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPayload subscriptionPayload = (SubscriptionPayload) o;
    return Objects.equals(this.customer, subscriptionPayload.customer) &&
        Objects.equals(this.value, subscriptionPayload.value) &&
        Objects.equals(this.dayGenerateCharge, subscriptionPayload.dayGenerateCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, value, dayGenerateCharge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPayload {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    dayGenerateCharge: ").append(toIndentedString(dayGenerateCharge)).append("\n");
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
    openapiFields.add("customer");
    openapiFields.add("value");
    openapiFields.add("dayGenerateCharge");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("customer");
    openapiRequiredFields.add("value");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SubscriptionPayload
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SubscriptionPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriptionPayload is not found in the empty JSON string", SubscriptionPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubscriptionPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubscriptionPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubscriptionPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `customer`
      SubscriptionPayloadCustomer.validateJsonElement(jsonObj.get("customer"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionPayload>() {
           @Override
           public void write(JsonWriter out, SubscriptionPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionPayload
  * @throws IOException if the JSON string is invalid with respect to SubscriptionPayload
  */
  public static SubscriptionPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionPayload.class);
  }

 /**
  * Convert an instance of SubscriptionPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

