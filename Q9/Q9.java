import java.util.*;
public class Q9{
    public static void main(String[] args){
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String:");
        str = input.nextLine();
         String reverse = ""; 
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);
    }
}