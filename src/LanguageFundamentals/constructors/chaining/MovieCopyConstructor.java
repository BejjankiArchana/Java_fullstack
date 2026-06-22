package LanguageFundamentals.constructors.chaining;
public class MovieCopyConstructor {

    String name;
    String director;
    String producer;
    String hero;
    String heroine;
    double budget;

    // 0 fields
    MovieCopyConstructor() {
        System.out.println("No Arg Constructor");
    }

    // 1 field
    MovieCopyConstructor(MovieCopyConstructor m, String name) {
        this();                 // chain to no-arg
        this.name = name;
    }

    // 2 fields
    MovieCopyConstructor(MovieCopyConstructor m,
                         String name,
                         String director) {

        this(m, name);          // chain to previous constructor
        this.director = director;
    }

    // 3 fields
    MovieCopyConstructor(MovieCopyConstructor m,
                         String name,
                         String director,
                         String producer) {

        this(m, name, director);
        this.producer = producer;
    }

    // 4 fields
    MovieCopyConstructor(MovieCopyConstructor m,
                         String name,
                         String director,
                         String producer,
                         String hero) {

        this(m, name, director, producer);
        this.hero = hero;
    }

    // 5 fields
    MovieCopyConstructor(MovieCopyConstructor m,
                         String name,
                         String director,
                         String producer,
                         String hero,
                         String heroine) {

        this(m, name, director, producer, hero);
        this.heroine = heroine;
    }

    void display() {
        System.out.println("Name      : " + name);
        System.out.println("Director  : " + director);
        System.out.println("Producer  : " + producer);
        System.out.println("Hero      : " + hero);
        System.out.println("Heroine   : " + heroine);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {

        MovieCopyConstructor m1 = new MovieCopyConstructor();

        MovieCopyConstructor m2 =
                new MovieCopyConstructor(m1, "Pushpa");

        MovieCopyConstructor m3 =
                new MovieCopyConstructor(m2,
                        m2.name,
                        "Sukumar");

        MovieCopyConstructor m4 =
                new MovieCopyConstructor(m3,
                        m3.name,
                        m3.director,
                        "Mythri Movies");

        MovieCopyConstructor m5 =
                new MovieCopyConstructor(m4,
                        m4.name,
                        m4.director,
                        m4.producer,
                        "Allu Arjun");

        MovieCopyConstructor m6 =
                new MovieCopyConstructor(m5,
                        m5.name,
                        m5.director,
                        m5.producer,
                        m5.hero,
                        "Rashmika");

        m6.display();
    }
}