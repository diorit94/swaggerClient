# UserApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserID**](UserApi.md#createUserID) | **POST** user_erstellen | Einen neuen User erstellen
[**deleteUserID**](UserApi.md#deleteUserID) | **DELETE** user_loeschen | Einen vorhandenen User löschen
[**getUserInfoID**](UserApi.md#getUserInfoID) | **GET** user | Informationen über den User
[**loginUserID**](UserApi.md#loginUserID) | **GET** login_user | Das einlogen des Users im Account
[**logoutUserID**](UserApi.md#logoutUserID) | **GET** logout_user | Das auslogen des Users im Account
[**updateUserID**](UserApi.md#updateUserID) | **PUT** user_update | Informationen über den User updaten


<a name="createUserID"></a>
# **createUserID**
> Void createUserID(body)

Einen neuen User erstellen



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
User body = new User(); // User | User Objekt wurde erstellt
try {
    Void result = apiInstance.createUserID(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createUserID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)| User Objekt wurde erstellt |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteUserID"></a>
# **deleteUserID**
> Void deleteUserID(userID)

Einen vorhandenen User löschen



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userID = 56; // Integer | Die ID die gebraucht wird um einen User zu löschen
try {
    Void result = apiInstance.deleteUserID(userID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userID** | **Integer**| Die ID die gebraucht wird um einen User zu löschen |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getUserInfoID"></a>
# **getUserInfoID**
> User getUserInfoID(userID)

Informationen über den User



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userID = 56; // Integer | Die ID des users der gebraucht wird
try {
    User result = apiInstance.getUserInfoID(userID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserInfoID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userID** | **Integer**| Die ID des users der gebraucht wird |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="loginUserID"></a>
# **loginUserID**
> Void loginUserID(username, password)

Das einlogen des Users im Account



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String username = "username_example"; // String | Der Nutzername fürs Login
String password = "password_example"; // String | Das Password für die Login operation
try {
    Void result = apiInstance.loginUserID(username, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#loginUserID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| Der Nutzername fürs Login |
 **password** | **String**| Das Password für die Login operation |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="logoutUserID"></a>
# **logoutUserID**
> Void logoutUserID()

Das auslogen des Users im Account



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
try {
    Void result = apiInstance.logoutUserID();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#logoutUserID");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateUserID"></a>
# **updateUserID**
> Void updateUserID(username, body)

Informationen über den User updaten



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String username = "username_example"; // String | Der name der verändert werden soll
User body = new User(); // User | Der geupdatete User
try {
    Void result = apiInstance.updateUserID(username, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUserID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| Der name der verändert werden soll |
 **body** | [**User**](User.md)| Der geupdatete User |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

