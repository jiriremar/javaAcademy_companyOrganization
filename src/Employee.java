public class Employee {
    private String name;
    private String specialization;

    public Employee(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void printInfo(){
        System.out.println("                - " + name + " ("+ specialization + ")");
    }
}
