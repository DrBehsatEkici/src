package day08_IfStatements;

public class SalaryCalculator {

    public static void main (String[] args)  {

        int hourlyRate =65,
                weeklyHours= 50;

        double stateTaxRate = 0,
                federalTaxRate= 26.2;

        int salaryBeforetax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforetax * stateTaxRate /100;
        double federalTax = salaryBeforetax * federalTaxRate /100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax= salaryBeforetax - totalTax;

        System.out.println(" Gross pay is : $ " + salaryBeforetax);
        System.out.println("State Tax = $ " + stateTax);
        System.out.println("Federal Tax = $" + federalTax);
        System.out.println("Total Tax = $" + totalTax);
        System.out.println(" Net Income = " + salaryAfterTax);





    }
}
