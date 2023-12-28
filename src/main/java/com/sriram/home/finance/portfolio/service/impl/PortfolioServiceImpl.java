package com.sriram.home.finance.portfolio.service.impl;

import com.sriram.home.finance.portfolio.model.Portfolio;
import com.sriram.home.finance.portfolio.repositories.PortfolioRepository;
import com.sriram.home.finance.portfolio.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PortfolioServiceImpl implements PortfolioService {

    private final PortfolioRepository portfolioRepository;
    @Autowired
    public PortfolioServiceImpl(PortfolioRepository portfolioRepository){
        this.portfolioRepository = portfolioRepository;
    }

    @Override
    public List<Portfolio> getAllPortfolio() {
        return portfolioRepository.findAll();
    }

    @Override
    public Optional<Portfolio> findById(Long id) {
        return portfolioRepository.findById(id);
    }

    @Override
    public List<Portfolio> findByName(String title) {
        return portfolioRepository.findByName(title);
    }

    @Override
    public Portfolio save(Portfolio portfolio) {
        return portfolioRepository.saveAndFlush(portfolio);
    }

    @Override
    public void deleteById(Long id) {
        portfolioRepository.deleteById(id);
    }


}
