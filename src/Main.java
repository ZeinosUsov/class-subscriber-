import java.util.ArrayList;
import  java.util.List;

Class abonent{
    private String id;
    private String surname;
    private String name;
    private String patronym;
    private String adress;
    private double TotalCallTime;//время звонка
private String creditCardNumber;//Номер кредитной карточки
private double debt;//задолжность

public abonent() String id, String surname, String name, String patronym, String adress,
    double TotalCallTime, String creditCardNumber, double debt){
    this.id = id;
    this.surname = surname;
    this.name = name;
    this.patronym = patronym;
    this.adress = adress;
    this.TotalCalTime = TotalCalltime;
    this.creditCardNumber = creditCardNumber;
    this.debt = debt;
}
public abonent(String id, String surname, String name, String patronym, String adress,
               double TotalCallTime, String creditCardNumber, double debt){
    this(surname, name, patronym,adress, 0, 0)}

public  void setrId(String id){
    this.id = id;
}
public void setSurname(String surname){
    this.surname = surname;
}
public  void setName(String name){
    this.name = name;
}
public void setPatronym(String patronym){
    this.patronym = patronym;
}
public void setAbonent(String adress){
    this.adress = adress;
}
public void setTotalCallTime(double TotalCallTime){
    this.TotalCallTimeotalCallTime = TotalCallTime;
}
public void setCreditCardNumber(String CreditCardNumber){
    this.creditCardNumber = CreditCardNumber;
}
public void setDebt(double debt){
    this.debt = debt;
}
        }
