package hw9inheritance2;
public class JuniorMehanic extends SeniorElectric {
    private int kpi = 7;
    private float goodSalary = 59;

    @Override
    public void Payment() {
        float salary = 0;
        if (kpi <= 5) {
            salary = goodSalary / 2;
        }
        if (kpi >= 6 && kpi <= 8) {
            salary = (goodSalary * 80) / 100;
        }
        if (kpi > 9) {
            salary = goodSalary;
        }
        System.out.println(salary);
    }
}
