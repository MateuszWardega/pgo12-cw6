public class TestBiblioteki {
    public static void main(String[] args) {
        // Tworzenie obiektów
        Ksiazka ksiazka1 = new Ksiazka("Władca Pierścieni", 1954, "J.R.R. Tolkien", 1000);
        Ksiazka ksiazka2 = new Ksiazka("Zbrodnia i kara", 1866, "Fiodor Dostojewski", 430);
        Film film1 = new Film("Incepcja", 2010, "Christopher Nolan", 148);
        Film film2 = new Film("Toy Story", 1995, "John Lasseter", 81);

        // Tablica polimorficzna
        MediaBiblioteczne[] biblioteka = { ksiazka1, ksiazka2, film1, film2 };

        // Pętla - wyświetlanie informacji
        for (MediaBiblioteczne media : biblioteka) {
            media.wyswietlInformacje();
            System.out.println();
        }

        // Demonstracja wypożyczenia i zwrotu
        ksiazka1.wypozycz();
        ksiazka1.wypozycz(); // ponowna próba
        ksiazka1.zwroc();
        System.out.println();

        // Wywołanie metod specyficznych
        ksiazka1.sprawdzLiczbeStron();
        film1.sprawdzCzasTrwania();
        System.out.println();


        // Rzutowanie i instanceof
        for (MediaBiblioteczne media : biblioteka) {
            if (media instanceof Ksiazka) {
                ((Ksiazka) media).sprawdzLiczbeStron();
            } else if (media instanceof Film) {
                ((Film) media).sprawdzCzasTrwania();
            }
        }
    }
}
