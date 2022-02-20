package com.example.dgsgraphql.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = User.class, name = "User"),
    @JsonSubTypes.Type(value = Org.class, name = "Org")
})
public interface Party {
  String getId();

  void setId(String id);

  String getName();

  void setName(String name);
}
