public class Main {
    public static void main(String[] args) {
        Employee jiri = new Employee("Jiri Remar", "Java coder");
        Employee kata = new Employee("Katerina Remarova", "CSS and bootstrap design");
        Employee antonin = new Employee("Antonin Remar" , "Boss assistant");
        Employee charlie = new Employee("Charlie Charlson", "Java tester");

        Team dev = new Team("Developer JAVA");
        dev.setLeaderName("Maho Jakotic");
        dev.addEmployee(jiri);
        dev.addEmployee(charlie);
        Team graphic = new Team("Developer C#");
        graphic.setLeaderName("Tomas Fuck");
        graphic.addEmployee(kata);
        Team finance = new Team("Finance");
        finance.setLeaderName("Bohumil Vorezprut");
        finance.addEmployee(antonin);

        Department software = new Department("Software");
        software.setLeaderName("Ferda Mravenec");
        software.addTeam(dev);
        software.addTeam(graphic);
        Department management = new Department("Management");
        management.setLeaderName("Brouk Pytlik");
        management.addTeam(finance);

        Company company = new Company("TechCorp inc");
        company.setComapanyBoss("Harry Potter");
        company.addDepartment(management);
        company.addDepartment(software);
        company.printInfo();
    }
}