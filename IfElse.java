import java.util.*;
public class IfElse {
    public static void main(String[] args) {
        //If-else
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your Age:-");
        // int age = sc.nextInt();
        // if (age >= 18){
        //     System.out.println("You are Adult");
        // }
        // else {
        //     System.out.println("You are minor");
        // }
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number:-");
        // int num = sc.nextInt();
        // if(num%2==0){
        //     System.out.println("Number is Even");
        // }
        // else{
        //     System.out.println("Number is Odd");
        // }
        System.out.println("Enter the number:-");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1==num2){
            System.out.println("Num1 is equals to Num2");
        }else if(num1>num2){
            System.out.println("num1 is greater than num2");
        }else{
            System.out.println("num1 is lesser than num2");
        }
    }

}
