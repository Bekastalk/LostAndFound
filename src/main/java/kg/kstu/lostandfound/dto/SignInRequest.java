package kg.kstu.lostandfound.dto;

import lombok.Builder;

@Builder
public record SignInRequest(
        String email,
        String password
) {
}
