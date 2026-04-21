package houseworkzoo;

public class Horse extends Animal {
    public Horse(String speciesName, double weight, int age) {
        super(speciesName, weight, age);
    }

    @Override
    public double getDosage() {
        return getWeight() * 0.15;
    }

    @Override
    public String getFeedSchedule() {
        return "Sabah 06:00 - Akşam 18:00 (Yulaf ağırlıklı)";
    }
}