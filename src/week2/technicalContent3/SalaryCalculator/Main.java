package week2.technicalContent3.SalaryCalculator;

public class Main
{
    public static void main(String[] args)
    {
        Employee selin = new Employee("Selin", 900, 45, 1986);
        Employee umutcan = new Employee("Umutcan", 60000, 40, 2016);

        selin.printInfo();
        umutcan.printInfo();
    }
}
