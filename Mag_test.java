//*******************************************************************
//  MagazineRack.java       Author: Lewis/Loftus
//
//  Driver to exercise the MagazineList collection.
//*******************************************************************

public class Mag_test
{
    //----------------------------------------------------------------
    //  Creates a MagazineList object, adds several magazines to the
    //  list, then prints it.
    //----------------------------------------------------------------
    public static void main(String[] args)
    {   //Testing Part 1. - compareto method
        Magazine mag1 = new Magazine("Student");
        Magazine mag2 = new Magazine("student affair");
        System.out.println("First Magazine:  " + mag1.toString());
        System.out.println("Second Magazine:  " + mag2.toString());
        System.out.println(mag1.compareTo(mag2));


    }
}
