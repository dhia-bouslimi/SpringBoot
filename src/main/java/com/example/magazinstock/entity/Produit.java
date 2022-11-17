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
public class Produit {

    @Id
    @GeneratedValue(strategy = IDENTITY )
    private Long idProduit;

    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;

    @OneToMany(mappedBy="produit")
    private Set<detailfacture> detailfactures;

    @OneToOne
    private detailproduit detailproduit;

    @ManyToMany

    private Set<fournisseur> fournisseurs;

    @ManyToOne
    rayon rayon;

    @ManyToOne
    stock stock;
}
