package com.sriram.home.finance.portfolio.repositories;

import com.sriram.home.finance.portfolio.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
    List<Portfolio> findByName(String name);
}
