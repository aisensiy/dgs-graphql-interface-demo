package com.example.dgsgraphql.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Org implements com.example.dgsgraphql.types.Party {
  private String id;

  private String name;

  private User owner;

  private List<User> memebers;

  public Org() {
  }

  public Org(String id, String name, User owner, List<User> memebers) {
    this.id = id;
    this.name = name;
    this.owner = owner;
    this.memebers = memebers;
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

  public User getOwner() {
    return owner;
  }

  public void setOwner(User owner) {
    this.owner = owner;
  }

  public List<User> getMemebers() {
    return memebers;
  }

  public void setMemebers(List<User> memebers) {
    this.memebers = memebers;
  }

  @Override
  public String toString() {
    return "Org{" + "id='" + id + "'," +"name='" + name + "'," +"owner='" + owner + "'," +"memebers='" + memebers + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Org that = (Org) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(owner, that.owner) &&
                            java.util.Objects.equals(memebers, that.memebers);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, owner, memebers);
  }

  public static com.example.dgsgraphql.types.Org.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private String name;

    private User owner;

    private List<User> memebers;

    public Org build() {
                  com.example.dgsgraphql.types.Org result = new com.example.dgsgraphql.types.Org();
                      result.id = this.id;
          result.name = this.name;
          result.owner = this.owner;
          result.memebers = this.memebers;
                      return result;
    }

    public com.example.dgsgraphql.types.Org.Builder id(String id) {
      this.id = id;
      return this;
    }

    public com.example.dgsgraphql.types.Org.Builder name(String name) {
      this.name = name;
      return this;
    }

    public com.example.dgsgraphql.types.Org.Builder owner(User owner) {
      this.owner = owner;
      return this;
    }

    public com.example.dgsgraphql.types.Org.Builder memebers(List<User> memebers) {
      this.memebers = memebers;
      return this;
    }
  }
}
