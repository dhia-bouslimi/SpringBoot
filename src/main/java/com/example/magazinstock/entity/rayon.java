package com.example.magazinstock.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class rayon {
    @Id
    @GeneratedValue(strategy = IDENTITY )
    private Long idRayon;
    private String codeRayon;

    private String libelleRayon;


    @OneToMany(mappedBy="rayon")
    private Set<Produit> produits;



}
