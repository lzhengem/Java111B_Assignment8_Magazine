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
        // if the list is empty, or if the mag is suppose to be before the first magazine in the list, insert in first place
        if (list == null || mag.compareTo(list.magazine) < 0){
            magNode.next = list;
            list = magNode;
        }
        else{
            // loop through the list until mag should be before current node's next node
            boolean magInserted = false;
            while (magInserted != true){
                // if current node is the last node or if mag should be before the next node, insert it after the current node
                if (currentNode.next == null || mag.compareTo(currentNode.next.magazine) < 0){
                    magNode.next = currentNode.next;
                    currentNode.next = magNode;
                    magInserted = true;
                }
                // loop through to the next node
                else
                    currentNode = currentNode.next;
            }
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
            // if deleting the first magazine, set list to the next node
            if (magNode.magazine.compareTo(currentNode.magazine) == 0)
                list = currentNode.next;
            else{
                // if the next node isnt the node to be removed, keep moving to the next node
                while(currentNode.next != null && magNode.magazine.compareTo(currentNode.next.magazine) != 0){
                    currentNode = currentNode.next;
                }
                // if we have not reached the end without finding the node, then the next node is the one that needs to be removed
                if(currentNode.next != null)
                    currentNode.next = currentNode.next.next;
            }
        }
    }
}