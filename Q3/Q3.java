import java.util.*;
public class Q3{
    public static void main(String[] args){
        String str;
        int flag=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String:");
        str = input.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>=97 && ch<=122) || (ch>=65 && ch<=90)){
                flag=1;
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                    System.out.print("vowel");
                }
                else{
                    System.out.print("consonant");
                }
                System.out.print("  ");
            }
        }
        if(flag!=1){
            System.out.println("Error");
        }
    }
}