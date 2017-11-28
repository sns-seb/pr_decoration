package org.sonarqube;

public class A {
  String message = "foo";

  public String foo() {
    this.message = null;
    message.length();

    return message;
  }

  public String bar() {
    // my tailor is rich


    return "bouh";
  }
}
