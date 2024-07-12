package dev.aniket.SocialMediaApi.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class UserDto {
    private Integer id;
    private String username;
    private String email;
    private String name;
    private String userImage;
}
