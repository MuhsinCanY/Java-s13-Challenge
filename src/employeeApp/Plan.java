package employeeApp;

public enum Plan {
    low("Low",10),
    mid("n1",20),
    high("n1",30);

    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
