public class Main {
    public static void main(String[] args) {
        ProjectTeam team = new ProjectTeam("Campus App");
        Employee e1 = new Developer("E-101", "Anna", "May", 12000.0, "Java", 4);
        Employee e2 = new Tester("E-201", "Peter", "Fox", 9800.0, true, 25);
        team.addEmployee(e1);
        team.addEmployee(e2);
        team.printTeamMembers();
        System.out.println("Total team cost: " + team.calculateTotalCost());
        if (e1 instanceof Developer) {
            Developer dev = (Developer) e1;
            dev.printTechnologies();
        }
        System.out.println("Is e2 same as new tester with same ID? " + e2.equals(new Tester("E-201", "X", "Y", 0, false, 0)));
        System.out.println(e2);
    }
}