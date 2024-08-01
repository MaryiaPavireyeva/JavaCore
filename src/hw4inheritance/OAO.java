package hw4inheritance;
public class OAO extends LegalEntity {

    public int roadPercent; //25%

    @Override
    public double sumYearRevenue() {
        return getRevenue() - getRevenue()/100 * getPercent() - getRevenue()/100 * roadPercent;  //выручка за год после уплаты налогов. UPD
    }

    @Override
    public double sumYearTax() {
        return getRevenue()/100 * getPercent() + getRevenue()/100 * roadPercent;  //сумма уплаты налога за год UPD
    }

    public OAO(int percent, int roadPercent) {
        super(percent);
        this.roadPercent = roadPercent;
    }




}
