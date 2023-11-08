package com.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Fichier {
    public static void main(String[] args){
        try{
            // On crée un FileWriter  pour lire le fichier
            FileWriter fileWriter = new FileWriter("C:\\JavaLearner\\demo\\src\\main\\java\\com\\example\\tests", false);
            // FileWriter fileWriters = new FileWriter(".\\tests\\ok.js", false);
            // Création d'un BufferedWriter qui utilise le fileWriter
            BufferedWriter writer = new BufferedWriter(fileWriter);
            // BufferedWriter writers = new BufferedWriter(fileWriters);
            // On ajoute du texte à notre fichier writer
            writer.write("const nom = 'DUPON'");
            // On fait un retour à la ligne
            writer.newLine();
            // On donne une couleur à notre contenu
            writer.write("const prenom ='FRANCK COCHONDROM'");
            writer.newLine();
            writer.write("const fonction = 'DEVELOPPEUR'");
            // On ferme le fichier
            writer.close();


        }catch(IOException error){
            error.printStackTrace();
        }

    }
}
