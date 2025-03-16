package com.example.myapplication.classes;

public class Produit {
    private static int count = 0;
    private int id;
    private String nom;
    private int prix;
    private int image;
    private String tempsPreparation;
    private String ingredients;
    private String description;
    private String etapes;

    // Constructeur avec paramètres (id auto-incrémenté)
    public Produit(String nom, int prix, int image, String tempsPreparation, String ingredients, String description, String etapes) {
        this.id = ++count;
        this.nom = nom;
        this.prix = prix;
        this.image = image;
        this.tempsPreparation = tempsPreparation;
        this.ingredients = ingredients;
        this.description = description;
        this.etapes = etapes;
    }

    // Constructeur sans paramètre
    public Produit() {
        this.id = ++count;
    }

    // Getters et Setters
    public int getId() { return id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public int getPrix() { return prix; }
    public void setPrix(int prix) { this.prix = prix; }

    public int getImage() { return image; }
    public void setImage(int image) { this.image = image; }

    public String getTempsPreparation() { return tempsPreparation; }
    public void setTempsPreparation(String tempsPreparation) { this.tempsPreparation = tempsPreparation; }

    public String getIngredients() { return ingredients; }
    public void setIngredients(String ingredients) { this.ingredients = ingredients; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getEtapes() { return etapes; }
    public void setEtapes(String etapes) { this.etapes = etapes; }

    // Méthode toString
    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", tempsPreparation='" + tempsPreparation + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

