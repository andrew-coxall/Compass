import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


 // Class Compass
 // By: xxx
 // On: aaa
 // Compass info taken from http://snowfence.umn.edu/Components/winddirectionanddegrees.htm

public class Compass {

  public static void main(String[] args) throws IOException {
    // comment
    String numberString;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
    System.out.print("Enter a number from 0-360: ");

    try {
      numberString = br.readLine();
      float number = Float.parseFloat(numberString);
   
      if (number <= 360 && number >= 0) {
        if ((number >= 348.75) || (number < 11.25)) {
          System.out.println ("That is N");
        } else if (number < 33.75) {
          System.out.println ("That is NNE");
        } else if (number < 56.25) {
          System.out.println ("That is NE");
        } else if (number < 78.75) {
          System.out.println ("That is ENE");
        } else if (number < 101.25) {
          System.out.println ("That is E");
        } else if (number < 123.75) {
          System.out.println ("That is ESE");
        } else if (number < 146.25) {
          System.out.println ("That is SE");  
        } else if (number < 168.75) {
          System.out.println ("That is SSE");
        } else if (number < 191.25) {
          System.out.println ("That is S");  
        } else if (number < 213.75) {
          System.out.println ("That is SSW");
        } else if (number < 236.25) {
          System.out.println ("That is SW");  
        } else if (number < 258.75) {
          System.out.println ("That is WSW"); 
        } else if (number < 281.25) {
          System.out.println ("That is W");
        } else if (number < 303.75) {
          System.out.println ("That is WNW");
        } else if (number < 326.25) {
          System.out.println ("That is NW");  
        } else if (number < 348.75) {
          System.out.println ("That is NNW");  
        }
      } else {
       System.out.println("You can only use positive numbers between 0 & 360");
      }

    } catch(Exception e1) {
      System.out.println("You can only enter numbers");
    }
   
    System.out.println();
    System.out.println("Done.");
  }
}
