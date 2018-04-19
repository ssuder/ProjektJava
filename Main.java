public class Main {

    public static void main(String[] args) {


        Student stud1 = new Student("Samuel Suder", "12345678");
        Student stud2 = new Student("Jan Kowalski", "23456789");

        Wykladowca wykl1 = new Wykladowca("Maria Nowak", "01234567890");
        Wykladowca wykl2 = new Wykladowca("Antoni Antoni", "13579246802");


        Przedmiot FIL = new Przedmiot("Filozofia");
        Przedmiot SOC = new Przedmiot("Socjologia");

        wykl1.dodaj(FIL);
        wykl1.dodaj(SOC);
        wykl2.dodaj(FIL);

        stud1.dodaj(FIL);
        stud1.dodaj(SOC);
        stud2.dodaj(FIL);
        stud1.dodaj(SOC);


        wykl1.oceny(FIL, stud1, 5);

        wykl1.oceny(SOC, stud1, 3);
        wykl1.oceny(SOC, stud2, 5);


        System.out.println("Srednia: " + stud1.srednia());
        System.out.println("Lista studentów - Filozofia:");
        FIL.listStud();
        System.out.println("Lista wykladowcow:");
        FIL.listWykl();
    }
}