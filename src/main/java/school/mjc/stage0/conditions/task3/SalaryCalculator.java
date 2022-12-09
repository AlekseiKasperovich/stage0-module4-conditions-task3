package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {

    public void calculateSalary(int salary) {
        double res;
        if (salary > 0 && salary <= 10000) {
            res = salary - salary * 0.15;
            System.out.println(res);
        }
        if (salary > 10000 && salary <= 20000) {
            res = salary - salary * 0.18;
            System.out.println(res);
        }
        if (salary > 20000) {
            res = salary - salary * 0.20;
            System.out.println(res);
        }
        if (salary <= 0) {
            System.out.println("wrong input!");
        }
    }
}
