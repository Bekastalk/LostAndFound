package kg.kstu.lostandfound.dto.listingDto;

import java.time.LocalDate;

public class ListingResponse {
    private Long id;
    private String titleOrDescription; //название или описание
    private String photos;
    private String contactInformation;
    private LocalDate postingDate;
}
