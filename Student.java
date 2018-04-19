import java.util.HashMap;

class Student extends Osoba
{
    public static final String student;
    int numer_indeksie;
    static int ilosc;
    HashMap<Przedmiot, Oceny> dziennik = new HashMap<Przedmiot, Oceny> ();

    public Student(String nazwisko, String pesel, String rola, double Oceny)
    {
        super(nazwisko, pesel, rola, oceny);
        ilosc++;
        numer_indeksie = ilosc;
    }
    public void dodaj(Przedmiot przedmiot)
    {
        dziennik.put(przedmiot, new Oceny(0) );
        przedmiot.dodajStudenta(this);
    }
    public void usun(Przedmiot przedmiot)
    {
        dziennik.remove(przedmiot);
        przedmiot.usunStudenta(this);
    }

    public double srednia()
    {
        double suma_ocen = 0;
        for (Przedmiot key : dziennik.keySet())
        {
            suma_ocen = suma_ocen + dziennik.get(key).getOcenaWyk();
        }
        suma_ocen = suma_ocen / (dziennik.size()*2);
        return suma_ocen;
    }
}
