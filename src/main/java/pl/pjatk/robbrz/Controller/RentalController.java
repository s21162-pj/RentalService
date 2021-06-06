package pl.pjatk.robbrz.Controller;

import pl.pjatk.robbrz.Service.RentalService;

public class RentalController {
    private final RentalService rentalService;

    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }
}
