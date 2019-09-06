
import java.util.*;
public class Q7{
    public static void main(String[] args){
        int num,i,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number:");
        num = input.nextInt();
        int freq[]={0,0,0,0,0,0,0,0,0,0};
        while(num!=0){
            i=num%10;
            num=num/10;
            freq[i]++;
            if(i%2==0){
                sum=sum+i;
            }
        }
        for(i=9;i>=0;i--){
            while(freq[i]!=0){
                num=num*10+i;
                freq[i]--;
            }
        }
        System.out.println(num);
        if(sum>10){
            System.out.println("True!!Sum of even numbers:"+sum);
        }
        else{
            System.out.println("False!!Sum of even numbers:"+sum);
        }
    }
}