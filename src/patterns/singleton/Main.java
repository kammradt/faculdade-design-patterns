package patterns.singleton;

import patterns.singleton.exercises.Increment;
import patterns.singleton.exercises.LoginSingleton;

public class Main {
    public static void main(String[] args) {
        Increment shouldBeOne = Increment.getInstance();
        System.out.println(shouldBeOne);
        Increment shouldBeTwo = Increment.getInstance();
        System.out.println(shouldBeTwo);
        System.out.println();


        // My singleton
        LoginSingleton loginSingleton = LoginSingleton.getInstance("vini", "123");
        System.out.println("Memory Address: " + loginSingleton);
        System.out.println("Login username: " + loginSingleton.getUsername());
        System.out.println("Login password: " + loginSingleton.getPassword());
        System.out.println();


        // Trying to create a new instance (will not work)
        LoginSingleton loginSingletonABC = LoginSingleton.getInstance("AAA", "BBB");
        System.out.println("Memory Address: " + loginSingletonABC);
        System.out.println("Login username: " + loginSingletonABC.getUsername());
        System.out.println("Login password: " + loginSingletonABC.getPassword());
        System.out.println();
    }
}
