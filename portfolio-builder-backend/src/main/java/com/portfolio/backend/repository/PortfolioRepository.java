package com.portfolio.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.backend.model.Portfolio;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {}
