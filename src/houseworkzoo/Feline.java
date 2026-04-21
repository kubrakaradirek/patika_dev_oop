package houseworkzoo;

public class Feline extends Animal {
    public Feline(String speciesName, double weight, int age) {
        super(speciesName, weight, age);
    }

    @Override
    public double getDosage() {
        return getWeight() * 0.05 + 10;
    }

    @Override
    public String getFeedSchedule() {
        return "Gece 22:00 (Et ağırlıklı)";
    }
}