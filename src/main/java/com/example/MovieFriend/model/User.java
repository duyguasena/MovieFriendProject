package com.example.MovieFriend.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//1. **Kullanıcı Yönetimi:**
//
//
//         hesaplarını silebilmelidir.
//


@Entity
@Table(name="users")
@Getter
@Setter
public class User  {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String userName;
    private String email;
    private String password;

}
