package com.example.myapplication.service;

import com.example.myapplication.dao.IDao;
import com.example.myapplication.classes.Produit;
import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Produit> {
    private List<Produit> produits = new ArrayList<>();

    @Override
    public void save(Produit produit) {
        produits.add(produit);
    }

    @Override
    public Produit findById(int id) {
        return produits.stream()
                .filter(produit -> produit.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void update(Produit produit) {
        for (int i = 0; i < produits.size(); i++) {
            if (produits.get(i).getId() == produit.getId()) {
                produits.set(i, produit);
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        produits.removeIf(produit -> produit.getId() == id);
    }

    // Méthode pour récupérer tous les produits
    public List<Produit> findAll() {
        return new ArrayList<>(produits);
    }
}
