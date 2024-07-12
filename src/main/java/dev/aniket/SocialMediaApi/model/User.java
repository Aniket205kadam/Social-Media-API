package dev.aniket.SocialMediaApi.model;

import dev.aniket.SocialMediaApi.dto.UserDto;
import jakarta.persistence.*;
import lombok.*;

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
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String username;
    private String name;
    private String email;
    private String mobile;
    private String website;
    private String bio;
    private String gender;
    private String image;

    private String password;

    private Set<UserDto> follower = new HashSet<>();
    private Set<UserDto> following = new HashSet<>();

    private List<Story> stories = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Post> savedPost = new ArrayList<>();
}
