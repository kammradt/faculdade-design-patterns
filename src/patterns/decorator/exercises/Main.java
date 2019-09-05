package patterns.decorator.exercises;

import patterns.decorator.exercises.concrete.beverages.Caipira;
import patterns.decorator.exercises.concrete.beverages.Caipirinha;
import patterns.decorator.exercises.concrete.condiments.*;

import static util.Util.print;

public class Main {
    public static void main(String[] args) {
        Caipira caipira = new Caipira();
        Sake sake = new Sake(caipira);
        Abacaxi abacaxi = new Abacaxi(sake);
        Kiwi kiwi = new Kiwi(abacaxi);
        Acucar acucar = new Acucar(kiwi);
        System.out.println("Caipira de saque ->" + acucar.getDescription());
        System.out.println("Valor -> " + acucar.cost());
        print("\n");

        Caipira caipira1 = new Caipira();
        Vodka vodka = new Vodka(caipira1);
        Morango morango = new Morango(vodka);
        Adocante adocante = new Adocante(morango);
        System.out.println("Caipira de vodka ->" + adocante.getDescription());
        System.out.println("Valor -> " + adocante.cost());
        print("\n");

        Caipirinha caipirinha = new Caipirinha();
        System.out.println("Caipirinha ->" + caipirinha.getDescription());
        System.out.println("Valor -> " + caipirinha.cost());
        print("\n");


    }
}
