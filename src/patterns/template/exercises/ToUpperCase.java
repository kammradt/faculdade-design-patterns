package patterns.template.exercises;

public class ToUpperCase extends Transmutation {
    @Override
    public void transmute() {
        setText(getText().toUpperCase());
    }
}
