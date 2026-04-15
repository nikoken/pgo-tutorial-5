public class Developer extends Employee {
    private String mainLanguage;
    private int repositoryCount;
    public Developer(String id, String fName, String lName, double salary, String lang, int repos) {
        super(id, fName, lName, salary);
        this.mainLanguage = lang;
        this.repositoryCount = repos;
    }
    @Override
    public double calculateMonthlyCost() {
        return super.calculateMonthlyCost() + (repositoryCount * 50);
    }
    @Override
    public String introduceYourself() {
        return super.introduceYourself() + ". I am a Developer specializing in " + mainLanguage;
    }
    public void printTechnologies() {
        System.out.println("Tech Stack: " + mainLanguage + ", Git, Docker");
    }
}