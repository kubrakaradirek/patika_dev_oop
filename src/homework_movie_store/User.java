package homework_movie_store;

public abstract class User extends BaseEntity {
    private String name;
    private String email;
    private List<Movie> purchasedMovies; // Satın alınan filmler

    public void buyMovie(Movie movie) {
    }
}