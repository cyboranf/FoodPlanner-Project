package com.example.foodplannerproject.repository;


import com.example.foodplannerproject.domain.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Long> {
    Plan save(Plan plan);

    Optional<Plan> findAllById(Long id);

    void deleteById(Long id);

    @Query("SELECT COUNT(p) FROM Plan p")
    Integer quantityOfAllPlans();
}
