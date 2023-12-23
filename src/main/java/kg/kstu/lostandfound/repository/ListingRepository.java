package kg.kstu.lostandfound.repository;

import kg.kstu.lostandfound.entity.Listing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingRepository extends JpaRepository<Listing, Long> {
}