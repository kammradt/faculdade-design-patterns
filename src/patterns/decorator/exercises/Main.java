package patterns.decorator.exercises;

import patterns.decorator.exercises.abstracts.Beverage;
import patterns.decorator.exercises.concrete.beverages.Caipira;
import patterns.decorator.exercises.concrete.beverages.Caipirinha;
import patterns.decorator.exercises.concrete.condiments.*;

import static util.Util.print;

public class Main {
    public static void main(String[] args) {
        Beverage caipiraDeSake = new Caipira();
        caipiraDeSake = new Sake(caipiraDeSake);
        caipiraDeSake = new Abacaxi(caipiraDeSake);
        caipiraDeSake = new Kiwi(caipiraDeSake);
        caipiraDeSake = new Acucar(caipiraDeSake);
        System.out.println("Caipira de saque ->" + caipiraDeSake.getDescription());
        System.out.println("Valor -> " + caipiraDeSake .cost());
        print("\n");

        Beverage caipiraDeVodka = new Caipira();
        caipiraDeVodka = new Vodka(caipiraDeVodka);
        caipiraDeVodka = new Morango(caipiraDeVodka);
        caipiraDeVodka = new Adocante(caipiraDeVodka);
        System.out.println("Caipira de vodka ->" + caipiraDeVodka.getDescription());
        System.out.println("Valor -> " + caipiraDeVodka.cost());
        print("\n");

        Beverage caipirinha = new Caipirinha();
        System.out.println("Caipirinha ->" + caipirinha.getDescription());
        System.out.println("Valor -> " + caipirinha.cost());
        print("\n");


    }
}
