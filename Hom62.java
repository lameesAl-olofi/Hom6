import java.util.Scanner;

public class Hom62 {

    public static void main(String[] args) {
        int n=2;
        int sum=0;

        while (n<=100){
            if(n%2==0){
                sum=sum+n;
            }n++;}System.out.println("the sum of all even numbers between 2 and 100"+sum);

   Scanner e=new Scanner(System.in);
        System.out.println("enter a");
        int a=e.nextInt();
        System.out.println("enter b");
        int b=e.nextInt();
        int n2=a;
        int sum2=0;
        while (n2<=b){
            if(n2%2!=0){
                sum2 =sum2 +n2;
            }n2++;
        }System.out.println("the sum of all odd numbers between "+a +b+sum2);

        System.out.println("input digits");
        int c= e.nextInt();
        int c1,c2,c3,c4 ,x=0;
        c1=(c/1000);
        c2=(c/100)%10;
        c3=(c/10)%10;
        c4=(c1%10);
        if(c1%2!=0)
        {x=c1;
            if(c2%2!=0)
            {x=c1+c2;
                if(c3%2!=0)
                {x=c1+c2+c3;
                    if(c4%2!=0)
                    {x=c1+c2+c3+c4;
                        System.out.println(x);

    }
                    else {
                        System.out.println("input eroo");
                    }
}}}}}
