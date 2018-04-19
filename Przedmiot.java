import java.util.ArrayList;

class Przedmiot {
    int nr_przed;
    static int ilosc;
    String nazwa;

    ArrayList<Wykladowca> wykladowcy = new ArrayList<Wykladowca>();
    ArrayList<Student> studenci = new ArrayList<Student>();


    public Przedmiot(String nazwa)
    {
        ilosc++;
        nr_przed = ilosc;
        this.nazwa = nazwa;
    }
}
