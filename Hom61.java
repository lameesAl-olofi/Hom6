public class Hom61 {
    private final double balans;
private double balansx;

    public Hom61(double balans) {
        this.balans = balans;}

    public double getBalans(){
        return balans;}

    public double readrate(){
        double rate=10;
        double balansx=(balans*(rate/100))+balans;
        return balansx;}

    public double years(){
        double year=1;
        while (balansx <=1000000){
            balansx=balansx *year;
            year ++;

        }return year;
    }
}
