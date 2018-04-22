import java.util.ArrayList;

class Przedmiot {
    int nr_przed;
    static int ilosc;
    String nazwa;

    ArrayList<Wykladowca> wykladowcy = new ArrayList<>();
    ArrayList<Student> studenci = new ArrayList<>();


    public Przedmiot(String nazwa)
    {
        ilosc++;
        nr_przed = ilosc;
        this.nazwa = nazwa;
    }

    public void dodajStudenta(Student student) {
        studenci.add(student);
    }

    public void usunStudenta(Student student) {
        studenci.remove(student);
    }

    public void listStud() {

            for (int i=0; i!=studenci.size(); i++){
                System.out.println("ID:" + studenci.get(i).getId() + " - " + studenci.get(i).getNazwisko());
            }
    }

}
