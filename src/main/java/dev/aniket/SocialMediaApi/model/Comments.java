package dev.aniket.SocialMediaApi.model;

import dev.aniket.SocialMediaApi.dto.UserDto;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "comments")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    private UserDto user;

    private String content;

    @OneToMany
    private Set<UserDto> likedByUser = new HashSet<>();

    private LocalDateTime createdAt;
}
