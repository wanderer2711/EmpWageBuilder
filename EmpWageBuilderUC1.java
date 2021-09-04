public class EmpWageBuilderUC1 {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static void main (String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int empWage = 0;
        int empHr = 0;
        int EMP_CHECK = (int) Math.floor(Math.random() * 10) % 3;
        switch (EMP_CHECK) {
            case IS_FULL_TIME:
                empHr = 8;
                break;
            case IS_PART_TIME:
                empHr = 4;
                break;
            default:
                empHr = 0;
        }
        empWage = empHr * WAGE_PER_HOUR;
        System.out.println("Employee Wage: " + empWage);
    }
}