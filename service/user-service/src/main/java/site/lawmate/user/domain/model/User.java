package site.lawmate.user.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import jakarta.persistence.OneToMany;
import org.springframework.stereotype.Component;
import site.lawmate.user.domain.vo.Role;
import site.lawmate.user.domain.vo.Registration;

import java.util.List;

@Entity(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Component
@Getter
@Builder(toBuilder = true)
@ToString(exclude = {"id"})
@Setter
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String email;

    @NotNull
    private String name;

    private String password;

    @NotNull
    private String profile;

    @Enumerated(EnumType.STRING)
    @NotNull
    private Role role;
    private String phone;
    private String age;
    private String gender;
    private Long point;

    // oauth
    private Registration registration;
    private String oauthId;

    @Builder
    public User(String name, String email, String profile, Role role) {
        this.name = name;
        this.email = email;
        this.profile = profile;
        this.role = role;
    }

    public User update(String name, String profile) {
        this.name = name;
        this.profile = profile;
        return this;
    }

    @OneToMany(mappedBy = "writer", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Question> questions;

    @OneToMany(mappedBy = "buyer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<UserPayment> payments;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Issue> issues;


}