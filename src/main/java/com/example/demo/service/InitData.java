package com.example.demo.service;

import com.example.demo.dto.ClientDTO;
import com.example.demo.entity.Article;
import com.example.demo.entity.Client;
import com.example.demo.entity.Facture;
import com.example.demo.entity.LigneFacture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Service
@Transactional
public class InitData {

    @Autowired
    private EntityManager em;

    public void insertTestData() {

        Client client  = new Client();
        client.setNom("PETRILLO");
        client.setPrenom("Alexandre");
        client.setAge("32");
        client.setAdresse("12, rue du Fond");
        client.setCodePostal("69002");
        client.setVille("Lyon");
        em.persist(client);

        Client client2  = new Client();
        client2.setNom("WAYNE");
        client2.setPrenom("John");
        client2.setAge("124");
        client2.setAdresse("15, Boulevard du Far-West");
        client2.setCodePostal("32992");
        client2.setVille("Nashville");
        em.persist(client2);

        Client client3  = new Client();
        client3.setNom("VAN DAMME");
        client3.setPrenom("Jean-Claude");
        client3.setAge("58");
        client3.setAdresse("125, impasse du Grand Ecart");
        client3.setCodePostal("23524");
        client3.setVille("Warrior");
        em.persist(client3);

        Article article = new Article();
        article.setLibelle("Carte mère ASROCK 2345");
        article.setMarque("Pirouette");
        article.setPrix(79.90);
        em.persist(article);
        
        Article article2 = new Article();
        article2.setLibelle("Carte mère ASROCK 1005");
        article2.setMarque("Pirouette");
        article2.setPrix(85.00);
        em.persist(article2);
        
        Article article3 = new Article();
        article3.setLibelle("Ecran Samsung 2145");
        article3.setMarque("Samsung");
        article3.setPrix(120.00);
        em.persist(article3);

        Article article4 = new Article();
        article4.setLibelle("Paire de Tong Taille 45");
        article4.setMarque("Alair");
        article4.setPrix(18.00);
        em.persist(article4);

        Facture facture = new Facture();
        facture.setClient(client);
        em.persist(facture);

        LigneFacture ligneFacture1 = new LigneFacture();
        ligneFacture1.setFacture(facture);
        ligneFacture1.setArticle(article);
        ligneFacture1.setQuantite(1);
        em.persist(ligneFacture1);
        
        LigneFacture ligneFacture2 = new LigneFacture();
        ligneFacture2.setFacture(facture);
        ligneFacture2.setArticle(article2);
        ligneFacture2.setQuantite(1);
        em.persist(ligneFacture2);

        LigneFacture ligneFacture3 = new LigneFacture();
        ligneFacture3.setFacture(facture);
        ligneFacture3.setArticle(article3);
        ligneFacture3.setQuantite(3);
        em.persist(ligneFacture3);

        LigneFacture ligneFacture4 = new LigneFacture();
        ligneFacture4.setFacture(facture);
        ligneFacture4.setArticle(article4);
        ligneFacture4.setQuantite(2);
        em.persist(ligneFacture4);
    }
}