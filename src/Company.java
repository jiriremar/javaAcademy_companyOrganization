import java.util.ArrayList;
import java.util.List;

public class Company {
    private String nameCompany;
    private List<Department> departmentList;
    private String comapanyBoss;

    public Company(String nameCompany) {
        this.nameCompany = nameCompany;
        this.departmentList = new ArrayList<>();
    }

    public void addDepartment(Department department){
        departmentList.add(department);
    }

    public void setComapanyBoss(String comapanyBoss) {
        this.comapanyBoss = comapanyBoss;
    }

    public void printInfo(){
        System.out.println(" ");
        System.out.println("                     === " + nameCompany + " ===");
        System.out.println("                     CEO: " + comapanyBoss);
        System.out.println(" ");
        for (Department department : departmentList){
            department.printInfo();
        }
    }
}
