package com.polodesportivo.agendamento.Configuracao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        return http
                .csrf(csrf -> csrf.disable()) // Desativa CSRF para o Postman funcionar
                .authorizeExchange(exchanges -> exchanges
                        .anyExchange().permitAll() // Libera todas as rotas (sem login)
                )
                .httpBasic(httpBasic -> httpBasic.disable()) // Desativa login básico
                .formLogin(formLogin -> formLogin.disable()) // Desativa formulário de login
                .build();
    }
}
