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
 * Payment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-09T10:01:02.014525-03:00[America/Sao_Paulo]")
public class Payment {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private BigDecimal value;

  public static final String SERIALIZED_NAME_DESTINATION_ALIAS = "destinationAlias";
  @SerializedName(SERIALIZED_NAME_DESTINATION_ALIAS)
  private String destinationAlias;

  public static final String SERIALIZED_NAME_CORRELATION_I_D = "correlationID";
  @SerializedName(SERIALIZED_NAME_CORRELATION_I_D)
  private String correlationID;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  /**
   * payment status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CREATED("CREATED"),
    
    FAILED("FAILED"),
    
    CONFIRMED("CONFIRMED"),
    
    DENIED("DENIED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_SOURCE_ACCOUNT_ID = "sourceAccountId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ACCOUNT_ID)
  private String sourceAccountId;

  public Payment() {
  }

  public Payment value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * value of the requested payment in cents
   * @return value
  **/
  @javax.annotation.Nullable
  public BigDecimal getValue() {
    return value;
  }


  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public Payment destinationAlias(String destinationAlias) {
    
    this.destinationAlias = destinationAlias;
    return this;
  }

   /**
   * the pix key the payment should be sent to
   * @return destinationAlias
  **/
  @javax.annotation.Nullable
  public String getDestinationAlias() {
    return destinationAlias;
  }


  public void setDestinationAlias(String destinationAlias) {
    this.destinationAlias = destinationAlias;
  }


  public Payment correlationID(String correlationID) {
    
    this.correlationID = correlationID;
    return this;
  }

   /**
   * Your correlation ID to keep track of this payment
   * @return correlationID
  **/
  @javax.annotation.Nullable
  public String getCorrelationID() {
    return correlationID;
  }


  public void setCorrelationID(String correlationID) {
    this.correlationID = correlationID;
  }


  public Payment comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * the comment that will be send alongisde your payment
   * @return comment
  **/
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public Payment status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * payment status
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Payment sourceAccountId(String sourceAccountId) {
    
    this.sourceAccountId = sourceAccountId;
    return this;
  }

   /**
   * the id of the payment source account
   * @return sourceAccountId
  **/
  @javax.annotation.Nullable
  public String getSourceAccountId() {
    return sourceAccountId;
  }


  public void setSourceAccountId(String sourceAccountId) {
    this.sourceAccountId = sourceAccountId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.value, payment.value) &&
        Objects.equals(this.destinationAlias, payment.destinationAlias) &&
        Objects.equals(this.correlationID, payment.correlationID) &&
        Objects.equals(this.comment, payment.comment) &&
        Objects.equals(this.status, payment.status) &&
        Objects.equals(this.sourceAccountId, payment.sourceAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, destinationAlias, correlationID, comment, status, sourceAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    destinationAlias: ").append(toIndentedString(destinationAlias)).append("\n");
    sb.append("    correlationID: ").append(toIndentedString(correlationID)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sourceAccountId: ").append(toIndentedString(sourceAccountId)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("destinationAlias");
    openapiFields.add("correlationID");
    openapiFields.add("comment");
    openapiFields.add("status");
    openapiFields.add("sourceAccountId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Payment
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Payment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Payment is not found in the empty JSON string", Payment.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Payment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Payment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("destinationAlias") != null && !jsonObj.get("destinationAlias").isJsonNull()) && !jsonObj.get("destinationAlias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destinationAlias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destinationAlias").toString()));
      }
      if ((jsonObj.get("correlationID") != null && !jsonObj.get("correlationID").isJsonNull()) && !jsonObj.get("correlationID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `correlationID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("correlationID").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("sourceAccountId") != null && !jsonObj.get("sourceAccountId").isJsonNull()) && !jsonObj.get("sourceAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceAccountId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Payment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Payment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Payment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Payment.class));

       return (TypeAdapter<T>) new TypeAdapter<Payment>() {
           @Override
           public void write(JsonWriter out, Payment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Payment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Payment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Payment
  * @throws IOException if the JSON string is invalid with respect to Payment
  */
  public static Payment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Payment.class);
  }

 /**
  * Convert an instance of Payment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

