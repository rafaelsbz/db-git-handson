package br.com.dbserver.githandson;

import java.io.IOException;

/**
 * Runs the application.
 * @author bezerrar@dbserver.com.br
 *
 */
public class Main {

  public static void main(String[] args) throws IOException {
    MyProgram myprogram = new MyProgram();
    String theWorld = "World";
    System.out.println(myprogram.greet(theWorld));
    System.out.println(myprogram.readAllFiles("./src/main/resources/"));
    System.out.println(myprogram.sayGoodbyeTo(theWorld));
  }

}
