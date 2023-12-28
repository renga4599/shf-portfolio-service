package com.sriram.home.finance.portfolio.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "PORTFOLIO")
@Data
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "PORTFOLIO_NAME")
    private String name;

}
