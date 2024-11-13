import java.util.ArrayList;
import java.util.List;

public class Team {
    private String nameTeam;
    private List<Employee> employeeList;
    private String leaderName;

    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public void printInfo() {
        System.out.println("        •Team: " + nameTeam);
        System.out.println("         Team Leader: " + leaderName);
        System.out.println("               •Members:");
        for (Employee employee : employeeList) {
            employee.printInfo();
        }
    }
}
