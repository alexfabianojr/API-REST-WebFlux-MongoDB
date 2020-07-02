package com.apirest.webflux.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document /*faz o mapeamento entre o objeto para os dados playlist no banco (mapeamento objeto-dado)*/
public class Playlist {

    @Id
    private String id;

    private String nome;

    public String getId()   { return id; }
    public String getNome() { return nome; }

    public void setId(String id)        { this.id = id; }
    public void setNome(String nome)    { this.nome = nome; }

    public Playlist(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
