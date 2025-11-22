package Zad3;

abstract class Content {
    String author;
    String title;

    public Content(String author, String title) {
        this.author = author;
        this.title = title;
    }
    abstract void render();
}

class Article extends Content {
    String content;
    Article(String author, String title, String content) {
        super(author, title);
        this.content = content;
    }
    @Override
    void render() {
        System.out.println(this.title + "\n" +this.content);
        System.out.println("");
    }
}

class TechnicalArticle extends Article {
    String technology;
    TechnicalArticle(String author, String title, String content, String technology) {
        super(author, title, content);
        this.content = content;
        this.technology = technology;
    }

    @Override
    void render() {
        System.out.println(this.title + "\n" + this.content + "\n"+ this.technology);
        System.out.println("");
    }
}