public class EmpWageBuilderUC1 {
    public static void main (String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int IS_FULL_TIME = 1;
        int WAGE_PER_HOUR = 20;
        int empWage = 0;
        int empHr = 0;
        double EMP_CHECK = Math.floor(Math.random() * 10) % 2;
        if (EMP_CHECK == IS_FULL_TIME)
            empHr = 8;
        else
            empHr = 0;
        empWage = empHr * WAGE_PER_HOUR;
        System.out.println("Employee Wage: " + empWage);
    }
}