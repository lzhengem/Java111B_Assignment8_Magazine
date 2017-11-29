//********************************************************************
//  Magazine.java       Author: Lewis/Loftus
//
//  Represents a single magazine.
//  modified CLIN, LZHENG, and QDLI on 2017-11-29
//  implemented compare to method to compare titles between two magazines.
//
////********************************************************************

public class Magazine implements Comparable<Magazine>
{
    private String title;

    //-----------------------------------------------------------------
    //  Sets up the new magazine with its title.
    //-----------------------------------------------------------------
    public Magazine(String newTitle)
    {
        title = newTitle;
    }

    //-----------------------------------------------------------------
    //  Returns this magazine as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        return title;
    }

    //-----------------------------------------------------------------
    // determines whether one magazine object's title comes before another (ascii) 
    // 1. need to convert each character to ascii array. 
    // 2. compare character by character.
    // 3. first character which is different should be returned. 
    //-----------------------------------------------------------------
    public int compareTo(Magazine other)
    {
       return title.compareTo(other.toString());
    }

}
