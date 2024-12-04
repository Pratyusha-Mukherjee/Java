

import java.util.Scanner;
class count{
    int digits(int num){
        int count = 0;
        while (num>0){
            int lastdigit = num%10;
            num = num/10;
            count++;
        }
                return count;
    }
}

class countdigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        count c =  new count();
        int digitcount = c.digits(num);
        System.out.println(digitcount);
    }
}
