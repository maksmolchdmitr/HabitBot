package com.MamaKapa.HabitBot.config;

import com.MamaKapa.HabitBot.models.TelegramBot;
import com.MamaKapa.HabitBot.services.TelegramFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.bots.DefaultBotOptions;

@Configuration
public class AppConfig {
    private final BotConfig botConfig;

    public AppConfig(BotConfig botConfig) {
        this.botConfig = botConfig;
    }

    @Bean
    public TelegramBot springTelegramBot(TelegramFacade telegramFacade){
        DefaultBotOptions options = new DefaultBotOptions();
        options.setProxyHost(botConfig.getProxyHost());
        options.setProxyPort(botConfig.getProxyPort());
        options.setProxyType(botConfig.getProxyType());

        TelegramBot telegramBot = new TelegramBot(options, telegramFacade);
        telegramBot.setBotUsername(botConfig.getBotName());
        telegramBot.setBotToken(botConfig.getToken());
        telegramBot.setBotPath(botConfig.getWebHook());

        return telegramBot;
    }

}
