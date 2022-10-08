// import java.util.Scanner;


public class Einstiegsbeispiel {
    public static void main(String[] args) {
      // This is comment
      // System.out.println("Hello world!");
  
      // //   Variables
      // // Integer
      // int x = 123; //Initialisation
  
      // // String
      // String left = "Hello";
      // String right = "World";
  
      // System.out.println("This is left side " +left);
      // System.out.println("This is the right side "+right);
  
      // // Printing strings with variables
      // System.out.println("This is a nice value of "+x);
  
      // // User input
  
      // // Defining a scanner - watch the import at the top!
      // Scanner scanner = new Scanner(System.in);
  
      // // Asking user to inpout smthn
      // System.out.println("How old are you?");
      // // Scanning the text from user
      // String age = scanner.nextLine();
      // // Displaying the line
      // System.out.println("You are "+age+" years old.");
  
      // scanner.close();
  
  
      // If statements
  
      // int home = 12;
  
      // if(home>=15){
      //   System.out.println("The number of homes is "+home);
  
      // }else{
      //   System.out.println("The number of houses is not 15!");
      // }
  
    // Arrays
    
    // Define an array
    int[] numbers = {4,4};
    // Define the second array
    int[] numbers2 = {5,9};
    // Access the values of array
    // int result = numbers[2] * numbers2[1];
    // Display an array
    // System.out.println(result);
    
    // For loops
    // for (int i = 0; i <= 10; i++) {
    //   System.out.println(i);
  
    // }
  
    // Testing the for loop
    skalar(numbers, numbers2);
    
  
    // Methods (Functions in Python)
  
  
    }
  
    private static void skalar(int[] numbers, int[] numbers2) {
      int ergebnis = 0;
      for (int i = 0; i < numbers.length; i++) {
        ergebnis = ergebnis + numbers[i] * numbers2[i];
        System.out.println("This is the final result "+ergebnis);
      }
    }  
  
    
  }
  