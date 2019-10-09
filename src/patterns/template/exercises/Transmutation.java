package patterns.template.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Transmutation {

    private String text;

    public abstract void transmute();

    public void getAndSetText() {
        System.out.println("Type you text: ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            this.text = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showText() {
        System.out.println("Text : " + this.text);
    }

    final public void templateMethod() {
        getAndSetText();
        transmute();
        showText();
    }

    String getText() {
        return text;
    }

    void setText(String text) {
        this.text = text;
    }
}
