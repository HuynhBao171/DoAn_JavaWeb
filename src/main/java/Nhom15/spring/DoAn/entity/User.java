package Nhom15.spring.DoAn.entity;

import Nhom15.spring.DoAn.validator.annotation.ValidUsername;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username",length = 50, nullable = false, unique = true)
    @NotBlank(message = "Username is required")
    @Size(min = 1, max = 50, message = "Username mush be between 1 and 50 characters")
    @ValidUsername
    private String username;

    @Column(name = "password",length = 250,nullable = false)
    @NotBlank(message = "Password is required")
    private String password;

    @Column(name = "email", length = 50, unique = true)
    @NotBlank(message = "Email is required")
    @Size(min = 1, max = 50, message = "Email must be between 1 and 50 characters")
    @Email
    private String email;

    @Column(name = "name", length = 50, nullable = false)
    @Size(max = 50, message = "Your name must be less than 50 characters")
    @NotBlank
    private String name;

    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList<>();

    @Pattern(regexp = "^[0-9]*$", message = "Phone must be number")
    private String phone;

// Bảng của hóa đơn
//    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
//    @ToString.Exclude
//    private Set<Invoice> invoices = new HashSet<>();

//Xác thực quyền cho hệ thống
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return Collections.emptyList();
//    }

}
