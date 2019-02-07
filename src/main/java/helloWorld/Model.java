package helloWorld;

public class Model {
    private String word = "";

    public String wordConcatenation(String addWord){
        return word = word + " " + addWord;
    }

    public String getWord() {
        return word;
    }
}
