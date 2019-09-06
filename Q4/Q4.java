import java.util.*;
public class Q4{
    public static void main(String[] args){
        int num,i=1,j=1,flag=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number:");
        num = input.nextInt();
        while(num>0){
            flag=0;
            i=j;
            while(i!=0){
                System.out.print(j);
                i--;
            }
            j++;
            num--;
        }
        if(flag==1){
            System.out.println("Error");
        }
    }
}