public class TestHom61 {
    public static void main(String[] args) {
        Hom61 s=new Hom61(500000);
        System.out.println("inter investment "+ s.getBalans());
        System.out.println("investment rate "+s.readrate());
        System.out.println("the number of years it takes for the investment to reach one million dollars" +s.years());
    }
}
