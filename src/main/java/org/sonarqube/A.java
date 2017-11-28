package org.sonarqube;

public class A {
  String message = "foo";

  public String foo() {
    this.message = null;
    message.length();

    return message;
  }

}
