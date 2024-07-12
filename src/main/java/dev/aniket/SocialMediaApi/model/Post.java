package dev.aniket.SocialMediaApi.model;

import dev.aniket.SocialMediaApi.dto.UserDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 500)
    private String caption;

    @NotNull
    private String postImage;
    private String location;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserDto user;

    @OneToMany
    private List<Comments> comments = new ArrayList<>();

    private Set<UserDto> likedByUser = new HashSet<>();
}
