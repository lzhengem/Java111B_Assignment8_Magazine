import java.util.Scanner;

class TryToParseDouble{

  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    String user_input;
    Double myDouble;

    try{
      System.out.println("Type in a double");
      user_input = scan.nextLine();
      myDouble = Double.parseDouble(user_input);
    }
    catch(NumberFormatException e){
      myDouble = 0.0;
      System.out.println("You put in a bad number you get 0 now");

    }

    System.out.println("The double is " + myDouble);
  }
	

}