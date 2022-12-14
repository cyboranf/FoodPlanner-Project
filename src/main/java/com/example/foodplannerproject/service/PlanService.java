package com.example.foodplannerproject.service;

import com.example.foodplannerproject.domain.Plan;
import com.example.foodplannerproject.repository.PlanRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PlanService {
    private final PlanRepository planRepository;

    public PlanService(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }

    public List<Plan> findAll() {
        return planRepository.findAll();
    }

    public Integer quantityOfPlans() {
        return planRepository.quantityOfAllPlans();
    }

    public Plan save(Plan plan) {
        return planRepository.save(plan);
    }

    public Plan findById(Long id) {
        return planRepository.findById(id).get();
    }
}
