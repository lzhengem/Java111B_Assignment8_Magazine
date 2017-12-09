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
        Magazine mag3 = new Magazine("Another magazine");
        MagazineList magList = new MagazineList();

        System.out.println("First Magazine:  " + mag1.toString());
        System.out.println("Second Magazine:  " + mag2.toString());
        System.out.println(mag1.compareTo(mag2));
        magList.insert(mag1);
        magList.insert(mag3);
        magList.insert(mag2);
        System.out.println(magList);

        System.out.println("Removing " + mag3 + ": ");
        magList.delete(mag3);
        System.out.println(magList);
        
        System.out.println("Removing " + mag2 + ": ");
        magList.delete(mag2);
        System.out.println(magList);

        System.out.println("Removing " + mag2 + ": ");
        magList.delete(mag2);
        System.out.println(magList);



    }
}
