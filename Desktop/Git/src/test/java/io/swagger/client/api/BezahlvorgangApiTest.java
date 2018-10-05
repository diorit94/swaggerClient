package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Zahlung;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BezahlvorgangApi
 */
public class BezahlvorgangApiTest {

    private BezahlvorgangApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(BezahlvorgangApi.class);
    }

    /**
     * Überprüfe ob IBAN gültig ist
     *
     * 
     */
    @Test
    public void ibanValidierungIDTest() {
        String iban = null;
        // Void response = api.ibanValidierungID(iban);

        // TODO: test validations
    }
    /**
     * Zahlungsvorgang Auslösen
     *
     * 
     */
    @Test
    public void zahlungAusloesenIDTest() {
        Zahlung body = null;
        // Void response = api.zahlungAusloesenID(body);

        // TODO: test validations
    }
}
