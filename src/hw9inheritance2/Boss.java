package hw9inheritance2;
public class Boss {
    private long oneHourPayment = 10000;
    private int hoursWorked = 4;

    public void Payment() {
        long paymentH = oneHourPayment * hoursWorked;
        System.out.println(paymentH);
    }


    public static void main(String[] args) {
        Boss grisha = new Boss();
        grisha.Payment();

        SeniorElectric victor = new SeniorElectric();
        victor.Payment();

        JuniorMehanic ignat = new JuniorMehanic();
        ignat.Payment();
    }
}
