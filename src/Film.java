import java.util.Objects;

public class Film {
    private String title;
    private int price;

    public Film(String title, int price) {
        this.title = title;
        this.price = price;
    }

   public String getTitle(){
        return title;
   }

   public int getPrice(){
        return price;
   }

   @Override
   public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Film)) return false;
        Film film = (Film) o;
        return title.equals(film.title);
    }

    @Override
    public String toString() {
        return "Film{title='" + title + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
