import java.util.ArrayList;

class Wykladowca extends Osoba{

    public static final String wykladowca;
    ArrayList<Przedmiot> wykladowcy_przed = new ArrayList<Przedmiot>();

    public Wykladowca(String nazwisko, String pesel, String rola, double Oceny){
        super(nazwisko, pesel, rola, oceny);
    }
    public void dodaj(Przedmiot przed)
    {
        wykladowcy_przed.add(przed);
        przed.wykladowcy.add(this);
    }
    public void usun(Przedmiot przed)
    {
        wykladowcy_przed.remove(przed);
        przed.wykladowcy.remove(this);
    }
}
