package com.example.magazinstock.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class detailproduit {
    @Id
    @GeneratedValue(strategy = IDENTITY )
    private Long idDetailProduit;

    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;

    @Enumerated(EnumType.STRING)
    private categorieproduit categorieproduit;

    @OneToOne(mappedBy = "detailproduit")
    private Produit produit;

}
