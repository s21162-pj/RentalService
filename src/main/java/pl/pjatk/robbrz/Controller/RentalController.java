package pl.pjatk.robbrz.Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pl.pjatk.robbrz.Service.RentalService;
import pl.pjatk.robbrz.model.Movie;


@RestController
@RequestMapping("/rent")
public class RentalController {

    private final RentalService rentalService;

    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Long id) {
        return ResponseEntity.ok(rentalService.getMovie(id));
    }

    @PutMapping("/return/{id}")
    public ResponseEntity<Void> returnMovie(@PathVariable Long id) {
        rentalService.returnMovie(id);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/rent/{id}")
    public ResponseEntity<Void> rentMovie(@PathVariable Long id) {

        rentalService.rentMovie(id);
        return ResponseEntity.ok().build();
    }
}
