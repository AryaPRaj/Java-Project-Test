import java.io.File;
import java.io.FileWriter;  
import java.io.FileNotFoundException; 
import java.util.Scanner;
import java.io.IOException;
public class DemoClass {
  public static void main(String[] args) {
    try {

      Scanner sc =new Scanner(System.in);
      System.out.println("Enter your file path: ");
      String filepath = sc.nextLine();
            System.out.println("Enter your Search Key: ");
      String searchKey = sc.nextLine();

      File myObj = new File(filepath);
       String updatedsearchKey="" ;
     

      System.out.print(updatedsearchKey);
      String data = "";
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
         data = myReader.nextLine();
      }
        myReader.close();
      for(int i=0;searchKey.length()>i;i++)
      {

        if (searchKey.charAt(i) == ' ') {
          updatedsearchKey = updatedsearchKey + " ";
        } else {
          updatedsearchKey = updatedsearchKey + "#";
        }
      }

      String replacedString = data.replaceAll(searchKey,updatedsearchKey);

      System.out.println(replacedString);

       try {
          FileWriter myWriter = new FileWriter("C:/Users/USER/Desktop/DemoPage/DemoPage/OutputFile.txt");
          myWriter.write(replacedString);
          myWriter.close();
          System.out.println("Successfully write to the file.");
        } catch (IOException e) {
        System.out.println("File write error !");
        e.printStackTrace();
    }
   

    
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}