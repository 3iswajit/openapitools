package com.code.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Holds UserModel details
 */

@Schema(name = "UserModel", description = "Holds UserModel details")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-15T20:36:28.222+05:30[Asia/Kolkata]")
public class UserModel {

  @JsonProperty("name")
  private String name;

  @JsonProperty("email")
  private String email;

  public UserModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Holds name details
   * @return name
  */
  
  @Schema(name = "name", description = "Holds name details", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserModel email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Holds Email details
   * @return email
  */
  
  @Schema(name = "email", description = "Holds Email details", required = false)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserModel userModel = (UserModel) o;
    return Objects.equals(this.name, userModel.name) &&
        Objects.equals(this.email, userModel.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
}

