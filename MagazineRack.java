//*******************************************************************
//  MagazineRack.java       Author: Lewis/Loftus
//
//  Driver to exercise the MagazineList collection.
//  modified LZHENG, and QDLI on 12/8/17
//  created do loop to prompt user addition to Rack 2017-11-29
//*******************************************************************
import java.util.Scanner;
import java.io.*;
public class MagazineRack
{   
    //----------------------------------------------------------------
    //  Creates a MagazineList object
    //  adds magazine based on user input.
    //----------------------------------------------------------------
    public static void main(String[] args)
    {    
        MagazineList rack = new MagazineList();
        Scanner scan = new Scanner(System.in);
        String newTitle;
        String newLine; //records the data that is read in the text file
        // String userAnswer;
        File file = new File("mags.dat");
        boolean keepEnteringTitle = true;

        
        //Read file
        try{ 
            System.out.println("Here are your magazine titles:");
            Scanner read = new Scanner(file);
            for(int j=1; read.hasNextLine();j++){
                newLine = read.nextLine();
                System.out.println(j +":"+newLine);
                rack.add(new Magazine(newLine));
                }
             read.close();
            }
        catch(IOException e){
            System.out.println("Sorry no magazine exist in that file");
        }
        
        while(keepEnteringTitle){
            System.out.print("\nWould you like to enter a title: (y/n): ");
            // userAnswer = 
            if (scan.nextLine().equals("y")){
                System.out.println("\nEnter title: ");
                newTitle = scan.nextLine();
                rack.add(new Magazine(newTitle));
            }else
                keepEnteringTitle = false;
          }
 
        System.out.println("Current Magazine Titles: \n");
        System.out.println(rack);
        
        //Write the file
        try{
            FileWriter writeFile = new FileWriter(file, true);
            BufferedWriter fileInput = new BufferedWriter(writeFile);
            PrintWriter fileOutPut = new PrintWriter(file);
            fileOutPut.print(rack);
            fileOutPut.close();
        }
        catch(IOException error){
            System.out.println("File is opened in another program, cannot write file" );

    }
}
}