package homework_movie_store;

public class Movie extends BaseEntity {
    private String title;
    private double purchasePrice;
    private double creditCost; // Kiralama bedeli (kredi)
    private boolean isAvailable;
}