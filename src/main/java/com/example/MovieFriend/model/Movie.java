package com.example.MovieFriend.model;

//2. **Film Yönetimi:**
//        - Filmler, ad, açıklama, yayın tarihi ve puan gibi özelliklerle birlikte veritabanında saklanabilmelidir.
//   - Kullanıcılar, filmleri listeleyebilmeli, yeni film ekleyebilmeli, mevcut filmleri düzenleyebilmeli ve silebilmelidir.

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="movies")
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Date date=new Date();
    private String point;
}
