package com.example.magazinstock.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class detailfacture {
    @Id
    @GeneratedValue(strategy = IDENTITY )
    private Long idDetailDacture;
    private Integer qte;
    private float prixTotal;
    private Integer pourcentageRemise;
    private Integer montantRemise;

    @ManyToOne
    facture facture;

    @ManyToOne
    Produit produit;
}
