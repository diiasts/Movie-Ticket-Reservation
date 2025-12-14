public class Main {
    public static void main(String[] args) {
        Film film1 = new Film("Titanic",194,2500);
        Film film2 = new Film("Forrest Gump", 142, 2300);

        Viewer viewer1 = new Viewer("Amir", 18);
        Viewer viewer2 = new Viewer("Sayan", 17);

        Cinema cinema1 = new Cinema("Chaplin Cinema", 150);
        Cinema cinema2 = new Cinema("Kinopark Cinema", 130);

        System.out.println("Film 1: " + film1.getTitle() + " and price of this film " + film1.getPrice());
        System.out.println("First film viewer: " + viewer1.getName() + " and he's " + viewer1.getAge());
        System.out.println("Cinema 1: " + cinema1.getCinemaName() + " and capacity of this cinema " + cinema1.getSeats());
        System.out.println();

        System.out.println("Film 2: " + film2.getTitle() + " and price of this film " + film2.getPrice());
        System.out.println("Second film viewer: " + viewer2.getName() + " and he's " + viewer2.getAge());
        System.out.println("Cinema 2: " + cinema2.getCinemaName() + " and capacity of this cinema " + cinema2.getSeats());
        System.out.println();

        if (film1.getPrice() > film2.getPrice()){
            System.out.println(film1.getTitle() + " is more expensive than " + film2.getTitle());
        } else {
            System.out.println(film2.getTitle() + "is more expensive than " + film1.getTitle());
        }
        System.out.println();

        if (cinema1.getSeats() > cinema2.getSeats()){
            System.out.println(cinema1.getCinemaName() + " is larger capacity than " + cinema2.getCinemaName());
        } else {
            System.out.println(cinema2.getCinemaName() + " is larger capacity than " + cinema1.getCinemaName());
        }
        System.out.println();

        if (viewer2.getAge() >= 18){
            System.out.println(viewer2.getName() + " can get into film");
        } else {
            System.out.println(viewer2.getName() + " can't get into film");
        }
        System.out.println();

        viewer2.setAge(20);

        if (viewer2.getAge() >= 18){
            System.out.println(viewer2.getName() + " can get into film");
        } else {
            System.out.println(viewer2.getName() + " can't get into film");
        }
        System.out.println();
    }
}
