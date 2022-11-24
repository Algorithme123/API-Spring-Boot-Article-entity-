package com.mycompagny.springarticle.article.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;

    @Column(name="code")
    private String code;

    @Column(name = "libelle")
    private String libelle;

    @Column(name="qte")
    private int qte;

    @Column(name = "description")
    private String description;



}
