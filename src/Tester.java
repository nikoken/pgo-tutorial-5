public class Tester extends Employee {
    private boolean automationTester;
    private int scenarioCount;
    public Tester(String id, String fName, String lName, double salary, boolean isAuto, int scenarios) {
        super(id, fName, lName, salary);
        this.automationTester = isAuto;
        this.scenarioCount = scenarios;
    }
    @Override
    public double calculateMonthlyCost() {
        double cost = super.calculateMonthlyCost();
        if (automationTester) cost += 1000;
        return cost;
    }
    @Override
    public String introduceYourself() {
        String type = automationTester ? "Automation Tester" : "Manual Tester";
        return super.introduceYourself() + ". I am a " + type;
    }
    public void runTestingReport() {
        System.out.println("Reporting " + scenarioCount + " test scenarios...");
    }
}