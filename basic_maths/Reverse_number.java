import java.util.Scanner;
class reverse{
    int reversenum(int num){
        int reversednum = 0;
        while(num>0){
            int lastdigit = num%10;
            reversednum = reversednum*10 +lastdigit;
            num = num/10;
        }
        return reversednum;
    }
}
class Reverse_number{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        reverse r = new reverse();
        int reversenum = r.reversenum(num);
        System.out.println(reversenum);
    }
}
