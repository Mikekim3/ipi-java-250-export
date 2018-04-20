package com.example.demo.dto;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Element;
import com.itextpdf.text.ElementListener;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kayne on 09/04/2018.
 */

public class FactureDTO implements Element {

    private Long id;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    private ClientDTO client;

    public ClientDTO getClient() {
        return client;
    }
    public void setClient(ClientDTO client) {
        this.client = client;
    }


    private List<LigneFactureDTO> ligneFactures = new ArrayList<>();

    public List<LigneFactureDTO> getLigneFactures() {
        return ligneFactures;
    }
    public void setLigneFactures(List<LigneFactureDTO> ligneFactures) {
        this.ligneFactures = ligneFactures;
    }

    @Override
    public boolean process(ElementListener elementListener) {
        return false;
    }

    @Override
    public int type() {
        return 0;
    }

    @Override
    public boolean isContent() {
        return false;
    }

    @Override
    public boolean isNestable() {
        return false;
    }

    @Override
    public ArrayList<Chunk> getChunks() {
        return null;
    }
}