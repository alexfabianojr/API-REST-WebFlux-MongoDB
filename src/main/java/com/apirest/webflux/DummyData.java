package com.apirest.webflux;

import com.apirest.webflux.document.Playlist;
import com.apirest.webflux.repository.PlaylistRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.UUID;
/*Classe para popular o banco de dados
* A classe foi comentada porque o banco já está populado*/
/*@Component
public class DummyData implements CommandLineRunner {

    private final PlaylistRepository playlistRepository;

    DummyData(PlaylistRepository playlistRepository) {
        this.playlistRepository = playlistRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        playlistRepository.deleteAll()
                .thenMany(
                        Flux.just("API REST Spring Boot", "Deploy de uma aplicação java no IBM Cloud", "Java 14",
                                "Github", "Spring Security", "Web Service RESTFULL", "Bean no Spring Framework")
                        .map(nome -> new Playlist(UUID.randomUUID().toString(), nome))
                        .flatMap(playlistRepository::save))
                .subscribe(System.out::println);
    }
}*/
