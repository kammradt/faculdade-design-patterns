package patterns.template.exercises;

public class ToLowerCase extends Transmutation {
    @Override
    public void transmute() {
        setText(getText().toLowerCase());
    }
}
