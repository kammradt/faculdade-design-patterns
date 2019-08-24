package patterns.observer.exercises.interfaces;

public class DivisionObserver implements Observer, Display {
    private Math math;
    private float firstNumber;
    private float secondNumber;

    public DivisionObserver(Math math) {
        this.math = math;
        this.math.registerObserver(this);
    }

    @Override
    public void update(float firstNumber, float secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        calculateAndDisplay();
    }

    @Override
    public void calculateAndDisplay() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.firstNumber).append(" / ").append(this.secondNumber)
                .append(" = ").append(this.firstNumber / this.secondNumber)
                .append("\n");
        System.out.println(sb.toString());
    }
}
