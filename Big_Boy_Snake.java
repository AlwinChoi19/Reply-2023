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
      int[][]newArr=new int[x][y];
      
      scan.nextLine();
      scan.nextLine();
  
    
      while(scan.hasNextLine()) { 
        String line = scan.nextLine();
        String[] result = line.split(" ");
/*
        int line = scan.nextInt();
        System.out.println(line);*/
        for(int i=0;i<x-1; i++){
          for(int j=0;j<y-1; j++){
            System.out.println(result[i]);
            if(result[i]=="*"){
              newArr[i][j]=Integer.MIN_VALUE;
            }else{
              newArr[i][j]=Integer.parseInt(result[i]);
            }
            
          }
          //scan.nextLine();
          
        }

      }

    }catch (IOException e) {
      System.out.println("File not found.");
      e.printStackTrace();
      
    }

    int[][]newArr=new int[1][2];
    return newArr;
  }

  public static void write_text_file(){
    try {
      FileWriter myWriter = new FileWriter("00-output.txt");
      myWriter.write("whatever man!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
    
    read_matrix();
            
    
    
  }
}
