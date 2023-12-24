package kg.kstu.lostandfound.service.Impl;

import jakarta.transaction.Transactional;
import kg.kstu.lostandfound.repository.ListingRepository;
import kg.kstu.lostandfound.service.ListingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j //Simple logger facade for java
public class ListingServiceImpl implements ListingService {
    private final ListingRepository listingRepository;
}
