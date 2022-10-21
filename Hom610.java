import java.util.Scanner;

public class Hom610 {
    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        System.out.println("enter number");
        Double currency=b.nextDouble();
        System.out.println("type price");
        double currencyconversion=b.nextDouble();
        double x= currencyconversion*currency;
        System.out.println(x);
    }
}
