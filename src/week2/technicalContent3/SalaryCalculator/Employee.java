package week2.technicalContent3.SalaryCalculator;

public class Employee
{
    String name;
    double salary;
    double worksHours;
    int hireYear;

    public Employee(String name, double salary, double worksHours, int hireYear)
    {
        this.name = name;
        this.salary = salary;
        this.worksHours = worksHours;
        this.hireYear = hireYear;
    }

    public double tax()
    {
        if (this.salary < 1000)
        {
            return 0;
        }
        else
        {
            return this.salary * 0.03;
        }
    }

    public double bonus()
    {
        if (this.worksHours > 40)
        {
            return (this.worksHours - 40) * 30;
        }
        else
        {
            return 0;
        }
    }

    public double raiseSalary()
    {
        int workYears = 2021 - this.hireYear;

        if (workYears < 10)
        {
            return this.salary * 0.05;
        }

        if (9 < workYears && workYears < 20)
        {
            return this.salary * 0.1;
        }

        if (19 < workYears)
        {
            return this.salary * 0.15;
        }

        return 0;
    }

    public String toString()
    {
        double tax = this.tax();
        double bonus = this.bonus();
        double raiseSalary = this.raiseSalary();

        return "=========================" +
                "\nName : " + this.name +
                "\nSalary : " + this.salary +
                "\nWork Hours : " + this.worksHours +
                "\nHire Year : " + this.hireYear +
                "\nTax : " + tax +
                "\nBonus: " + bonus +
                "\nRaise Salary: " + raiseSalary +
                "\nSalary With Tax And Bonus: " + (this.salary + bonus + tax) +
                "\nTotal Salary: " + (this.salary + bonus + tax + raiseSalary) +
                "\n=========================";
    }
}
