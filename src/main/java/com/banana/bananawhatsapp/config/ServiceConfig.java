package com.banana.bananawhatsapp.config;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Setter
public class ServiceConfig {

    @Value("${db.conn}")
    String connUrl;

    /*@Bean
    public DBConnector createDBConnector() {
        return new DBConnector();
    }*/


    /*@Bean
    @Profile("dev")
    public UsuarioInMemoryRepository createUsuarioInMemoryRepository() {
        System.out.println("Usando UsuarioInMemoryRepository");
        UsuarioInMemoryRepository repo = new UsuarioInMemoryRepository();
        repo.setDb_url(connUrl);
        return repo;
    }*/


}
