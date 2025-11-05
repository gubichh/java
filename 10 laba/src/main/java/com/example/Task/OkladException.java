package com.example.Task;

public class OkladException extends Exception {
    private final double oklad;
    public OkladException(double oklad) {
        super("Отрицательный оклад: " + oklad);
        this.oklad = oklad;
    }
    public double getOklad() { return oklad; }
}
