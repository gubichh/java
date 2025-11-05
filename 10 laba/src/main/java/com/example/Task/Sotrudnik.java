package com.example.Task;

public abstract class Sotrudnik {
    private String fio;
    private String dolzhnost;
    private double oklad;

    public Sotrudnik(String fio, String dolzhnost, double oklad) throws ValidationException, OkladException {
        setFio(fio);
        setDolzhnost(dolzhnost);
        setOklad(oklad);
    }

    public String getFio() { return fio; }

    public void setFio(String fio) throws ValidationException {
        if (fio == null || fio.isBlank()) throw new ValidationException("ФИО не может быть пустым");
        this.fio = fio;
    }

    public String getDolzhnost() { return dolzhnost; }

    public void setDolzhnost(String dolzhnost) throws ValidationException {
        if (dolzhnost == null || dolzhnost.isBlank()) throw new ValidationException("Должность не может быть пустой");
        this.dolzhnost = dolzhnost;
    }

    public double getOklad() { return oklad; }

    public void setOklad(double oklad) throws OkladException {
        if (oklad < 0) throw new OkladException(oklad);
        if (Double.isNaN(oklad) || Double.isInfinite(oklad)) throw new OkladException(oklad);
        this.oklad = oklad;
    }

    public abstract double rasschitatZarplatu();

    @Override
    public String toString() {
        return fio + " (" + dolzhnost + "), оклад: " + oklad;
    }
}
