import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
/*Sukurti klasę Book.
Properties: title, pages, releaseYear
visi properties turi būti inkapsuliuoti.
sukurti 3 objektus su reikšmėmis naudojantis tuščiu konstruktoriu, ir tris naudojantis pilnu konstuktoriu.
sudėti juos į knygų masyvą.
prasukti ciklą per masyvą ir atspausdinti knygas (naudojam getterius)*/

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        book1.setTitle("Harry Potter and the Philosopher's Stone");
        book1.setPages(223);
        book1.setReleaseYear(1997);
        book2.setTitle("Harry Potter and the Chamber of Secrets");
        book2.setPages(251);
        book2.setReleaseYear(1998);
        book3.setTitle("Harry Potter and the Prisoner of Azkaban");
        book3.setPages(317);
        book3.setReleaseYear(1999);

        Book book4 = new Book("Harry Potter and the Goblet of Fire", 636, 2000);
        Book book5 = new Book("Harry Potter and the Order of the Phoenix", 766, 2003);
        Book book6 = new Book("Harry Potter and the Half-Blood Prince", 607, 2005);
        Book book7 = new Book("Harry Potter and the Deathly Hallows", 607, 2007);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);

        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        System.out.println();

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle() + " " + books.get(i).getPages() + " " + books.get(i).getReleaseYea());
        }
        System.out.println();

/*Sukurti klasę Plant
Visi laukai turi būti private, turėti getterius ir setterius.
konstruktoriai - 2. tuščias ir su visais fieldais.

Klasės laukai:
Pavadinimas
lotyniskas pavadinimas
boolean vienmetis
kokiam zemyne auga
suaugusio augalo aukstis metrais.
ar valgomas?

Maine susikuriam masyvą saugoti augalams. sukuriame 4 augalus (2x2 pagal konstruktorius)

prasukti ciklą
pvz foreach ir atspausdinti augalus (naudojant toString() )*/

        Plant plant1 = new Plant();
        Plant plant2 = new Plant();

        plant1.setName("Common sunflower");
        plant1.setNameLatin("Helianthus annuus");
        plant1.setIsAnnual(true);
        plant1.setContinent("Europe, North and South America");
        plant1.setHeight(3);
        plant1.setEatable(false);

        plant2.setName("Strawberry");
        plant2.setNameLatin("Fragaria × ananassa");
        plant2.setIsAnnual(false);
        plant2.setContinent("Europe, North and South America, Asia");
        plant2.setHeight(0.2);
        plant2.setEatable(true);

        Plant plant3 = new Plant("Baobab", "Adansonia", false,
                "Africa, Australia", 30, false);
        Plant plant4 = new Plant("Oak", "Quercus ", false,
                "Asia, Europe, and North Africa.", 44, false);

        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(plant1);
        plants.add(plant2);
        plants.add(plant3);
        plants.add(plant4);

        for (Plant plant : plants) {
            System.out.println(plant);
        }
    }
}