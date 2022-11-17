package com.example.magazinstock.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class fournisseur {
    @Id
    @GeneratedValue(strategy = IDENTITY )
    private Long idFournisseur;

    private String codeFournisseur;
    private String libelleFournisseur;

}
