package kg.kstu.lostandfound.dto.listingDto;

import java.time.LocalDate;

public class ListingRequest {
    private String titleOrDescription; //название или описание
    private String photos;
    private String contactInformation;
    private LocalDate postingDate;
}
