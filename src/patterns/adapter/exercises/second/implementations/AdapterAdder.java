package patterns.adapter.exercises.second.implementations;

import patterns.adapter.exercises.second.interfaces.WantedAdder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdapterAdder implements WantedAdder {
    private ExistingAdder existingAdder = new ExistingAdder();

    @Override
    public int sumVector(int[] vector) {
        List<Integer> list = new ArrayList<>();
        Arrays.stream(vector).forEach(list::add);
        return existingAdder.sumList(list);
    }

}
