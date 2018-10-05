/*
 * Swagger Eazy Pay
 * Dies ist die Swagger API für die App Eazy Pay, welches es ermöglicht den Usern/Kunden Bezahlvorgänge kontaktlos zu betätigen
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Zahlung
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-05T11:21:30.966+02:00")
public class Zahlung {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("userID")
  private Long userID = null;

  @SerializedName("recievedIban")
  private String recievedIban = null;

  @SerializedName("userIban")
  private String userIban = null;

  @SerializedName("ammount")
  private String ammount = null;

  @SerializedName("verwendungszweck")
  private String verwendungszweck = null;

  @SerializedName("complete")
  private Boolean complete = false;

  public Zahlung id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Zahlung userID(Long userID) {
    this.userID = userID;
    return this;
  }

   /**
   * Get userID
   * @return userID
  **/
  @ApiModelProperty(value = "")
  public Long getUserID() {
    return userID;
  }

  public void setUserID(Long userID) {
    this.userID = userID;
  }

  public Zahlung recievedIban(String recievedIban) {
    this.recievedIban = recievedIban;
    return this;
  }

   /**
   * Get recievedIban
   * @return recievedIban
  **/
  @ApiModelProperty(value = "")
  public String getRecievedIban() {
    return recievedIban;
  }

  public void setRecievedIban(String recievedIban) {
    this.recievedIban = recievedIban;
  }

  public Zahlung userIban(String userIban) {
    this.userIban = userIban;
    return this;
  }

   /**
   * Get userIban
   * @return userIban
  **/
  @ApiModelProperty(value = "")
  public String getUserIban() {
    return userIban;
  }

  public void setUserIban(String userIban) {
    this.userIban = userIban;
  }

  public Zahlung ammount(String ammount) {
    this.ammount = ammount;
    return this;
  }

   /**
   * Get ammount
   * @return ammount
  **/
  @ApiModelProperty(value = "")
  public String getAmmount() {
    return ammount;
  }

  public void setAmmount(String ammount) {
    this.ammount = ammount;
  }

  public Zahlung verwendungszweck(String verwendungszweck) {
    this.verwendungszweck = verwendungszweck;
    return this;
  }

   /**
   * Get verwendungszweck
   * @return verwendungszweck
  **/
  @ApiModelProperty(value = "")
  public String getVerwendungszweck() {
    return verwendungszweck;
  }

  public void setVerwendungszweck(String verwendungszweck) {
    this.verwendungszweck = verwendungszweck;
  }

  public Zahlung complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

   /**
   * Get complete
   * @return complete
  **/
  @ApiModelProperty(value = "")
  public Boolean isComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Zahlung zahlung = (Zahlung) o;
    return Objects.equals(this.id, zahlung.id) &&
        Objects.equals(this.userID, zahlung.userID) &&
        Objects.equals(this.recievedIban, zahlung.recievedIban) &&
        Objects.equals(this.userIban, zahlung.userIban) &&
        Objects.equals(this.ammount, zahlung.ammount) &&
        Objects.equals(this.verwendungszweck, zahlung.verwendungszweck) &&
        Objects.equals(this.complete, zahlung.complete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userID, recievedIban, userIban, ammount, verwendungszweck, complete);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Zahlung {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    recievedIban: ").append(toIndentedString(recievedIban)).append("\n");
    sb.append("    userIban: ").append(toIndentedString(userIban)).append("\n");
    sb.append("    ammount: ").append(toIndentedString(ammount)).append("\n");
    sb.append("    verwendungszweck: ").append(toIndentedString(verwendungszweck)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
