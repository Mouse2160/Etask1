package helloWorld;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private List<String> wordsDictionary = new ArrayList<>();

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.wordsDictionary.add("Hello");
        this.wordsDictionary.add("World");
    }

    public void processUser() {
        Scanner text = new Scanner(System.in);
        for (String checkWord : wordsDictionary) inputText(text, checkWord);
        view.viewMessageAndWords(View.CURRENT_TEXT, model.getWord());
    }

    private void inputText(Scanner in, String checkWord) {
        boolean continueProgram = true;

        while (continueProgram) {
            String currentWord;
            view.viewMessage(String.format(View.INPUT_WORD, checkWord));
            currentWord =  in.nextLine();

            if (currentWord.equals(checkWord)) {
                model.wordConcatenation(currentWord);
                continueProgram = false;
            } else {
                view.viewMessage(View.INPUT_WRONG);
            }
        }
    }
}
