import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

<<<<<<< HEAD:Big Boy Snake.java
public class Big_Boy_Snake {
=======
public class BigBoySnake {
>>>>>>> c7f33612d7ddb6478ab26844e2fe2003db476378:Reply2023/Big Boy Snake.java
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("00-output.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
