package com.example.Task;

import java.util.Objects;

public class Otdel {
    private String nazvanie;
    private int kolichestvoSotrudnikov;

    public Otdel(String nazvanie, int kolichestvoSotrudnikov) throws ValidationException {
        setNazvanie(nazvanie);
        setKolichestvoSotrudnikov(kolichestvoSotrudnikov);
    }

    public String getNazvanie() { return nazvanie; }

    public void setNazvanie(String nazvanie) throws ValidationException {
        if (nazvanie == null || nazvanie.isBlank()) throw new ValidationException("Название отдела не может быть пустым");
        this.nazvanie = nazvanie;
    }

    public int getKolichestvoSotrudnikov() { return kolichestvoSotrudnikov; }

    public void setKolichestvoSotrudnikov(int kolichestvoSotrudnikov) throws ValidationException {
        if (kolichestvoSotrudnikov < 0) throw new ValidationException("Количество сотрудников не может быть отрицательным");
        this.kolichestvoSotrudnikov = kolichestvoSotrudnikov;
    }

    @Override
    public String toString() {
        return "Отдел: " + nazvanie + ", сотрудников: " + kolichestvoSotrudnikov;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Otdel)) return false;
        Otdel otdel = (Otdel) o;
        return kolichestvoSotrudnikov == otdel.kolichestvoSotrudnikov && nazvanie.equals(otdel.nazvanie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazvanie, kolichestvoSotrudnikov);
    }
}
