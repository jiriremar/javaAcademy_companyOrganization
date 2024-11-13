import java.util.ArrayList;
import java.util.List;

public class Department {
    private String nameDepartment;
    private List<Team> teamList;
    private String leaderName;

    public Department(String nameDepartment) {
        this.nameDepartment = nameDepartment;
        this.teamList = new ArrayList<>();
    }

    public void addTeam(Team team){
        teamList.add(team);
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public void printInfo(){
        System.out.println("======================================================================");
        System.out.println("    •Department: " + nameDepartment);
        System.out.println("     Department Head: " + leaderName);
        for (Team team : teamList){
            team.printInfo();
        }
    }
}
