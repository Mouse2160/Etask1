package helloWorld;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private List<String> wordsDictionary = Arrays.asList("Hello", "World");

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner inputText = new Scanner(System.in);
        for (String checkWord : wordsDictionary) inputText(inputText, checkWord);
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
