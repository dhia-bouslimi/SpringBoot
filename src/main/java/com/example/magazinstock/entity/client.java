package com.example.magazinstock.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class client {

    @Id
    @GeneratedValue(strategy = IDENTITY )
    private Long idClient;

    private String nom;
    private String prenom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private CategorieClient categorieClient;

    @Enumerated(EnumType.STRING)
    private Profession profession;

    @OneToMany(mappedBy="client")
    private Set<facture> factures;
}
