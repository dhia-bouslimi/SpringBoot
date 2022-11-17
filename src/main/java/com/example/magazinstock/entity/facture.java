package com.example.magazinstock.entity;
import ch.qos.logback.core.net.server.Client;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class facture {
    @Id
    @GeneratedValue(strategy = IDENTITY )
    private Long idFacture;

    private float montantRemise;
    private float montantFacture;

    @Temporal(TemporalType.DATE)
    private Date dateFacture;
    private boolean active;

    @ManyToOne
    client client;

    @OneToMany(mappedBy="facture")
    private Set<detailfacture> detailfactures;


}
