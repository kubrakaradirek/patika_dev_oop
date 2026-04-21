package houseworkzoo;

public class Rodent extends Animal {
    public Rodent(String speciesName, double weight, int age) {
        super(speciesName, weight, age);
    }

    @Override
    public double getDosage() {
        return getWeight() * 0.01;
    }

    @Override
    public String getFeedSchedule() {
        return "Günde 4 öğün (Tohum ve meyve)";
    }
}