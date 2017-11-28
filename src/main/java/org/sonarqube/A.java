package org.sonarqube;

public class A {
  String message = "foo";

  // TODO fix this
  public String foo() {
    message = null;
    message.length();

    return message;
  }

}
