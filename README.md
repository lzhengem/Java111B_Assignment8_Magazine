Magazine Assignment - Due 12/14

1) due 12/4 CL
- Modify Magazine class
  Implement Comparable interface and override compareTo method. 
  compareTo method determines whether one Magazine object's title 
  comes before antoher lexicographically (ascii). Only change needed.
- Modify Magazine Rack class
  Instead of hardcoding values, create loop to prompt and read titles from 
  user input as long as user wants to continue.

2) due 12/7 QD
- Modify Magazine Rack class
  open and read titles from text file mags.dat inserting values into the list.
  if mag.dat does not exist inform user. Use a try/catch block for this code.
- Modify MagazineList class
  Add deleteAll() method to delete all magazines from list. 


3) due 12/11 LZ
- Modify MagazineList class
  Add an insert method/operation into the MagazineList class. Your insert method 
  will insert each magazine lexigraphically (ascii order) into the list (after 
  each insert the list is alphabetized so no need to sort).  Base the processing 
  of the insert method on calls to the compareTo method you will add to the Magazine 
  class. Hint:  Be careful when inserting at the beginning of the list (the head node).

  Note: The add method already included in MagazineList adds magazines to the END of the 
        list (the tail of the list). This method will not change.

- Modify MagazineList class
  Add delete() method which searches for magazine and removes it from list. 
  Method should not delete an already empty list.

4) testing due 12/13
- Sample output 2
	Here are your magazines:
	Woodworking Today

	Would you like to enter a title: (y/n): y
	Enter title: United Way
	Would you like to enter a title: (y/n): y
	Enter a title: Wired
	Would you like to enter a title: (y/n): n

	Here are your magazines:
	United Way
	Wired
	Woodworking Today

	Enter a title to delete: Wired

	Here are your magazines:
	United Way
	Woodworking Today	


5) Submission due 12/14

	1) zip the files MagazineRack.java, MagazineList.java and Magazine.java
           and your external text file mags.dat into a file MagazineRack.zip 

        2) Check you have included algorithm (in driver program and used 
           javadoc style comments in all classes

        3)  Submit MagazineRack.zip onto Canvas


