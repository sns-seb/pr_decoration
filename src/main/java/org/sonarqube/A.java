package org.sonarqube;

public class A {
  String message = "foo";

  // fix this
  public String foo() {
    message = null;
    message.length();

    return message;
  }

}
