package com.MamaKapa.HabitBot.repositories;

import com.MamaKapa.HabitBot.domains.Habit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitRepo extends JpaRepository<Habit, Long> {
}
