/*PROGRAM TO CALCULATE DISCOUT
 *@lewis gachaja
 * ADM:CT101/G/20211/23
 * DATE:22,jan,2024
 */
import java.util.Scanner;
public class Main1 {
    
    
    public static void main(String[] args) {
        int s;
        System.err.println("NET BONUS CALCULATER");
        System.out.println("Please enter your salary:");
        
        Scanner scanner = new Scanner(System.in);
         s =scanner.nextInt();
        System.out.println("Please enter the number of years you have worked here:");
        int y =scanner.nextInt();
        float b;
        if(y<6){
            b= s*8/100.0f;
            System.err.printf("Your net bonus is %.2f%n", b);
        }
        else if (y >= 6 && y <= 10){
            b= s*10/100.0f;
            System.err.printf("Your net bonus is %.2f%n", b);
        }
        else{
            b= s*12/100.0f;
            System.err.printf("Your net bonus is %.2f%n" , b);
        }
        scanner.close();
    }
}
