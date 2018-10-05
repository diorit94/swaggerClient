# BezahlvorgangApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ibanValidierungID**](BezahlvorgangApi.md#ibanValidierungID) | **GET** iban_validierung | Überprüfe ob IBAN gültig ist
[**zahlungAusloesenID**](BezahlvorgangApi.md#zahlungAusloesenID) | **POST** zahlung_ausloesen | Zahlungsvorgang Auslösen


<a name="ibanValidierungID"></a>
# **ibanValidierungID**
> Void ibanValidierungID(iban)

Überprüfe ob IBAN gültig ist



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BezahlvorgangApi;


BezahlvorgangApi apiInstance = new BezahlvorgangApi();
String iban = "iban_example"; // String | IBAN Validierung wurde durchgeführt
try {
    Void result = apiInstance.ibanValidierungID(iban);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BezahlvorgangApi#ibanValidierungID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iban** | **String**| IBAN Validierung wurde durchgeführt |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="zahlungAusloesenID"></a>
# **zahlungAusloesenID**
> Void zahlungAusloesenID(body)

Zahlungsvorgang Auslösen



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BezahlvorgangApi;


BezahlvorgangApi apiInstance = new BezahlvorgangApi();
Zahlung body = new Zahlung(); // Zahlung | Die Zahlung die ausgelöst wurde
try {
    Void result = apiInstance.zahlungAusloesenID(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BezahlvorgangApi#zahlungAusloesenID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Zahlung**](Zahlung.md)| Die Zahlung die ausgelöst wurde |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

