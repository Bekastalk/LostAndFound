package kg.kstu.lostandfound.entity;

import jakarta.persistence.*;
import kg.kstu.lostandfound.enums.Category;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "listings")
public class Listing {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "listing_gen"
    )
    @SequenceGenerator(
            name = "listing_gen",
            sequenceName = "listing_seq",
            allocationSize = 1
    )
    private Long id;
    private String titleOrDescription; //название или описание
    private String photos;
    private String contactInformation;
    private LocalDate postingDate;

    @Enumerated(EnumType.STRING)
    private Category category;

    @OneToMany(mappedBy = "listing")
    private List<User> users;
}