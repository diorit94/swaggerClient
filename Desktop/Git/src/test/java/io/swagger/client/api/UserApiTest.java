package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
public class UserApiTest {

    private UserApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UserApi.class);
    }

    /**
     * Einen neuen User erstellen
     *
     * 
     */
    @Test
    public void createUserIDTest() {
        User body = null;
        // Void response = api.createUserID(body);

        // TODO: test validations
    }
    /**
     * Einen vorhandenen User löschen
     *
     * 
     */
    @Test
    public void deleteUserIDTest() {
        Integer userID = null;
        // Void response = api.deleteUserID(userID);

        // TODO: test validations
    }
    /**
     * Informationen über den User
     *
     * 
     */
    @Test
    public void getUserInfoIDTest() {
        Integer userID = null;
        // User response = api.getUserInfoID(userID);

        // TODO: test validations
    }
    /**
     * Das einlogen des Users im Account
     *
     * 
     */
    @Test
    public void loginUserIDTest() {
        String username = null;
        String password = null;
        // Void response = api.loginUserID(username, password);

        // TODO: test validations
    }
    /**
     * Das auslogen des Users im Account
     *
     * 
     */
    @Test
    public void logoutUserIDTest() {
        // Void response = api.logoutUserID();

        // TODO: test validations
    }
    /**
     * Informationen über den User updaten
     *
     * 
     */
    @Test
    public void updateUserIDTest() {
        String username = null;
        User body = null;
        // Void response = api.updateUserID(username, body);

        // TODO: test validations
    }
}
