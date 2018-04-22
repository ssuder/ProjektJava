

public class Osoba {
    private String nazwisko;
    private String pesel;
    private String rola;
    private int id;



    public Osoba(String nazwisko, String pesel, String rola, int id) {
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.rola = rola;
        this.id = id;

    }

    String getNazwisko() {

        return nazwisko;
    }

    String getPesel() {

        return pesel;
    }

    String getRola() {
        return rola;
    }

    int getId() {
    return id;
    }
}