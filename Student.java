import java.util.HashMap;

class Student extends Osoba
{

    int numer_indeksie;
    static int ilosc;
    HashMap<Przedmiot, Oceny> eso = new HashMap<Przedmiot, Oceny> ();

    public Student(String nazwisko, String pesel, String rola, int id)
    {
        super(nazwisko, pesel, rola, id);
        id++;
        numer_indeksie = id;
    }


    public void dodaj(Przedmiot przedmiot)
    {
        eso.put(przedmiot, new Oceny(0) );
        przedmiot.dodajStudenta(this);
    }
    public void usun(Przedmiot przedmiot)
    {
        eso.remove(przedmiot);
        przedmiot.usunStudenta(this);
    }

    public double srednia()
    {
        double suma_ocen = 0;
        for (Przedmiot key : eso.keySet())
        {
            suma_ocen = suma_ocen + eso.get(key).getOcenaWyk();
        }
        suma_ocen = suma_ocen / eso.size();
        return suma_ocen;
    }
}
