package Anjali;

//reverse order of given number.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        int ans = 0;
        while(num>0){
            int rem = num%10;
            num /= 10;
            ans=ans*10 + rem;
        }
        System.out.println("your answer is " + ans);


	
    }
}
