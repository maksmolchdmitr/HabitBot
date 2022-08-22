package com.MamaKapa.HabitBot.controllers;

import com.MamaKapa.HabitBot.models.TelegramBot;
import org.springframework.web.bind.annotation.*;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@RestController
@RequestMapping("/")
public class WebhookController {
    private final TelegramBot telegramBot;

    public WebhookController(TelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }

    @PostMapping
    public BotApiMethod<?> onUpdateReceived(@RequestBody Update update){
        System.out.println(update.getMessage());
        return telegramBot.onWebhookUpdateReceived(update);
    }
}
