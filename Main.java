public class Main {

    public static void main(String[] args) {

        Student student = new Student("Samuel Suder", "12345678", "student", 6);
        Student student1 = new Student("Jacek Kowalski", "34234234","student",7);
        Wykladowca wykladowca = new Wykladowca("Jan Nowak", "1235353", "wykladowca", 5);



        Przedmiot przedmiot1 = new Przedmiot("Filozofia");
        wykladowca.dodaj(przedmiot1);
        student.dodaj(przedmiot1);
        student1.dodaj(przedmiot1);
        wykladowca.ocen(przedmiot1, student, 5);
        wykladowca.ocen(przedmiot1, student1, 3);
        //Przedmiot SOC = new Przedmiot("Socjologia");


// yu dalej idą jakiś method nie wiem dlaczego, ale stłożułem methody żeby mogna było startować main


        System.out.println("Srednia: " + student.srednia());
        System.out.println("Lista studentów - Filozofia:");
        przedmiot1.listStud();
    }
}