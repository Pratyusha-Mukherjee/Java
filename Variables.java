import java.util.*;
class Variables {
    public static void main(String[] args) {
        //output
        System.out.println("hello world");
        System.out.print("Hello World\n");

        // System.out.println("*\n**");
        //variable
        int a = 10;
        int b = 30;
        int sum  = a+b;
        System.out.println(sum);
        b = 5;
        int answer = (a*b)/(a-b);
        System.out.println(answer);

        //input taking
        Scanner sc = new Scanner(System.in);
        String full_name = sc.nextLine();
        System.out.println(full_name);

        //qn solving
        //take two variables as input and add them
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        int y = sc1.nextInt();
        int add = x+y;
        System.out.println(add);

    }
}