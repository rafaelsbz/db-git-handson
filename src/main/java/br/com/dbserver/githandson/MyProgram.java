package br.com.dbserver.githandson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/**
 * This is my program and it does as I command.
 * (Even when I tell it to do stupid things...)
 * @author bezerrar@dbserver.com.br
 */
public class MyProgram {

  /**
   * This is how my program greets someone.
   */
  public String greet(String someone) {
    return String.format("Hello %s", someone);
  }

  /**
   * This is how my program says bye.
   */
  public String sayGoodbyeTo(String someone) {
    return String.format("Goodbye, %s", someone);
  }

  /**
   * Reads all the files from a given path and returns their contents as a String.
   * Contents from different files are separated by a linebreak (\n).
   * @throws IOException 
   */
  public String readAllFiles(String path) throws IOException {
    return Files.walk(Paths.get(path))
        .filter(Files::isRegularFile)
        .map(this::fileToString)
        .collect(Collectors.joining("\n\n"));
  }

  private String fileToString(Path path) {
    try {
      String format = "##Contents of '%s':\n%s";
      String fileAsString = Files.readAllLines(path).stream().collect(Collectors.joining("\n"));
      return String.format(format, path.toString(), fileAsString);
    } catch (IOException e) {
      return String.format("Error reading %s", path);
    }
  }

}
