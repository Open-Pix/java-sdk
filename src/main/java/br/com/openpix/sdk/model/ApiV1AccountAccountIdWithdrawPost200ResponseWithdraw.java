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
import br.com.openpix.sdk.model.CompanyBankAccount;
import br.com.openpix.sdk.model.WithdrawTransaction;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-09T10:01:02.014525-03:00[America/Sao_Paulo]")
public class ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private CompanyBankAccount account;

  public static final String SERIALIZED_NAME_TRANSACTION = "transaction";
  @SerializedName(SERIALIZED_NAME_TRANSACTION)
  private WithdrawTransaction transaction;

  public ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw() {
  }

  public ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw account(CompanyBankAccount account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable
  public CompanyBankAccount getAccount() {
    return account;
  }


  public void setAccount(CompanyBankAccount account) {
    this.account = account;
  }


  public ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw transaction(WithdrawTransaction transaction) {
    
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @javax.annotation.Nullable
  public WithdrawTransaction getTransaction() {
    return transaction;
  }


  public void setTransaction(WithdrawTransaction transaction) {
    this.transaction = transaction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw apiV1AccountAccountIdWithdrawPost200ResponseWithdraw = (ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw) o;
    return Objects.equals(this.account, apiV1AccountAccountIdWithdrawPost200ResponseWithdraw.account) &&
        Objects.equals(this.transaction, apiV1AccountAccountIdWithdrawPost200ResponseWithdraw.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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
    openapiFields.add("account");
    openapiFields.add("transaction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw is not found in the empty JSON string", ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw>() {
           @Override
           public void write(JsonWriter out, ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw
  * @throws IOException if the JSON string is invalid with respect to ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw
  */
  public static ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw.class);
  }

 /**
  * Convert an instance of ApiV1AccountAccountIdWithdrawPost200ResponseWithdraw to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

