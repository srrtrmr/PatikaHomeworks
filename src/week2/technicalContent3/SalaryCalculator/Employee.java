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

    public void printInfo()
    {
        System.out.println("=========================");
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Work Hours : " + this.worksHours);
        System.out.println("Hire Year : " + this.hireYear);
        System.out.println("Tax : " + this.tax());
        System.out.println("Bonus: " + this.bonus());
        System.out.println("Raise Salary: " + this.raiseSalary());
        System.out.println("=========================");
    }
}
