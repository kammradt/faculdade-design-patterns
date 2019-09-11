package patterns.decorator.exercises.concrete.beverages;

import patterns.decorator.exercises.abstracts.Beverage;
import patterns.decorator.exercises.concrete.condiments.Acucar;
import patterns.decorator.exercises.concrete.condiments.Cachaca;
import patterns.decorator.exercises.concrete.condiments.Gelo;
import patterns.decorator.exercises.concrete.condiments.Limao;

public class Caipirinha extends Beverage {
    private Double cost;

    public Caipirinha() {
        this.description = this.getClass().getSimpleName() + " w/" ;
        Beverage caipirinha = new Caipira();
        caipirinha = new Cachaca(caipirinha);
        caipirinha = new Limao(caipirinha);
        caipirinha = new Gelo(caipirinha);
        caipirinha = new Acucar(caipirinha);
        this.cost = caipirinha.cost();
        this.description = caipirinha.getDescription();
    }

    @Override
    public Double cost() {
        return this.cost;
    }
}
