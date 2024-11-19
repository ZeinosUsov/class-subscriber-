
import java.util.ArrayList;
import java.util.List;

class Abonent { 
    private String id;
    private String surname;
    private String name;
    private String patronym;
    private String address; 
    private double totalCallTime; 
    private String creditCardNumber;
    private double debt;

   
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
    
    public Abonent() {
        this("N/A", "N/A", "N/A", "N/A", "N/A", 0, "N/A", 0);
    }
    
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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTotalCallTime(double totalCallTime) {
        this.totalCallTime = totalCallTime;
    }

    public void setCreditCardNumber(String creditCardNumber) { 
        this.creditCardNumber = creditCardNumber;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }
    
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

    public String getAddress() { 
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

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + patronym); 
        System.out.println("Адрес: " + address);
        System.out.println("Общее время разговоров: " + totalCallTime + " часа");
        System.out.println("Номер кредитной карточки: " + creditCardNumber);
        System.out.println("Задолжность: " + debt);
        System.out.println();
    }
}

public class Main { 
    public static void main(String[] args) {
        List<Abonent> abonents = new ArrayList<>(); 
        abonents.add(new Abonent("1", "Иванов", "Иван", "Иванович", "ул. Дмитриевская, 12", 5.2, "1111-2222-3333-4444", 100.00));

        double thresholdTime = 4.0; 
        System.out.println("Порог времени: " + thresholdTime); 

        for (Abonent abonent : abonents) {
            if (abonent.getTotalCallTime() > thresholdTime) {
                abonent.displayInfo(); 
            }
        }
    }
}




        

