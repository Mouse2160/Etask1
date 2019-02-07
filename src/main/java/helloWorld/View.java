package helloWorld;

public class View {
    public static final String INPUT_WORD = "Input words %s = ";
    public static final String INPUT_WRONG = "Wrong word! Please enter again. ";
    public static final String CURRENT_TEXT = "Text = ";

    public void viewMessage(String message){
        System.out.println(message);
    }

    public void viewMessageAndWords(String message, String words){
        System.out.println(message + words);
    }
}
