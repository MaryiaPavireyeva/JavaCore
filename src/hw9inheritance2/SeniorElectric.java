package hw9inheritance2;
public class SeniorElectric extends Boss {
    private float percent = 30;
    private long fullTimePayment = 68;

    @Override
    public void Payment() {
        float paymentP = (percent * fullTimePayment) / 100;
        System.out.println(paymentP);
    }
}
