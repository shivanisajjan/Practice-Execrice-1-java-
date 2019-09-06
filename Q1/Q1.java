import java.util.*;
public class Q1{
    public static long[] reverse(long num){
        long temp=0;
        long[] temp1 = new long[]{0,0};
        int i=0,sum=0;
        while(num!=0){
            i=(int)(num%10);
            num=num/10;
            temp = (temp*10)+ i;
            if(i%2==0){
                sum=sum+i;
            }
        }
        temp1[0]=temp;
        temp1[1]=sum;
        return temp1;
    }
    public static void main(String[] args){
        long num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number:");
        num = input.nextLong();
        long[] ret=reverse(num);
        if(ret[0]==num){
            if(ret[1]>25){
                System.out.println(num+ " is Palindrome and the sum of even numbers is greater than 25");
            }
            else{
                System.out.println(num+ " is Palindrome and the sum of even numbers is not greater than 25");
            }
        }
        else{
            System.out.println("Number is not Palindrome");
        }
    }
}