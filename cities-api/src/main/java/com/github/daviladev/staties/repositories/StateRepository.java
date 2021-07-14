package com.github.daviladev.staties.repositories;

import com.github.daviladev.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
