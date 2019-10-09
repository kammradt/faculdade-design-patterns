package patterns.template;

import patterns.template.exercises.ToLowerCase;
import patterns.template.exercises.ToReverse;
import patterns.template.exercises.ToUpperCase;
import patterns.template.exercises.Transmutation;

public class Main {
    public static void main(String[] args) {
        Transmutation toLowerCase = new ToLowerCase();
        toLowerCase.templateMethod();

        Transmutation toUpperCase = new ToUpperCase();
        toUpperCase.templateMethod();

        Transmutation toReverse = new ToReverse();
        toReverse.templateMethod();

    }
}
