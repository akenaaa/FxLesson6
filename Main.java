//Problem2
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class Main {
//    public static void main(String[] args) {
//        Customer customer = new Customer(1,"Assem","Shimbergenova","Akhatkuzu","Pushkin 125", 1234,564);
//        Customer customer1 = new Customer(2,"Rashıd","Zhuldızay","NePomnu","Zhanatas",  1235,565);
//        Customer customer2 = new Customer(3,"Zhumashova","Aızh","NeZnaıu","Taldyk", 1236,566);
//        Customer customer3 = new Customer(4,"mmm","Dına","Zhambylkızı","Pushkın 123", 1237,567);
//        Customer customer4 = new Customer(5,"Tolegen","Aruzhan","Maratkızı","Apataeva 47", 1238,568);
//
//
//        ArrayList<Customer> customersArrayList = new ArrayList<>();
//        customersArrayList.add(customer);
//        customersArrayList.add(customer1);
//        customersArrayList.add(customer2);
//        customersArrayList.add(customer3);
//        customersArrayList.add(customer4);
//
//        Collections.sort(customersArrayList,new SortByName());
//        for(Customer s:customersArrayList){
//            System.out.println(s.getName());
//        }
//
//        int first = 564;
//        int second = 568;
//        ArrayList<Customer> range_customers = new ArrayList<>();
//        for(Customer l:customersArrayList){
//            if(l.getNumberCard()>=first && l.getNumberCard()<=second){
//                range_customers.add(l);
//            }
//        }
//        System.out.println("Gıven Range Customers");
//        for(Customer l:range_customers){
//            System.out.println(l);
//        }
//    }
//}
//
//
//
//class SortByName implements Comparator<Customer>{
//
//    @Override
//    public int compare(Customer first, Customer second) {
//        return first.getName().compareTo(second.getName());
//    }
//}
//class Customer{
//    int id;
//    String Surname;
//    String Name;
//    String Lastname;
//    String adress;
//    int NumberCard;
//    int BankNumber;
//    public Customer(int id,String Surname,String Name,String Lastname,String adress,int NumberCard,int BankNumber){
//        this.id =id;
//        this.Surname =Surname;
//        this.Name =Name;
//        this.Lastname =Lastname;
//        this.adress =adress;
//        this.NumberCard =NumberCard;
//        this.BankNumber =BankNumber;
//
//    }
//
//    @Override
//    public String toString() {
//        return "Customer{" +
//                "id=" + id +
//                ", Surname='" + Surname + '\'' +
//                ", Name='" + Name + '\'' +
//                ", Lastname='" + Lastname + '\'' +
//                ", adress='" + adress + '\'' +
//                ", NumberCard=" + NumberCard +
//                ", BankNumber=" + BankNumber +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return Surname;
//    }
//
//    public void setSurname(String Surname) {
//        this.Surname = Surname;
//    }
//
//    public String getName() {
//        return Name;
//    }
//
//    public void setName(String Name) {
//        this.Name = Name;
//    }
//
//    public String getLastname() {
//        return Lastname;
//    }
//
//    public void setLastname(String Lastname) {
//        this.Lastname = Lastname;
//    }
//
//    public String getAdres() {
//        return adress;
//    }
//
//    public void setAdres(String adress) {
//        this.adress = adress;
//    }
//
//    public int getNumberCard() {
//        return NumberCard;
//    }
//
//    public void setNumber_card(int NumberCard) {
//        this.NumberCard = NumberCard;
//    }
//
//    public int getBankNumber() {
//        return BankNumber;
//    }
//
//    public void setBankNumber(int BunkNumber) {
//        this.BankNumber = BunkNumber;
//    }
//}




//Problem3*********************************************************************************

//import java.util.ArrayList;
//
//public class Main{
// public static void main(String[] args) {
// Patient patient1 = new Patient(1,"Assem","Shimbergenova","Akhatkuzu","Pushkin 125","87053456070",1,"Animya");
// Patient patient2 = new Patient(2,"Rashıd","Zhuldızay","NePomnu","Zhanatas","870778795804",2,"Bronchitis");
// Patient patient3 = new Patient(3,"Zhumashova","Aızh","NeZnaıu","Taldyk","8775553458",3,"Allergy");
// Patient patient4 = new Patient(4,"mmm","Dına","Zhambylkızı","Pushkın 123","87075698990",4,"Allergy");
// Patient patient5 = new Patient(5,"Tolegen","Aruzhan","Maratkızı","Apataeva 47","87051307062",5,"Animya");
// ArrayList<Patient> patientsArrayList = new ArrayList<>();
// patientsArrayList.add(patient1);
// patientsArrayList.add(patient2);
// patientsArrayList.add(patient3);
// patientsArrayList.add(patient4);
// patientsArrayList.add(patient5);
//
//
// ArrayList<Patient> Animya = new ArrayList<>();
// String animya = "Animya";
// for(Patient s:patientsArrayList){
// if(s.getDiagnosis()==animya){
//     Animya.add(s);
//            }
//        }
// System.out.println("patients which have animya");
// for(Patient p:Animya){
// System.out.println(p);
//        }
//
//
//        int first = 1;
//        int second = 6;
//        ArrayList<Patient> interval = new ArrayList<>();
//        for(Patient s:patientsArrayList){
//            if(s.getMedicalCard()>=first && s.getMedicalCard()<=second){
//                interval.add(s);
//            }
//        }
//        System.out.println("Patients given interval ");
//        for(Patient p: interval){
//            System.out.println(p);
//        }
//    }
//}
//
//
//
//class Patient{
//    int id;
//    String surname;
//    String name;
//    String patronymic;
//    String adress;
//    String PhoneNumber;
//    int MedicalCard;
//    String diagnosis;
//    public Patient(int id,String surname,String name,String patronymic,String adress,String phonenumber,int medicalcard,String diagnosis){
//        this.id = id;
//        this.surname = surname;
//        this.name = name;
//        this.patronymic = patronymic;
//        this.adress = adress;
//        this.PhoneNumber = phonenumber;
//        this.MedicalCard = medicalcard;
//        this.diagnosis = diagnosis;
//    }
//
//    @Override
//    public String toString() {
//        return "Patient{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", name='" + name + '\'' +
//                ", patronymic='" + patronymic + '\'' +
//                ", adress='" + adress + '\'' +
//                ", phonenumber='" + PhoneNumber + '\'' +
//                ", medicalcard=" + MedicalCard +
//                ", diagnosis='" + diagnosis + '\'' +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPatronymic() {
//        return patronymic;
//    }
//
//    public void setPatronymic(String patronymic) {
//        this.patronymic = patronymic;
//    }
//
//    public String getAdres() {
//        return adress;
//    }
//
//    public void setAdres(String adress) {
//        this.adress = adress;
//    }
//
//    public String getPhone_number() {
//        return PhoneNumber;
//    }
//
//    public void setPhonenumber(String phonenumber) {
//        this.PhoneNumber = phonenumber;
//    }
//
//    public int getMedicalCard() {
//        return MedicalCard;
//    }
//
//    public void setMedicalcard(int medicalcard) {
//        this.MedicalCard = medicalcard;
//    }
//
//    public String getDiagnosis() {
//        return diagnosis;
//    }
//
//    public void setDiagnosis(String diagnosis) {
//        this.diagnosis = diagnosis;
//    }
//}




//Problem4****************************************************************************************************************

//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class Main {
//    public static void main(String[] args) {
//        applicant applicant1 = new applicant(1,"Assem","Shimbergenova","Akhatkuzu","Pushkin 125","87053456070",95);
//        applicant applicant2 = new applicant(2,"Rashıd","Zhuldızay","NePomnu","Zhanatas","870778795804",80);
//        applicant applicant3 = new applicant(3,"Zhumashova","Aızh","NeZnaıu","Taldyk","8775553458",90);
//        applicant applicant4 = new applicant(4,"mmm","Dına","Zhambylkızı","Pushkın 123","87075698990",89);
//        applicant applicant5 = new applicant(5,"Tolegen","Aruzhan","Maratkızı","Apataeva 47","87051307062",5);
//
//        ArrayList<applicant> applicantArrayList = new ArrayList<>();
//        applicantArrayList.add(applicant1);
//        applicantArrayList.add(applicant2);
//        applicantArrayList.add(applicant3);
//        applicantArrayList.add(applicant4);
//        applicantArrayList.add(applicant5);
//
//        ArrayList<applicant> jaqsi_emes_marks = new ArrayList<>();
//        for(applicant f: applicantArrayList){
//            if(f.getMarks()<65){
//                jaqsi_emes_marks.add(f);
//            }
//        }
//        System.out.println("neochen otsenki:");
//        for (applicant d:jaqsi_emes_marks) {
//            System.out.println(d);
//        }
//
//        int mark = 75;
//        ArrayList<applicant> more_than = new ArrayList<>();
//        for(applicant d:applicantArrayList){
//            if(d.getMarks()>mark){
//                more_than.add(d);
//            }
//        }
//        System.out.println("bally vyshe ukazannogo");
//        for(applicant f:more_than){
//            System.out.println(f);
//        }
//
//        int n = 3;
//        Collections.sort(applicantArrayList,new SortByMarks());
//        ArrayList<applicant> themost = new ArrayList<>();
//        System.out.println("naivysshiy obshchiy ball");
//        for(int i = 0;i<n;i++){
//            themost.add(applicantArrayList.get(i));
//        }
//        System.out.println(themost);
//
//
//        for(applicant f:applicantArrayList){
//            if(f.getMarks()>70){
//                System.out.println(f);
//            }
//        }
//
//    }
//}
//class SortByMarks implements Comparator<applicant> {
//
//    @Override
//    public int compare(applicant first, applicant second) {
//        if(first.getMarks() == second.getMarks()){
//            return 0;
//        }else if(first.getMarks()>second.getMarks()){
//            return -1;
//        }else{
//            return 1;
//        }
//    }
//}
//class applicant{
//    int id;
//    String surname;
//    String name;
//    String Patronymic;
//    String adress;
//    String phonenumber;
//    int marks;
//
//    public applicant(int id, String surname, String name, String Patronymic, String adress, String phonenumber, int marks) {
//        this.id = id;
//        this.surname = surname;
//        this.name = name;
//        this.Patronymic = Patronymic;
//        this.adress = adress;
//        this.phonenumber = phonenumber;
//        this.marks = marks;
//    }
//
//    @Override
//    public String toString() {
//        return "applicant{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", name='" + name + '\'' +
//                ", patronymic='" + Patronymic + '\'' +
//                ", adress='" + adress + '\'' +
//                ", phonenumber='" + phonenumber + '\'' +
//                ", marks=" + marks +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPatronymic() {
//        return Patronymic;
//    }
//
//    public void setPatronymic(String Patronymic) {
//        this.Patronymic = Patronymic;
//    }
//
//    public String getAdress() {
//        return adress;
//    }
//
//    public void setAdress(String adress) {
//        this.adress = adress;
//    }
//
//    public String getPhonenumber() {
//        return phonenumber;
//    }
//
//    public void setPhonenumber(String phonenumber) {
//        this.phonenumber = phonenumber;
//    }
//
//    public int getMarks() {
//        return marks;
//    }
//
//    public void setMarks(int marks) {
//        this.marks = marks;
//    }
//}



//Problem4***************************************************************************************************************************************
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String [] args){
//        ArrayList<Book> bookArrayList = new ArrayList<>();
//        Book book1 = new Book(1, "Harry Potter", "Joan Roling", "London",  2003, 320, 3000, "Saddle stitch binding");
//        Book book2 = new Book(2, "Little women", "Louisa May Acklot", "London",  2001, 453, 2300, "Coptic stitch binding");
//        Book book3 = new Book(3, "dorian grey", "idk ", "london",  1910, 628, 1890, " binding");
//
//
//        bookArrayList.add(book1);
//        bookArrayList.add(book2);
//        bookArrayList.add(book3);
//
//
//
//        for (Book s : bookArrayList){
//            if(s.getAuthor().equals("Joan Roling")){
//                System.out.println(s.name + " is Joan Roling's book");
//            }
//        }
//
//
//        for (Book s : bookArrayList){
//            if(s.getPublisher().equals("London")){
//                System.out.println(s.name + " is London publishing house's book");
//            }
//        }
//
//
//        for (Book s : bookArrayList){
//            if (s.getYear() > 2000){
//                System.out.println(s.name + " " + s.getYear());
//            }
//        }
//    }
//}
//
////task5 - book
//class Book{
//    int id;
//    String name;
//    String author;
//    String publisher;
//    int year;
//    int pages;
//    int price;
//    String typeOfBinding;
//
//    public Book (int id, String name, String author, String publisher, int year, int pages, int price, String typeOfBinding){
//        this.id = id;
//        this.name = name;
//        this.author = author;
//        this.publisher = publisher;
//        this.year = year;
//        this.pages = pages;
//        this.price = price;
//        this.typeOfBinding = typeOfBinding;
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", author='" + author + '\'' +
//                ", publisher='" + publisher + '\'' +
//                ", year=" + year +
//                ", pages=" + pages +
//                ", price=" + price +
//                ", typeOfBinding='" + typeOfBinding + '\'' +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public String getPublisher() {
//        return publisher;
//    }
//
//    public void setPublisher(String publisher) {
//        this.publisher = publisher;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public int getPages() {
//        return pages;
//    }
//
//    public void setPages(int pages) {
//        this.pages = pages;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public String getTypeOfBinding() {
//        return typeOfBinding;
//    }
//
//    public void setTypeOfBinding(String typeOfBinding) {
//        this.typeOfBinding = typeOfBinding;
//    }
//}
//
//


//Problem6**************************************************************************************************************************************************************
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String [] args){
//        ArrayList<House> houseArrayList = new ArrayList<>();
//        House house1 = new House(1, 1, 40, 1, 2, "Pushkin", "brick", 20);
//        House house2 = new House(2, 2, 70, 2,  2, "Pushkin", "brick", 10);
//        House house3 = new House(3, 3, 80, 3,  3, "Pushkin", "brick", 30);
//        houseArrayList.add(house1);
//        houseArrayList.add(house2);
//        houseArrayList.add(house3);
//
//
//             for (House s : houseArrayList){
//            if (s.getRooms() == 2){
//                System.out.println(s.apartment + ": " + s.getRooms() + ":room");
//            }
//        }
//
//        for (House s : houseArrayList){
//            if (s.getRooms() == 4){
//                if (s.getFloor() > 1 && s.getFloor() < 5){
//                    System.out.println(s);
//                }
//            }
//        }
//
//        for (House s : houseArrayList){
//            if (s.area > 40){
//                System.out.println(s.apartment + " area: " + s.area);
//            }
//        }
//    }
//}
//
//class House{
//    int id;
//    int apartment;
//    int area;
//    int floor;
//    int rooms;
//    String street;
//    String building;
//    int lifetime;
//
//    public House (int id, int apartment, int area, int floor, int rooms, String street, String building, int lifetime){
//        this.id = id;
//        this.apartment = apartment;
//        this.area = area;
//        this.floor = floor;
//        this.rooms = rooms;
//        this.street = street;
//        this.building = building;
//        this.lifetime = lifetime;
//    }
//
//    @Override
//    public String toString() {
//        return "House{" +
//                "id=" + id +
//                ", apartment=" + apartment +
//                ", area=" + area +
//                ", floor=" + floor +
//                ", rooms=" + rooms +
//                ", street='" + street + '\'' +
//                ", building='" + building + '\'' +
//                ", lifetime=" + lifetime +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getApartment() {
//        return apartment;
//    }
//
//    public void setApartmentr(int apartment) {
//        this.apartment = apartment;
//    }
//
//    public int getArea() {
//        return area;
//    }
//
//    public void setArea(int area) {
//        this.area = area;
//    }
//
//    public int getFloor() {
//        return floor;
//    }
//
//    public void setFloor(int floor) {
//        this.floor = floor;
//    }
//
//    public int getRooms() {
//        return rooms;
//    }
//
//    public void setRooms(int rooms) {
//        this.rooms = rooms;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public String getBuilding() {
//        return building;
//    }
//
//    public void setBuilding(String building) {
//        this.building = building;
//    }
//
//    public int getLifetime() {
//        return lifetime;
//    }
//
//    public void setifetime(int lifetime) {
//        this.lifetime = lifetime;
//    }
//}




//Problem7************************************************************************************************************************************************************************
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class Main{
// public static void main(String[] args) {
//
// Phone phone1 = new Phone(1,"Assem","Shimbergenova","Akhatkuzu","Pushkin 125",123,12,1,7);
// Phone phone2 = new Phone(2,"Rashıd","Zhuldızay","NePomnu","Zhanatas",111,12,10,24);
// Phone phone3 = new Phone(3,"Zhumashova","Aızh","NeZnaıu","Taldyk",134,21,29,12);
// Phone phone4 = new Phone(4,"mmm","Dına","Zhambylkızı","Pushkın 123",121,12,3,3);
// Phone phone5 = new Phone(5,"Tolegen","Aruzhan","Maratkızı","Apataeva 47",112,12,7,8);
// ArrayList<Phone> phoneArrayList = new ArrayList<>();
// phoneArrayList.add(phone1);
// phoneArrayList.add(phone2);
// phoneArrayList.add(phone3);
// phoneArrayList.add(phone4);
// phoneArrayList.add(phone5);
//
//
//        int berilgen_uakut = 12;
//        ArrayList<Phone> kop_time = new ArrayList<>();
//        for(Phone s:phoneArrayList){
//            if(s.getTime()>berilgen_uakut){
//                kop_time.add(s);
//            }
//        }
//        System.out.println(kop_time);
//
//
//
//
//
//        Collections.sort(phoneArrayList,new SortByName());
//    }
//}
//class SortByName implements Comparator<Phone> {
//
//    @Override
//    public int compare(Phone first, Phone second) {
//        return first.getName().compareTo(second.getName());
//    }
//}
//class Phone {
//    int id;
//    String surname;
//    String name;
//    String patronymic;
//    String adres;
//    int creditcard;
//    int debet;
//    int credit;
//    int time;
//
//    public Phone(int id, String surname, String name, String patronymic, String adres, int creditcard, int debet, int credit, int time) {
//        this.id = id;
//        this.surname = surname;
//        this.name = name;
//        this.patronymic = patronymic;
//        this.adres = adres;
//        this.creditcard = creditcard;
//        this.debet = debet;
//        this.credit = credit;
//        this.time = time;
//    }
//
//    @Override
//    public String toString() {
//        return "Phone{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", name='" + name + '\'' +
//                ", patronymic='" + patronymic + '\'' +
//                ", adres='" + adres + '\'' +
//                ", creditcard=" + creditcard +
//                ", debet=" + debet +
//                ", credit=" + credit +
//                ", time=" + time +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPatronymic() {
//        return patronymic;
//    }
//
//    public void setPatronymic(String patronymic) {
//        this.patronymic = patronymic;
//    }
//
//    public String getAdres() {
//        return adres;
//    }
//
//    public void setAdres(String adres) {
//        this.adres = adres;
//    }
//
//    public int getCreditcard() {
//        return creditcard;
//    }
//
//    public void setCreditcard(int creditcard) {
//        this.creditcard = creditcard;
//    }
//
//    public int getDebet() {
//        return debet;
//    }
//
//    public void setDebet(int debet) {
//        this.debet = debet;
//    }
//
//    public int getCredit() {
//        return credit;
//    }
//
//    public void setCredit(int credit) {
//        this.credit = credit;
//    }
//
//    public int getTime() {
//        return time;
//    }
//
//}



//Problem8*****************************************************************************************************************
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String [] args){
//        ArrayList<Car> carArrayList = new ArrayList<>();
//        Car car1 = new Car(1, "BMW", "70", 2000, "blue", 1000000, "905");
//        Car car2 = new Car(2, "Mersedes", "70", 2009, "black", 1050000, "560");
//        Car car3 = new Car(3, "Toyota", "75", 2020, "grey", 5000000, "754");
//
//        carArrayList.add(car1);
//        carArrayList.add(car2);
//        carArrayList.add(car3);
//
//        for (Car s : carArrayList){
//            if (s.brand.equals("Mersedes")){
//                System.out.println(s);
//            }
//        }
//
//        for (Car s : carArrayList){
//            if (s.brand.equals("Toyoto") && s.yearofissue < 2010){
//                System.out.println(s);
//            }
//        }
//
//        for (Car s : carArrayList){
//            if (s.yearofissue == 2002 && s.price > 6000000){
//                System.out.println(s);
//            }
//        }
//    }
//}
//
//class Car{
//    int id;
//    String brand;
//    String model;
//    int yearofissue;
//    String color;
//    int price;
//    String registrationNum;
//
//    public Car(int id, String brand, String model, int yearofissue, String color, int price, String registrationNum){
//        this.id = id;
//        this.brand = brand;
//        this.model = model;
//        this.yearofissue = yearofissue;
//        this.color = color;
//        this.price = price;
//        this.registrationNum = registrationNum;
//    }
//
//    @Override
//    public String toString() {
//        return "Car{" +
//                "id=" + id +
//                ", brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", yearofissue=" + yearofissue +
//                ", color='" + color + '\'' +
//                ", price=" + price +
//                ", registrationNum='" + registrationNum + '\'' +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getbrand() {
//        return brand;
//    }
//
//    public void setbrand(String stamp) {
//        this.brand = stamp;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public int getYearofissue() {
//        return yearofissue;
//    }
//
//    public void setYearofissue(int yearofissue) {
//        this.yearofissue = yearofissue;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public String getRegistrationNum() {
//        return registrationNum;
//    }
//
//    public void setRegistrationNum(String registrationNum) {
//        this.registrationNum = registrationNum;
//    }
//}




//Problem10***********************************************************************************************
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String [] args){
//        ArrayList<Train> trainsArrayList = new ArrayList<>();
//        Train train1 = new Train("Uzbekistan", 48, "14:52", 80);
//        Train train2 = new Train("China", 6, "14:45", 45);
//        Train train3 = new Train("Kazakhstan", 24, "14:49", 93);
//
//        trainsArrayList.add(train1);
//        trainsArrayList.add(train2);
//        trainsArrayList.add(train3);
//
//
//        for (Train s : trainsArrayList){
//            if (s.destination.equals("Uzbekistan")){
//                System.out.println(s);
//            }
//        }
//        for (Train s : trainsArrayList){
//            if (s.destination.equals("Uzbekistan")){
//                if (s.departuretime.equals("14:52")){
//                    System.out.println(s);
//                }
//            }
//        }
//
//        for (Train s : trainsArrayList){
//            if (s.destination.equals("China")){
//                if (s.seat == 95){
//                    System.out.println(s);
//                }
//            }
//        }
//    }
//}
//
//class Train{
//    String destination;
//    int trainnumber;
//    String departuretime;
//    int seat;
//
//    public Train(String destination, int trainnumber, String departuretime, int seat){
//        this.destination = destination;
//        this.trainnumber = trainnumber;
//        this.departuretime = departuretime;
//        this.seat = seat;
//    }
//
//    @Override
//    public String toString() {
//        return "Train{" +
//                "destination='" + destination + '\'' +
//                ", trainnumber=" + trainnumber +
//                ", departuretime='" + departuretime + '\'' +
//                ", quantityOfPlaces=" + seat +
//                '}';
//    }
//
//    public String getDestination() {
//        return destination;
//    }
//
//    public void setDestination(String destination) {
//        this.destination = destination;
//    }
//
//    public int getTrainnumber() {
//        return trainnumber;
//    }
//
//    public void setTrainnumber(int trainnumber) {
//        this.trainnumber = trainnumber;
//    }
//
//    public String getDeparturetime() {
//        return departuretime;
//    }
//
//    public void setDeparturetime(String departuretime) {
//        this.departuretime = departuretime;
//    }
//
//    public int getseat() {
//        return seat;
//    }
//
//    public void setseat(int seat) {
//        this.seat = seat;
//    }
//}