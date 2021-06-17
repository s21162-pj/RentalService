package pl.pjatk.robbrz.Service;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.robbrz.model.Movie;

@Service
public class RentalService {
    private final RestTemplate restTemplate;

    public RentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Movie getMovie(Long id) {
        Movie movie = restTemplate.getForEntity("http://localhost:8080/movies/" + id, Movie.class).getBody();
        return movie;
    }
    public void returnMovie(Long id) {
        String URI = "http://localhost:8080/movies/return/" + id;
        restTemplate.put(URI, null);
    }

    public void rentMovie(Long id) {
        String URI = "http://localhost:8080/movies/rent/" + id;
        restTemplate.put(URI, null);
    }
}
