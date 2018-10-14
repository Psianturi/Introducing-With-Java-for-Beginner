
package projectudemy;

/**
 *
 * @author Posma
 */
public class ProjectUdemy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Heloo World.! , ");
        
        int num = 34;
        String myName = "posma", newName = "Janius";
        
         System.out.println("My name is " + myName + " " + newName
          + ", " + "My age is " + num +".");
         
         System.out.println("Until this day, The days i have spent in my "
                 + "life were: " + num * 360 + " days");
         
         System.out.println(" ");
         System.out.println("Now we learn a little bit about if condition ");
         boolean test = num > 5;
         if (test){
             System.out.println(" Yes. If num = 34 > 5, so it's True");
         }
         
        int numb = 20;
        if (numb >= 50){
            System.out.println("Result: Yes");
        }
        else {
            System.out.println("Result: No");
        }    
        
        if (numb >= 15 || numb <= 40 ){
            System.out.println("Yess");
        }
        
        System.out.println(" ");
        System.out.println("I'm from Indonesia and i was born in Jakarta.");
        System.out.println("So that is the introduce from me" + " " +
                myName + " " + newName + " " + "Sianturi" + " " +
                "with Java Programming code.");
        System.out.println("Thanks for your time and attention. God bless you");
        
    }
    
}
