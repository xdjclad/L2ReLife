package com.chipercu.updater;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdaterConfiguration {


    @Bean
    public BalanceRepository balanceRepository() {
        return new BalanceRepository();
    }
}
