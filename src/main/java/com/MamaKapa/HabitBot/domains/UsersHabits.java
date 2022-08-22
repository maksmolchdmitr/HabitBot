package com.MamaKapa.HabitBot.domains;

import javax.persistence.*;

@Entity
public class UsersHabits {
    @EmbeddedId
    UsersHabitsKey id;
    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    User user;
    @ManyToOne
    @MapsId("habitId")
    @JoinColumn(name = "habit_id")
    Habit habit;
    private int frequency;
    private int period;
    private int counter;

    public UsersHabits() {}
}
