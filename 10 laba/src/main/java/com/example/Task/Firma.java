package com.example.Task;

import java.util.Objects;

public class Firma {
    private String nazvanie;

    public Firma(String nazvanie) throws ValidationException {
        setNazvanie(nazvanie);
    }

    public String getNazvanie() { return nazvanie; }

    public void setNazvanie(String nazvanie) throws ValidationException {
        if (nazvanie == null || nazvanie.isBlank()) throw new ValidationException("Название фирмы не может быть пустым");
        this.nazvanie = nazvanie;
    }

    @Override
    public String toString() {
        return "Фирма: " + nazvanie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Firma)) return false;
        Firma firma = (Firma) o;
        return nazvanie.equals(firma.nazvanie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazvanie);
    }
}
