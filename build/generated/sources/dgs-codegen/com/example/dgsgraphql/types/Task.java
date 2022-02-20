package com.example.dgsgraphql.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Task implements com.example.dgsgraphql.types.Job {
  private String id;

  private Party owner;

  private String name;

  private String command;

  public Task() {
  }

  public Task(String id, Party owner, String name, String command) {
    this.id = id;
    this.owner = owner;
    this.name = name;
    this.command = command;
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

  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  @Override
  public String toString() {
    return "Task{" + "id='" + id + "'," +"owner='" + owner + "'," +"name='" + name + "'," +"command='" + command + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task that = (Task) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(owner, that.owner) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(command, that.command);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, owner, name, command);
  }

  public static com.example.dgsgraphql.types.Task.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private Party owner;

    private String name;

    private String command;

    public Task build() {
                  com.example.dgsgraphql.types.Task result = new com.example.dgsgraphql.types.Task();
                      result.id = this.id;
          result.owner = this.owner;
          result.name = this.name;
          result.command = this.command;
                      return result;
    }

    public com.example.dgsgraphql.types.Task.Builder id(String id) {
      this.id = id;
      return this;
    }

    public com.example.dgsgraphql.types.Task.Builder owner(Party owner) {
      this.owner = owner;
      return this;
    }

    public com.example.dgsgraphql.types.Task.Builder name(String name) {
      this.name = name;
      return this;
    }

    public com.example.dgsgraphql.types.Task.Builder command(String command) {
      this.command = command;
      return this;
    }
  }
}
