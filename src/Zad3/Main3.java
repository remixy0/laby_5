package Zad3;

public class Main3 {
    public static void main(String[] args) {
        Content [] lista = new Content[2];
        lista[0] = new Article("Marek Muzyka", "Kim on jest?","content");
        lista[1] = new TechnicalArticle("Andrzej","Macbook czy nie?", "czy warto","laptop");

        for  (Content c : lista) {
            c.render();
        }


    }
}
