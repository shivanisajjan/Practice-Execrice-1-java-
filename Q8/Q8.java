
import java.util.*;
public class Q8{
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number:");
        num = input.nextInt();
        Random rand = new Random(); 
        int ran = rand.nextInt(100);
        while(ran!=num){
            if(num>ran){
                System.out.println("Number guessed is more than original number");
            }
            else{
                System.out.println("Number guessed is less than original number");
            }
            System.out.println("Enter the Number again:");
            num = input.nextInt();
        } 
        System.out.println("Congratulations!!Number guessed matches original number");
    }
}