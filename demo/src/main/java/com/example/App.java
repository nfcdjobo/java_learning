package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Personne personne = new Personne();
        personne.fullname();
    }
}

class Informations {
    Map<String, String>fullname(){
        Scanner clavier = new Scanner(System.in);
        System.out.println("Comment appelez-vous ?");
        while(clavier.hasNextInt()){
            System.out.println("Votre nom et prénom doit être en chaîne de caractère ?");
            clavier.next();
        }
        String name = clavier.nextLine();
        if(name.split(" ").length==1){
            System.out.println("Nom et prénom sont réquis ?");
            fullname();
        }
        Map<String, String> NomPrenom = new HashMap<String, String>();
        NomPrenom.put("Nom et Prénom", name);
        return NomPrenom;
    }
}

class Personne extends Informations{
    @Override
    Map<String, String>fullname(){
        return super.fullname();
    }
}


