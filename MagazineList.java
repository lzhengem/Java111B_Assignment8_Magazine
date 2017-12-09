//*******************************************************************
//  MagazineList.java       Author: Lewis/Loftus
//
//  Represents a collection of magazines.
//*******************************************************************

public class MagazineList
{
    private MagazineNode list;

    //----------------------------------------------------------------
    //  Sets up an initially empty list of magazines.
    //----------------------------------------------------------------
    public MagazineList()
    {
        list = null;
    }

    //----------------------------------------------------------------
    //  Creates a new MagazineNode object and adds it to the end of
    //  the linked list.
    //----------------------------------------------------------------
    public void add(Magazine mag)
    {
        MagazineNode node = new MagazineNode(mag);
        MagazineNode current;

        if (list == null)
            list = node;
        else
        {
            current = list;
            while (current.next != null)
                current = current.next;
            current.next = node;
        }
    }

    //----------------------------------------------------------------
    //  Returns this list of magazines as a string.
    //----------------------------------------------------------------
    public String toString()
    {
        String result = "";

        MagazineNode current = list;

        while (current != null)
        {
            result += current.magazine + "\n";
            current = current.next;
        }

        return result;
    }

    // loops through the list, if mag's ascii is greater than current mag, then insert it after it
    public void insert(Magazine mag){
        MagazineNode currentNode = list;
        MagazineNode magNode = new MagazineNode(mag);
        // if the list is null or if the mag is suppose to be before the first mag in the list, then insert it in front
        if (list == null || (mag.compareTo(currentNode.magazine)) < 0){
            magNode.next = list;
            list = magNode;
        }
        // if mag is suppose to be before the currentNodes's next magazine, then insert mag between currentNode and currentNode's next node
        else{
            while((mag.compareTo(currentNode.next.magazine)) < 0){
                currentNode = currentNode.next;
            }
            magNode.next = currentNode.next;
            currentNode.next = magNode;
        }

    }

    //*****************************************************************
    //  An inner class that represents a node in the magazine list.
    //  The public variables are accessed by the MagazineList class.
    //*****************************************************************
    private class MagazineNode
    {
        public Magazine magazine;
        public MagazineNode next;

        //--------------------------------------------------------------
        //  Sets up the node
        //--------------------------------------------------------------
        public MagazineNode(Magazine mag)
        {
            magazine = mag;
            next = null;
        }
    }
    
    //Deletes all magazines
    public void deleteAll(){
        list = null;
    }

    // Delete a specific mag from list
    public void delete(Magazine mag){
        MagazineNode currentNode = list;
        MagazineNode magNode = new MagazineNode(mag);
        if(list != null){
            if (magNode.magazine.compareTo(currentNode.magazine) == 0)
                list = currentNode.next;
            else{
                while(currentNode.next != null && magNode.magazine.compareTo(currentNode.next.magazine) != 0){
                    currentNode = currentNode.next;
                }
                if(currentNode != null)
                    currentNode.next = currentNode.next.next;
            }
        }
    }
}