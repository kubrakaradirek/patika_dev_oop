package homework_movie_store;

public class Subscriber extends User {
    private double credits; // Abonelik kredisi

    public void rentMovie(Movie movie) {
        if (credits >= movie.getCreditCost()) {
            credits -= movie.getCreditCost();
            // Kiralama mantığı
        }
    }
}