package patterns.adapter.exercises.second;

import patterns.adapter.exercises.second.implementations.AdapterAdder;
import patterns.adapter.exercises.second.implementations.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new AdapterAdder());
        client.execute();
    }
}
