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
    this("N/A", surname, name, patronym,adress, 0, "N/A",  0)}

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
    this.TotalCallTime = TotalCallTime;
}
public void setCreditCardNumber(String CreditCardNumber){
    this.creditCardNumber = CreditCardNumber;
}
public void setDebt(double debt){
    this.debt = debt;
}
public String getId(){
    return id;
}
public String getSurname(){
    return surname;
}
public String getName(){
    return name;
}
public String getPatronym(){
    return patronym;
}
public String getAdress(){
    return adress;
}
public double getTotalCallTime(){
    return TotalCallTime;
}
public String getCreditCardNumber(){
    return creditCardNumber;
}
public double getDebt(){
    return debt;
}
public void displayinfo(){
    System.out.println("ID:" + id);
    System.out.println("фамилия:" + surname);
    System.out.println("имя:" + name);
    System.out.println("адрес:" + adress);
    System.out.println("общее время разговора:" + TotalCallTime +"часов");
    System.out.println("номер кредитной карточки:" + creditCardNumber);        
    System.out.println("Задолжность:" + debt);
 System.out.println();
    }
}

public class main{
    public static void main(String[] args){
        abonent 
            List<abonent>abonents=new
            ArrayList<>();
        abonent.add(new Abonent ("1", "Иванов","Иван","Иванович", "ул.Дмитриевская,1", 5.2, "1111-2222-3333-4444-5555", 100.00));

double thresholdTime = 4.0; 
        System.out.println(thresholTime);

        for(Abonent abonent : abonents){
            if (abonent.getTotalCallTime()>thresholdTime){
                abonent.displayinfo();
            }
        }
    }
}





        

