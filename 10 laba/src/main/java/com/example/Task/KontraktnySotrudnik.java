package com.example.Task;

public class KontraktnySotrudnik extends Sotrudnik {
    public KontraktnySotrudnik(String fio, String dolzhnost, double oklad) throws ValidationException, OkladException {
        super(fio, dolzhnost, oklad);
    }

    @Override
    public double rasschitatZarplatu() {
        try {
            return getOklad();
        } catch (Exception e) {
            System.out.println("Ошибка при расчёте зарплаты: " + e.getMessage());
            return 0.0;
        }
    }
}
