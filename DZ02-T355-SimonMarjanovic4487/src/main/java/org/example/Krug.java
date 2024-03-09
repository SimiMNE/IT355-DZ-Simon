package org.example;
public class Krug implements Oblik {
    private double r;

    public Krug(double r) {
        this.r = r;
    }

    @Override
    public double obim() {
        return 2 * Math.PI * r;
    }

    @Override
    public double povrsina() {
        return Math.PI * r * r;
    }
}