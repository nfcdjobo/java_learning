package com.example;

import java.util.Arrays;
import java.util.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EcritureHtmlFile {
    public static void main( String[] args ){
        try{
            List<String> HtmlLine = Arrays.asList("<!DOCType html>", "<html>", "<head>", "<title>Ecriture dans un fichier</title>", "</head>", "<body>","<h1>Petit test</h1>", "</body>", "</html>");
            // On crée un instance de la classe File qui nous permetra de créer un dossier  nommé document
            File nouveauDossier = new File("C://JavaLearner/demo/src/main/java/com/example/tests/document/");
            // On crée un instance de la classe File qui nous permetra de créer un fichier .txt nommé introduction
            File nouveauFichier = new File("C://JavaLearner/demo/src/main/java/com/example/tests/index.html");
            // Au cas où le di=ossier n'existe pas on le cré
            if(!nouveauDossier.exists()) nouveauDossier.mkdir();
            // Sinon on porte une écriture dans le fichier
            if(!nouveauFichier.exists()) nouveauFichier.createNewFile();
            else{
                // Pour ce fait, nous utiliseront la classe FileWriter qui permet de faire une demande d'écriture dans un fichier
                FileWriter ecriture = new FileWriter(nouveauFichier,  false);
                // En suiite utilisons la classe Buffer pour créer un sorte de mémoire tampon qui nous permetra d'intéragire avec les fichiers
                BufferedWriter memoireTampon = new BufferedWriter(ecriture);
                //  Puis, grâce à la méthode write() de la class BufferedWriter nous allons finalement porter l'écriture dans le fichier
                for(String balise: HtmlLine){
                    memoireTampon.write(balise);
                    memoireTampon.newLine();
                    System.out.println(balise);
                }
                
                
                memoireTampon.close();
                ecriture.close();
            }
        }catch(IOException error){
            error.printStackTrace();
        }
    }
    
}
