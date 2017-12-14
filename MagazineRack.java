//*******************************************************************
//  MagazineRack.java       Author: Lewis/Loftus
//
//  Driver to exercise the MagazineList collection.
//  modified LZHENG, and QDLI on 12/8/17
//  created do loop to prompt user addition to Rack 2017-11-29
//*******************************************************************


/*
    * Algorithm:
    * 1) Read from mags.dat and display the recorded magazines
    * 2) Add user inputted magazine into magazine rack
    * 3) delete any magazine inputed by user from magazine rack
    * 4) output into mags.dat the new magazine rack
*/
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
        String newTitle,deleteTitle;
        String newLine; //records the data that is read in the text file
        // String userAnswer;
        File file = new File("mags.dat");
        boolean keepEnteringTitle = true;

        // Try to Read file
        try{ 
            Scanner read = new Scanner(file);
            System.out.println("Here are your magazine titles:");
            for(int j=1; read.hasNextLine();j++){
                newLine = read.nextLine();
                System.out.println(j +":"+newLine);
                rack.insert(new Magazine(newLine));
                }
             read.close();
            }
        // let user know if the file is not found
        catch(FileNotFoundException e){
            System.out.println(file +" does not exist.");
        }
        
        // ask user if they would like to enter more magazines
        while(keepEnteringTitle){
            System.out.print("\nWould you like to enter a title: (y/n): ");
            
            if (scan.nextLine().toLowerCase().equals("y")){
                System.out.print("\nEnter title: ");
                newTitle = scan.nextLine();
                rack.insert(new Magazine(newTitle));
            }else
                keepEnteringTitle = false;
        }
    
        // print out the magazines
        System.out.println("Here are your magazines: \n");
        System.out.println(rack);

        // ask user if they would like to delete any magazines
        System.out.print("Enter a title to delete: ");
        deleteTitle = scan.nextLine();
        rack.delete(new Magazine(deleteTitle));

        // print out the new magazine rack
        System.out.println("Here are your magazines: \n");
        System.out.println(rack);
        
        //Write the file to mags.dat
        try{
            PrintWriter fileOutPut = new PrintWriter(file);
            fileOutPut.print(rack);
            fileOutPut.close();
        }
        // let user know that the file is open elsewhere and unable to be written to
        catch(IOException error){
            System.out.println("File is opened in another program, cannot write file" );
        }
    }
}