
import java.util.ArrayList;
import java.util.List;

class Abonent { // Исправлено: "Class" на "class", имя класса с большой буквы
    private String id;
    private String surname;
    private String name;
    private String patronym;
    private String address; // Исправлено: "adress" на "address"
    private double totalCallTime; // Исправлено: правильный стиль написания переменных
    private String creditCardNumber;
    private double debt;

    // Конструктор
    public Abonent(String id, String surname, String name, String patronym, String address,
                   double totalCallTime, String creditCardNumber, double debt) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronym = patronym;
        this.address = address;
        this.totalCallTime = totalCallTime;
        this.creditCardNumber = creditCardNumber;
        this.debt = debt;
    }

    // Конструктор по умолчанию
    public Abonent() {
        this("N/A", "N/A", "N/A", "N/A", "N/A", 0, "N/A", 0);
    }

    // Сеттеры
    public void setId(String id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronym(String patronym) {
        this.patronym = patronym;
    }

    public void setAddress(String address) { // Исправлено: название метода
        this.address = address;
    }

    public void setTotalCallTime(double totalCallTime) {
        this.totalCallTime = totalCallTime;
    }

    public void setCreditCardNumber(String creditCardNumber) { // Исправлено: название параметра
        this.creditCardNumber = creditCardNumber;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    // Геттеры
    public String getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronym() {
        return patronym;
    }

    public String getAddress() { // Исправлено: название метода
        return address;
    }

    public double getTotalCallTime() {
        return totalCallTime;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public double getDebt() {
        return debt;
    }

    public void displayInfo() { // Исправлено: название метода
        System.out.println("ID: " + id);
        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + patronym); // Пример добавления отчества для полноты
        System.out.println("Адрес: " + address);
        System.out.println("Общее время разговоров: " + totalCallTime + " часа");
        System.out.println("Номер кредитной карточки: " + creditCardNumber);
        System.out.println("Задолжность: " + debt);
        System.out.println();
    }
}

public class Main { // Исправлено: имя класса с большой буквы
    public static void main(String[] args) {
        List<Abonent> abonents = new ArrayList<>(); // Исправлено: инициализация списка
        abonents.add(new Abonent("1", "Иванов", "Иван", "Иванович", "ул. Дмитриевская, 1", 5.2, "1111-2222-3333-4444", 100.00));

        double thresholdTime = 4.0; // Исправлено: правильное название переменной
        System.out.println("Порог времени: " + thresholdTime); // Исправлено: добавлено описание

        for (Abonent abonent : abonents) {
            if (abonent.getTotalCallTime() > thresholdTime) {
                abonent.displayInfo(); // Исправлено: правильное название метода
            }
        }
    }
}





        

