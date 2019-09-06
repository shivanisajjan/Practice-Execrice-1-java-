import java.util.*;
public class Q10{
    public static void main(String[] args){
        int num;
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String:");
        str = input.nextLine();
        System.out.println("Enter the Number:");
        num = input.nextInt();
        String lastnchar = "";     //substring containing last 4 characters
        lastnchar = str.substring(str.length() - num);
        String repeated = lastnchar.repeat(num);
        System.out.println(str+repeated);
    }
}