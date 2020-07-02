package com.apirest.webflux.controller;

import com.apirest.webflux.document.Playlist;
import com.apirest.webflux.services.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/*Esta classe deve ser anotada caso usemos as configurações de serviços reativos por handler e router*/
@RestController
public class PlaylistController {

    @Autowired
    PlaylistService playlistService;

    @GetMapping(value = "/playlist")
    public Flux<Playlist> getPlaylist() {
        return playlistService.findAll();
    }

    @GetMapping(value = "/playlist/{id}")
    public Mono<Playlist> getPlaylistId(@PathVariable String id) {
        return playlistService.findById(id);
    }

    @PostMapping(value = "/playlist")
    public Mono<Playlist> save(@RequestBody Playlist playlist) {
        return playlistService.save(playlist);
    } /*Anotação requestbody para o banco saber que ele está recebendo um objeto playlist em formato JSON*/

}
