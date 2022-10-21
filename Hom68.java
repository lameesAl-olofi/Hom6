import java.util.Scanner;

public class Hom68 {
    public static void main(String[] args) {
        int num;
        int i;
        int n=2;
        System.out.println("enter number ");
        Scanner b=new Scanner(System.in);
        num=b.nextInt();
        while (n<num){
            for (i=2;i<num;i++){
                if(n%i==0 && n%1==0)
                    break;
            }
            if(n==i||n==1)
                System.out.println(n);
            n++;
        }
    }
}
