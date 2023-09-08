package org.example;

public class Word {

    private int id;
    private int level;
    private string word;
    private string meaning;

    Word(){}
    Word(int id, int level, String word, String meaning){
        this.id = id;
        this.level = level;
        this.word= word;
        this.meaning=meaning;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public string getWord() {
        return word;
    }

    public void setWord(string word) {
        this.word = word;
    }

    public string getMeaning() {
        return meaning;
    }

    public void setMeaning(string meaning) {
        this.meaning = meaning;
    }


}
