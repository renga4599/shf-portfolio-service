package com.sriram.home.finance.portfolio.service;

import com.sriram.home.finance.portfolio.model.Portfolio;

import java.util.List;
import java.util.Optional;

public interface PortfolioService {
    List<Portfolio> getAllPortfolio();

    Optional<Portfolio> findById(Long id);

    Portfolio save(Portfolio portfolio);

    void deleteById(Long id);

    List<Portfolio> findByName(String title);
}

