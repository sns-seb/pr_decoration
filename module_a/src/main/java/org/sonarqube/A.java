package org.sonarqube;

public class A {
  String message = "foo";

  // TODO fix this
  public String foo() {
    message = null;
    message.length();
    if (bar() < doh()) {
      unused1();
    }
    return message;
  }

  public Integer bar() {
    return 42;
  }

  public double doh() {
    return 12.5;
  }

  private static String unused1() {
    return "will_be_unused";
  }

  private int lastBarBeforeTheEndOfTime() {
    return -666;
  }

}
