import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.*;
import java.util.Scanner;

public class Big_Boy_Snake {

  public static int[][] read_matrix(){

    try{
      FileReader file= new FileReader("00-example.txt");

      Scanner scan = new Scanner(file);
      int x = scan.nextInt();
      int y = scan.nextInt();
      int[][]theMatrix=new int[y][x];
      
      scan.nextLine();
      scan.nextLine();
  
    
      while(scan.hasNextLine()) { 
        //String line = scan.nextLine();
        //System.out.println(line);

        //int line = scan.nextInt();
        //System.out.println(line + " a");
        for(int i=0;i<y; i++){
          for(int j=0;j<x; j++){
        	char check = scan.next().charAt(0);
        	int tmp = check == '*' ? Integer.MIN_VALUE : ((int)check) - 48;
            //System.out.println(i + " " + j + " " + tmp);
            theMatrix[i][j]=tmp;
          }
          //System.out.println("New line ");
          scan.nextLine();
          //scan.nextLine();
          
        }

      }
      scan.close();
      return theMatrix;
    }catch (IOException e) {
      System.out.println("File not found.");
      e.printStackTrace();
      
    }

    int[][]newArr=new int[1][2];
    return newArr;
  }

  public static int[] Snakeu(){
    try{
      FileReader file= new FileReader("00-example.txt");

      Scanner scan = new Scanner(file);
      scan.nextInt();
      scan.nextInt();
      
      int snake_length = scan.nextInt();
      int[] snakeu= new int[snake_length];
      scan.nextLine();
      
      String line = scan.nextLine();
      String[] result = line.split(" ");
      
      for(int i=0;i<snake_length; i++){
        snakeu[i]=Integer.parseInt(result[i]);
      }

      scan.close();
      return snakeu;
    }catch (IOException e) {
      System.out.println("File not found.");
      e.printStackTrace();
      
    }
    int[] failure= new int[1];

    return failure;
  }

  public static void write_text_file(int[][] Matrixione){
    try {
      FileWriter myWriter = new FileWriter("00-output.txt");
      for(int i=0;i<Matrixione.length;i++){
        for(int j=0;j<Matrixione[0].length;j++)
        {
          myWriter.write(Matrixione[i][j]+" ");
        }

    }
      
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
    
    int[][] testMatrix=read_matrix();
    write_text_file(testMatrix);
    
    
  }
}
