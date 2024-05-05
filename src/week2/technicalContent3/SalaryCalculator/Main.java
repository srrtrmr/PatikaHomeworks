package week2.technicalContent3.SalaryCalculator;

public class Main
{
    public static void main(String[] args)
    {
        Employee selin = new Employee("Selin", 900, 45, 1986);
        Employee umutcan = new Employee("Umutcan", 2000, 45, 1985);

        selin.printInfo();
        umutcan.printInfo();
    }
}
