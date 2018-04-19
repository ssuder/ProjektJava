

public class Osoba {
    private String nazwisko;
    private String pesel;
    private String rola;
    public double oceny;


    public Osoba(String nazwisko, String pesel, String rola, double oceny) {
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.rola = rola;
        this.oceny = oceny;

    }
    String setNazwisko()   {
        return nazwisko;
    }
    String setPesel()       {
        return pesel;
    }
    double setOcena()       {
        if(rola==Wykladowca.wykladowca)   {

            return oceny;

        }

        return 0;
    }
}