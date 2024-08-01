package hw4inheritance;
public class LegalEntity {

    private int percent;   //20%
    private int revenue;//200

    public void setRevenue(int revenue){
        this.revenue = revenue;   //установить выручку за год
    }

    public double sumYearRevenue() {
        return revenue - revenue/100 * percent;  //выручка после вычета налогов
    }

    public double sumYearTax() {
        return revenue/100 * percent;  //сумма уплаты налога за год
    }

    LegalEntity(int percent){
        this.percent = percent;
    }

    public int getRevenue(){
        return revenue;
    }
    public int getPercent(){
        return percent;
    }
}