/**
 * un commentaire en début de classe
 */
package org.sonarqube;

public class A {
  String message = "foo";

  public String foo() {
    message = null;
    message.length();

    return message;
  }

  public String bar() {
    // my tailor is rich


    return "bouh";
  }
}
