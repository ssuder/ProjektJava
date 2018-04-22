import java.util.ArrayList;

class Wykladowca extends Osoba{

    ArrayList<Przedmiot> wykladowcy_przed = new ArrayList<Przedmiot>();
    private Object Przedmiot;

    public Wykladowca(String nazwisko, String pesel, String rola, int id){
        super(nazwisko, pesel, rola, id);
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

    public void ocen(Przedmiot przedmiot,Student student, double i)
    {
        student.eso.put(przedmiot, new Oceny(student.eso.get(przedmiot).getOcenaWyk(), i));
    }
}


