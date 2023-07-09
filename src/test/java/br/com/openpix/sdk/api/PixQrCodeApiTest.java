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


package br.com.openpix.sdk.api;

import br.com.openpix.sdk.ApiException;
import br.com.openpix.sdk.model.ApiV1AccountAccountIdGet400Response;
import br.com.openpix.sdk.model.ApiV1PixQrCodeStaticIdGet200Response;
import br.com.openpix.sdk.model.ApiV1QrcodeStaticGet200Response;
import br.com.openpix.sdk.model.ApiV1QrcodeStaticPost200Response;
import br.com.openpix.sdk.model.PixQrCodePayload;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PixQrCodeApi
 */
@Disabled
public class PixQrCodeApiTest {

    private final PixQrCodeApi api = new PixQrCodeApi();

    /**
     * Get one Pix QrCode
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1PixQrCodeStaticIdGetTest() throws ApiException {
        String id = null;
        ApiV1PixQrCodeStaticIdGet200Response response = api.apiV1PixQrCodeStaticIdGet(id);
        // TODO: test validations
    }

    /**
     * Get a list of Pix QrCodes
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1QrcodeStaticGetTest() throws ApiException {
        ApiV1QrcodeStaticGet200Response response = api.apiV1QrcodeStaticGet();
        // TODO: test validations
    }

    /**
     * Create a new Pix QrCode Static
     *
     * Endpoint to create a new Pix QrCode Static
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1QrcodeStaticPostTest() throws ApiException {
        PixQrCodePayload pixQrCodePayload = null;
        ApiV1QrcodeStaticPost200Response response = api.apiV1QrcodeStaticPost(pixQrCodePayload);
        // TODO: test validations
    }

}