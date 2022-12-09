package ru.itmentor.spring.boot_security.demo.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Getter
@Setter
@Entity
@Table(name="roles")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @ManyToMany(mappedBy ="roles" )
    private List<User> users = new ArrayList<>();

    public Role(List<User> users) {
        this.users = users;
    }

    public Role() {

    }

    @Override
    public String getAuthority() {
        return name;
    }
}
