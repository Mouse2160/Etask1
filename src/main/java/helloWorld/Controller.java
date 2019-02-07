package helloWorld;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner text = new Scanner(System.in);
        inputText(text, "Hello");
        inputText(text, "World");
        view.viewMessageAndWords(view.CURRENT_TEXT, model.getWord());
    }

    private void inputText(Scanner in, String checkWord) {
        boolean continueProgram = true;
        String currentWord;

        while (continueProgram) {
            view.viewMessage(String.format(view.INPUT_WORD, checkWord));
            currentWord =  in.nextLine();

            if (currentWord.equals(checkWord)) {
                model.wordConcatenation(currentWord);
                continueProgram = false;
            } else {
                view.viewMessage(view.INPUT_WRONG);
            }
        }
    }
}
