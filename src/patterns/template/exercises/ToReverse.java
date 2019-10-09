package patterns.template.exercises;

public class ToReverse extends Transmutation {
    @Override
    public void transmute() {
        setText(new StringBuilder(getText()).reverse().toString());
    }
}
