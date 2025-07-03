import java.util.*;

class Main {
  public static void main(String[] args) {
     
    Scanner scan = new Scanner(System.in);
    String answer = "";

    // Ask the user for some pet info
    // Read answer: answer = scan.nextLine();
    // Construct a Pet object with data
    Pet p1 = new Pet();
    
    while (!answer.equals("q"))
    {
        System.out.println("Game menu");
        System.out.println("1. Choice 1: Feed your pet.");
        System.out.println("2. Choice 2: Let your pet take a nap.");
        System.out.println("3. Choice 3: Take your pet for a walk.");
        System.out.println("Choose a number option above or q to quit: ");
        answer = scan.nextLine();
        if (answer.equals("1")){
           // call method 1 in your Pet object
          p1.Feed();
         }
  // Add more if statements to call method 2 and 3
        if (answer.equals("2")){
          p1.Sleep();
        }
        
        if (answer.equals("3")){
          p1.Walk();
        }
      
        
  } // end while loop
 } // end main
} // end class