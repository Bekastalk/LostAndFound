package kg.kstu.lostandfound.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import kg.kstu.lostandfound.enums.Role;
import lombok.Builder;

@Builder
public record SignUpRequest(
         String name,
         String email,
         String password
) {
}
