import java.util.*;
public class Q6{
    public static void main(String[] args){
        Character ch;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Character:");
        ch = input.next().charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println("Capital Letter");
        }
        else if(Character.isLowerCase(ch)){
            System.out.println("Lowercase Letter ");
        }
        else if(Character.isDigit(ch)){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
    }
}
