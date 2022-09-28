public class ZinsDemo {
    public static void main(String[] args) {

        double interest1 = calcInterest(1000,2.25);
        double interest2 = calcInterest(2000,4.66);
        double interest3 = calcInterest(1337,13.77);

        System.out.println(interest1);
        System.out.println(interest2);
        System.out.println(interest3);

    }

    public static double calcInterest(double balance, double interestRate){
        return (balance * interestRate)/100;

    }

}
