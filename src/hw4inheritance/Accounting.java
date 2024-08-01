package hw4inheritance;

public class Accounting {

    public void Balance(int yearRevenue, double yearPercent, double sumYearRevenue){
        System.out.println("Company revenue: " + yearRevenue +
                "\nCompany year percent: " + yearPercent +
                "\nCompany year revenue: " + sumYearRevenue + "\nNew company");
    }
    public static void main(String[] args) {
        LegalEntity Company = new LegalEntity(20);
        OAO CompanyTwo = new OAO(25,5);

        Company.setRevenue(200);
        CompanyTwo.setRevenue(300);

        Accounting company = new Accounting();
        Accounting companyTwo = new Accounting();

        company.Balance(Company.getRevenue(), Company.sumYearTax(), Company.sumYearRevenue());
        companyTwo.Balance(CompanyTwo.getRevenue(), CompanyTwo.sumYearTax(), CompanyTwo.sumYearRevenue());
    }
}
