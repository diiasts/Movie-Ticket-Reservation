public class Main {
    public static void main(String[] args) {
        Film f1 = new Film("Titanic", 2500);
        Film f2 = new Film("Forrest Gump", 2200);

        CinemaService service = new CinemaService();

        service.addFilm(f1);
        service.addFilm(f2);

        Viewer v = new Viewer("Amir", 18);

        Person p = v;
        System.out.println(p.getRole());

        System.out.println(service.findFilmByTitle("Titanic"));

        service.sortByPrice();
        System.out.println(service.getFilms());

        Cinema cinema = new Cinema(f1, v);
        System.out.println(cinema);

        System.out.println("Filter (cheap movies): " + service.filterByMaxPrice(2400));
    }
}



