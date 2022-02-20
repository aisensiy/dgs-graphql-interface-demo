package com.example.dgsgraphql.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Lab implements com.example.dgsgraphql.types.Job {
  private String id;

  private Party owner;

  private String name;

  private String environment;

  public Lab() {
  }

  public Lab(String id, Party owner, String name, String environment) {
    this.id = id;
    this.owner = owner;
    this.name = name;
    this.environment = environment;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Party getOwner() {
    return owner;
  }

  public void setOwner(Party owner) {
    this.owner = owner;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  @Override
  public String toString() {
    return "Lab{" + "id='" + id + "'," +"owner='" + owner + "'," +"name='" + name + "'," +"environment='" + environment + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lab that = (Lab) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(owner, that.owner) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(environment, that.environment);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, owner, name, environment);
  }

  public static com.example.dgsgraphql.types.Lab.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private Party owner;

    private String name;

    private String environment;

    public Lab build() {
                  com.example.dgsgraphql.types.Lab result = new com.example.dgsgraphql.types.Lab();
                      result.id = this.id;
          result.owner = this.owner;
          result.name = this.name;
          result.environment = this.environment;
                      return result;
    }

    public com.example.dgsgraphql.types.Lab.Builder id(String id) {
      this.id = id;
      return this;
    }

    public com.example.dgsgraphql.types.Lab.Builder owner(Party owner) {
      this.owner = owner;
      return this;
    }

    public com.example.dgsgraphql.types.Lab.Builder name(String name) {
      this.name = name;
      return this;
    }

    public com.example.dgsgraphql.types.Lab.Builder environment(String environment) {
      this.environment = environment;
      return this;
    }
  }
}
