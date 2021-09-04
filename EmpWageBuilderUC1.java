public class EmpWageBuilderUC1 {
    public static void main (String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int IS_FULL_TIME = 1;
        double EMP_CHECK = Math.floor(Math.random() * 10) % 2;
        if (EMP_CHECK == IS_FULL_TIME)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }
}