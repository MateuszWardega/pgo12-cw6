public class MediaBiblioteczne {
    protected String tytul;
    protected int rokWydania;
    protected boolean dostepny;

    public MediaBiblioteczne(String tytul, int rokWydania) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        this.dostepny = true;
    }

    public void wypozycz() {
        if (dostepny) {
            dostepny = false;
            System.out.println("Medium \"" + tytul + "\" zostało wypożyczone.");
        } else {
            System.out.println("Medium \"" + tytul + "\" jest już wypożyczone.");
        }
    }

    public void zwroc() {
        if (!dostepny) {
            dostepny = true;
            System.out.println("Medium \"" + tytul + "\" zostało zwrócone.");
        } else {
            System.out.println("Medium \"" + tytul + "\" nie było wypożyczone.");
        }
    }

    public void wyswietlInformacje() {
        System.out.println("Tytuł: " + tytul);
        System.out.println("Rok wydania: " + rokWydania);
        System.out.println("Status: " + (dostepny ? "Dostępne" : "Wypożyczone"));
    }
}
