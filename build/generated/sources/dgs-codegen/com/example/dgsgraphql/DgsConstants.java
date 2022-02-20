package com.example.dgsgraphql;

import java.lang.String;

public class DgsConstants {
  public static class TASK {
    public static final String TYPE_NAME = "Task";

    public static final String Id = "id";

    public static final String Owner = "owner";

    public static final String Name = "name";

    public static final String Command = "command";
  }

  public static class LAB {
    public static final String TYPE_NAME = "Lab";

    public static final String Id = "id";

    public static final String Owner = "owner";

    public static final String Name = "name";

    public static final String Environment = "environment";
  }

  public static class USER {
    public static final String TYPE_NAME = "User";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Username = "username";
  }

  public static class ORG {
    public static final String TYPE_NAME = "Org";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Owner = "owner";

    public static final String Memebers = "memebers";
  }

  public static class JOB {
    public static final String TYPE_NAME = "Job";

    public static final String Id = "id";

    public static final String Owner = "owner";

    public static final String Name = "name";
  }

  public static class PARTY {
    public static final String TYPE_NAME = "Party";

    public static final String Id = "id";

    public static final String Name = "name";
  }
}
