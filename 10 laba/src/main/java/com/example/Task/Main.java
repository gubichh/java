package com.example.Task;

public class Main {
    public static void main(String[] args) {


        try {
            try {
                Sotrudnik x = new ShtatnySotrudnik("Тест Т.Т.", "Разработчик", -1000, 500);
                System.out.println(x);
            } catch (OkladException e) {
                System.out.println("Невозможно создать сотрудника – указан отрицательный оклад: " + e.getOklad());
                throw e;
            } catch (ValidationException e) {
                System.out.println("Ошибка валидации при создании сотрудника: " + e.getMessage());
                throw e;
            }
        } catch (OkladException e) {
            System.out.println("Перехвачено в main (оклад): " + e.getMessage());
        } catch (ValidationException e) {
            System.out.println("Перехвачено в main (валидация): " + e.getMessage());
        }

        try {
            Firma firma = new Firma("Киба Софт");
            Otdel otdel = new Otdel("Разработка", 2);
            ShtatnySotrudnik ivanov = new ShtatnySotrudnik("Иванов И.И.", "Инженер", 1500, -200);
            KontraktnySotrudnik petrov = new KontraktnySotrudnik("Петров П.П.", "Аналитик", 1800);

            System.out.println(firma);
            System.out.println(otdel);
            System.out.println(ivanov + " | начислено: " + ivanov.rasschitatZarplatu());
            System.out.println(petrov + " | начислено: " + petrov.rasschitatZarplatu());

            try { otdel.setKolichestvoSotrudnikov(-1); }
            catch (ValidationException e) { System.out.println("Ошибка отдела: " + e.getMessage()); }

            try { ivanov.setOklad(-5); }
            catch (OkladException e) { System.out.println("Ошибка оклада (setter): " + e.getMessage()); }

            try { ivanov.setFio(""); }
            catch (ValidationException e) { System.out.println("Ошибка ФИО: " + e.getMessage()); }

        } catch (ValidationException | OkladException e) {
            System.out.println("Ошибка создания объектов: " + e.getMessage());
        }
    }
}
