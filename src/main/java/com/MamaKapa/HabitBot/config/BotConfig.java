package com.MamaKapa.HabitBot.config;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.DefaultBotOptions;

@Component
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BotConfig {
    @Value("${telegramBot.name}")
    String botName;
    @Value("${telegramBot.token}")
    String token;
    @Value("${telegramBot.webHookPath}")
    String webHook;
    @Value("${telegramBot.proxyType}")
    DefaultBotOptions.ProxyType proxyType;
    @Value("${telegramBot.proxyHost}")
    String proxyHost;
    @Value("${telegramBot.proxyPort}")
    int proxyPort;
}
