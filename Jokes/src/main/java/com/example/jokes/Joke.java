package com.example.jokes;

public class Joke {

    private String joke;

    private String category;

    public Joke(String id, String joke) {

        this.joke = joke;
        this.category = category;
    }
    public Joke(){

    }





    public String getJoke() {
        return joke;
    }

    public Joke setJoke(String joke) {
        this.joke = joke;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Joke setCategory(String category) {
        this.category = category;
        return this;
    }

    // Optionally, you can override toString() for easy logging or debugging
    @Override
    public String toString() {
        return "ChuckNorrisJoke{" +
                ", joke='" + joke + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
