package com.portfolio.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.portfolio.backend.model.Portfolio;
import com.portfolio.backend.repository.PortfolioRepository;

@RestController
@RequestMapping("/api/portfolio")
@CrossOrigin(origins = "http://localhost:4200") // Angular runs here
public class PortfolioController {

    @Autowired
    private PortfolioRepository repo;

    @PostMapping("/create")
    public Portfolio createPortfolio(@RequestBody Portfolio portfolio) {
        return repo.save(portfolio);
    }

    @GetMapping("/all")
    public List<Portfolio> getAllPortfolios() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Portfolio getPortfolioById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }
}
