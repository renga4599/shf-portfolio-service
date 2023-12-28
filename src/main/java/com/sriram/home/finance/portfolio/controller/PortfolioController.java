package com.sriram.home.finance.portfolio.controller;

import com.sriram.home.finance.portfolio.model.Portfolio;
import com.sriram.home.finance.portfolio.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/portfolio")
public class PortfolioController {

    private final PortfolioService portfolioService;

    @Autowired
    public PortfolioController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @GetMapping
    public List<Portfolio> getAllPortfolios() {
        return portfolioService.getAllPortfolio();
    }

    @GetMapping("/{id}")
    public Portfolio findPortfolioById(@PathVariable Long id){
        return portfolioService.findById(id).orElseThrow(() -> new RuntimeException());
    }

    @GetMapping("/name/{portfolioName}")
    public List<Portfolio> findPortfolioByName(@PathVariable String portfolioName){
        return portfolioService.findByName(portfolioName);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Portfolio createPortfolio(@RequestBody Portfolio portfolio){
        return portfolioService.save(portfolio);
    }

    @PutMapping
    public Portfolio updatePortfolio(@RequestBody Portfolio portfolio){
        return portfolioService.save(portfolio);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    @DeleteMapping("/{id}")
    public void deletePortfolioById(@PathVariable Long id) {
        portfolioService.deleteById(id);
    }
}
