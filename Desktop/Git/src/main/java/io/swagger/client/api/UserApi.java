package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserApi {
  /**
   * Einen neuen User erstellen
   * 
   * @param body User Objekt wurde erstellt (required)
   * @return Call&lt;Void&gt;
   */
  @POST("user_erstellen")
  Call<Void> createUserID(
    @retrofit2.http.Body User body
  );

  /**
   * Einen vorhandenen User löschen
   * 
   * @param userID Die ID die gebraucht wird um einen User zu löschen (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("user_loeschen")
  Call<Void> deleteUserID(
    @retrofit2.http.Path("userID") Integer userID
  );

  /**
   * Informationen über den User
   * 
   * @param userID Die ID des users der gebraucht wird (required)
   * @return Call&lt;User&gt;
   */
  @GET("user")
  Call<User> getUserInfoID(
    @retrofit2.http.Path("userID") Integer userID
  );

  /**
   * Das einlogen des Users im Account
   * 
   * @param username Der Nutzername fürs Login (required)
   * @param password Das Password für die Login operation (required)
   * @return Call&lt;Void&gt;
   */
  @GET("login_user")
  Call<Void> loginUserID(
    @retrofit2.http.Query("username") String username, @retrofit2.http.Query("password") String password
  );

  /**
   * Das auslogen des Users im Account
   * 
   * @return Call&lt;Void&gt;
   */
  @GET("logout_user")
  Call<Void> logoutUserID();
    

  /**
   * Informationen über den User updaten
   * 
   * @param username Der name der verändert werden soll (required)
   * @param body Der geupdatete User (required)
   * @return Call&lt;Void&gt;
   */
  @PUT("user_update")
  Call<Void> updateUserID(
    @retrofit2.http.Path("username") String username, @retrofit2.http.Body User body
  );

}
