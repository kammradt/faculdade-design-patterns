package patterns.decorator.exercises.concrete.beverages;

import patterns.decorator.exercises.abstracts.Beverage;
import patterns.decorator.exercises.concrete.condiments.Acucar;
import patterns.decorator.exercises.concrete.condiments.Cachaca;
import patterns.decorator.exercises.concrete.condiments.Gelo;
import patterns.decorator.exercises.concrete.condiments.Limao;

public class Caipirinha extends Beverage {
    private Double cost = .0;

    public Caipirinha() {
        this.description = this.getClass().getSimpleName() + " w/" ;
        Cachaca cachaca = new Cachaca(this);
        Limao limao = new Limao(cachaca);
        Gelo gelo = new Gelo(limao);
        Acucar acucar = new Acucar(gelo);
        this.cost = acucar.cost();
        this.description = acucar.getDescription();
    }

    @Override
    public Double cost() {
        return this.cost;
    }
}
