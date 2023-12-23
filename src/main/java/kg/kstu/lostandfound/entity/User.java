package kg.kstu.lostandfound.entity;

import jakarta.persistence.*;
import kg.kstu.lostandfound.enums.Role;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "user_gen")
    @SequenceGenerator(
            name = "user_gen",
            sequenceName = "user_seq",
            allocationSize = 1
    )
    private Long id;
    private String name;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToOne
    private Listing listing;
}
