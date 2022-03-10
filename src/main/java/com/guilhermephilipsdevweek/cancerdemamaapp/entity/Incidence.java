package com.guilhermephilipsdevweek.cancerdemamaapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Incidence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Integer Regiao_id;
    private Integer Mes;
    private Long Faixa_id;
    private Integer Qnt_exames;
}
