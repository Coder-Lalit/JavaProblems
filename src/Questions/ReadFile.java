package Questions;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("/Users/ldas/TestData/companies.csv");
            Scanner myReader = new Scanner(myObj);
            StringBuilder temp = new StringBuilder();
            int count = 0,newChar =65,line=0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                line++;
                //System.out.println(data);
                if((int) data.charAt(0) == newChar && count<100){
                    temp.append(line).append("\"").append(data.replaceAll("\"","")).append("\",");
                    count++;
                }
                else if(count==100){
                    count=0;
                    newChar++;
                }

            }
            myReader.close();
            System.out.println(temp);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}