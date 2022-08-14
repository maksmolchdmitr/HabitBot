package com.MamaKapa.HabitBot.repositories;

import com.MamaKapa.HabitBot.domains.UsersHabits;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersHabitsRepo extends JpaRepository<UsersHabits, Long> {
}
