package com.MamaKapa.HabitBot.repositories;

import com.MamaKapa.HabitBot.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
