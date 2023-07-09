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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Type of the application that you want to register. Each of this has some kind of permissions.
 */
@JsonAdapter(ApplicationEnumTypePayload.Adapter.class)
public enum ApplicationEnumTypePayload {
  
  API("API"),
  
  PLUGIN("PLUGIN"),
  
  ORACLE("ORACLE");

  private String value;

  ApplicationEnumTypePayload(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ApplicationEnumTypePayload fromValue(String value) {
    for (ApplicationEnumTypePayload b : ApplicationEnumTypePayload.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ApplicationEnumTypePayload> {
    @Override
    public void write(final JsonWriter jsonWriter, final ApplicationEnumTypePayload enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ApplicationEnumTypePayload read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ApplicationEnumTypePayload.fromValue(value);
    }
  }
}

