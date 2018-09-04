package com.demo.desjardins.labfinance.model;

import java.util.List;

public class Documents {
    String categorieID;
    String nomCategorie;
    List<Document> document;


    public String getCategorieID() {
        return categorieID;
    }

    public void setCategorieID(String categorieID) {
        this.categorieID = categorieID;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public List<Document> getDocument() {
        return document;
    }

    public void setDocument(List<Document> document) {
        this.document = document;
    }
}
