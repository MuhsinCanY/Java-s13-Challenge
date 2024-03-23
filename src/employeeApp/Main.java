package employeeApp;

public class Main {
    private static void workWithData() {
        Company comp1 = new Company(1, "comp1", -20, new String[4]);

        Healthplan heal1 = new Healthplan(1, "heal1", Plan.low);
        Healthplan heal2 = new Healthplan(2, "heal2", Plan.mid);
        Healthplan heal3 = new Healthplan(3, "heal3", Plan.high);

        Employee emp1 = new Employee(1, "Samet", "s@gmail.com", "1234", new String[3]);

        comp1.addEmployee(0, "Muhsin");
        comp1.addEmployee(1, "Can");
        comp1.addEmployee(2, "Samet");
        comp1.addEmployee(3, "Mikail");

        emp1.addHealthplan(0, "newHeal1");
        emp1.addHealthplan(1, "newHeal2");
        emp1.addHealthplan(2, "newHeal3");

        comp1.setGiro(10);

        System.out.println(comp1);
        System.out.println(heal1);
        System.out.println(heal2);
        System.out.println(heal3);
        System.out.println(emp1);
    }

    public static void main(String[] args) {
        workWithData();
    }
}
