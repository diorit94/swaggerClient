package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Zahlung;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BezahlvorgangApi {
  /**
   * Überprüfe ob IBAN gültig ist
   * 
   * @param iban IBAN Validierung wurde durchgeführt (required)
   * @return Call&lt;Void&gt;
   */
  @GET("iban_validierung")
  Call<Void> ibanValidierungID(
    @retrofit2.http.Query("iban") String iban
  );

  /**
   * Zahlungsvorgang Auslösen
   * 
   * @param body Die Zahlung die ausgelöst wurde (required)
   * @return Call&lt;Void&gt;
   */
  @POST("zahlung_ausloesen")
  Call<Void> zahlungAusloesenID(
    @retrofit2.http.Body Zahlung body
  );

}
