package patterns.adapter.exercises.second.implementations;

import java.util.List;

public class ExistingAdder {
    public int sumList(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) sum += i;
        return sum;
    }
}
