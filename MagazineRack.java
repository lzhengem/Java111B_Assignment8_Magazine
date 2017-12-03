//*******************************************************************
//  MagazineRack.java       Author: Lewis/Loftus
//
//  Driver to exercise the MagazineList collection.
//  modified CLIN, LZHENG, and QDLI on 2017-11-29
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
        File file = new File("mag.text");
        
        
        do {
             System.out.println("\nPlease type the title of a Magazine: (Hit enter if done)");
              newTitle = scan.nextLine();
              rack.add(new Magazine(newTitle));
        } while (!(newTitle.isEmpty()));
 
        System.out.println("Current Magazine Titles: \n");
        System.out.println(rack);
        
        //Write the file
        try{
            PrintWriter fileOutPut = new PrintWriter(file);
            fileOutPut.println(rack);
            fileOutPut.close();
        }
        catch(IOException error){
            System.out.println("File cannot be empty");
        }
        
        //Read file
        try{
            Scanner read = new Scanner(file);
            String one = read.nextLine();
            String two = read.nextLine();
            String three = read.nextLine();
            System.out.println(one + "\n" + two + "\n" +three);
        }
        catch(IOException e){
            System.out.println("File does not exsit");
        }
    }
}