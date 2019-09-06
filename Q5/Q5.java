import java.util.*;
public class Q5{
    public static void main(String[] args){
        String str;
        int flag=0,i=0,sum=0,t=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        str = input.nextLine();
        for(i=0;i<str.length() && flag==0;i++){
            if((str.charAt(i)>47 && str.charAt(i)<58) || str.charAt(i) == ' '){
                if(str.charAt(i) !=' '){
                    t=t*10+Character.getNumericValue(str.charAt(i));
                }
                else{
                    sum = sum + t;
                    t=0;
                }
            }
            else{
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("Sum:"+(sum+t));
        }
        else{
            System.out.println("Not an Integer");
        }
    }
}