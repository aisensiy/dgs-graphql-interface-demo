package com.example.dgsgraphql.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class User implements com.example.dgsgraphql.types.Party {
  private String id;

  private String name;

  private String username;

  public User() {
  }

  public User(String id, String name, String username) {
    this.id = id;
    this.name = name;
    this.username = username;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public String toString() {
    return "User{" + "id='" + id + "'," +"name='" + name + "'," +"username='" + username + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(username, that.username);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, username);
  }

  public static com.example.dgsgraphql.types.User.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private String name;

    private String username;

    public User build() {
                  com.example.dgsgraphql.types.User result = new com.example.dgsgraphql.types.User();
                      result.id = this.id;
          result.name = this.name;
          result.username = this.username;
                      return result;
    }

    public com.example.dgsgraphql.types.User.Builder id(String id) {
      this.id = id;
      return this;
    }

    public com.example.dgsgraphql.types.User.Builder name(String name) {
      this.name = name;
      return this;
    }

    public com.example.dgsgraphql.types.User.Builder username(String username) {
      this.username = username;
      return this;
    }
  }
}
