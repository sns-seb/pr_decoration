package org.sonarqube;

public class A {
  String message = "foo";

  public String foo() {
    message = null;
    message.length();

    return message;
  }

}
