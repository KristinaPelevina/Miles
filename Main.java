public class Main {
    public static void main(String[] args) {
        long priceKopecks = 1500080;
        int rubles = 20;
        int miles = 1;

        long bonus = priceKopecks / rubles * miles /100;
        System.out.println(bonus);
    }
}