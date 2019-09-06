import java.util.*;
public class Q2{
    public static void main(String[] args){
        long num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number:");
        num = input.nextLong();
        if(num>20 && num<30){
            if((num%2)==0){
                System.out.println("Jerry");
            }
            else{
                System.out.println("Tom");
            }
        }
        else{
            System.out.println("Number is not in between 20 and 30");
        }
    }
}