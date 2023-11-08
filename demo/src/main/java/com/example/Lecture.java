package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class Lecture {
    public static void main(String[] args) {
        try {
            
            // On crée un instance de la classe File qui nous permetra de créer un dossier  nommé document
            File nouveauDossier = new File("C://JavaLearner/demo/src/main/java/com/example/tests/document/");
            // On crée un instance de la classe File qui nous permetra de créer un fichier .txt nommé introduction
            File nouveauFichier = new File("C://JavaLearner/demo/src/main/java/com/example/tests/index.html");
            // Au cas où le di=ossier n'existe pas on le cré
            if(!nouveauDossier.exists()) nouveauDossier.mkdir();
            // Sinon on porte une écriture dans le fichier
            if(!nouveauFichier.exists()) nouveauFichier.createNewFile();
            else{
                // On crée une mémoire tampon pour lire nos fichier créés avec  la class BuffereReade
                BufferedReader lire = new BufferedReader(new InputStreamReader(new FileInputStream(nouveauFichier), "UTF-8"));
                // On crée un varible ligine qui sera la premiere ligne du fichier
                String ligne = lire.readLine();
                while(ligne != null){
                    System.out.println(ligne);
                    ligne = lire.readLine();
                }
                lire.close();
            }
        } catch (IOException error) {
            // TODO: handle exception
            error.printStackTrace();
        }
        
    }
}
