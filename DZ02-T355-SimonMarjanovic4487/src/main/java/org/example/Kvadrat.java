package org.example;

public class Kvadrat implements Oblik {
    private double a;

    public Kvadrat(double a) {
        this.a = a;
    }

    @Override
    public double obim() {
        return 4 * a;
    }

    @Override
    public double povrsina() {
        return a * a;
    }
}
