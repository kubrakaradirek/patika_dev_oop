package houseworkzoo;

public abstract class Animal{
    private String speciesName;
    private double weight;
    private int age;

    public Animal(String speciesName, double weight, int age) {
        this.speciesName = speciesName;
        this.weight = weight;
        this.age = age;
    }

    public abstract double getDosage();
    public abstract String getFeedSchedule();

    public String getSpeciesName() { return speciesName; }
    public double getWeight() { return weight; }
    public int getAge() { return age; }
}