package com.MamaKapa.HabitBot.domains;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable

public class UsersHabitsKey implements Serializable {
    @Column(name = "habit_id")
    private Long habitId;
    @Column(name = "user_id")
    private Long userId;
}
