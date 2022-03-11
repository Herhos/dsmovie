package com.vix.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vix.dsmovie.entities.Score;
import com.vix.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {}
