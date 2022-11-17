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
public class stock {
    @Id
    @GeneratedValue(strategy = IDENTITY )
    private Long idStock;

    private Integer qteStock;
    private Integer qteMin;
    private String libelleStock;

    @OneToMany(mappedBy="stock")
    private Set<Produit> produits;

}
