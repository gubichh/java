package com.example.Task;

public class ShtatnySotrudnik extends Sotrudnik {
    private double premiya;

    public ShtatnySotrudnik(String fio, String dolzhnost, double oklad, double premiya) throws ValidationException, OkladException {
        super(fio, dolzhnost, oklad);
        this.premiya = premiya;
    }

    public double getPremiya() { return premiya; }

    public void setPremiya(double premiya) { this.premiya = premiya; }

    @Override
    public double rasschitatZarplatu() {
        try {
            if (Double.isNaN(premiya) || Double.isInfinite(premiya)) throw new PremiyaException("Премия указана неверно: " + premiya);
            if (premiya < 0) throw new PremiyaException("Премия не может быть отрицательной: " + premiya);
            return getOklad() + premiya;
        } catch (PremiyaException e) {
            System.out.println("Ошибка премии: " + e.getMessage());
            return getOklad();
        } catch (Exception e) {
            System.out.println("Ошибка при расчёте зарплаты: " + e.getMessage());
            return 0.0;
        }
    }
}
