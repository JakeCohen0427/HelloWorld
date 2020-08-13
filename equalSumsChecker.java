import java.util.Scanner;
public class equalSumChecker{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the first number?");
        int a = sc.nextInt();
        System.out.println("What is the second number?");
        int b = sc.nextInt();
        System.out.println("What is the third number?");
        int c = sc.nextInt();
        if(a + b % c == 0) {
            System.out.println("The sum of number a and number b equals number c");
        }
        if(a + b % c == 1) {
            System.out.println("The sum of number a and number b does not equal number c");
        }
        
     }
}

//Prompt: Ask for three number, output wether the sum of the first two numbers is equal or not equal to the third number.
