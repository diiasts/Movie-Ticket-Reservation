public class Film {
    private String title;
    private int duration;
    private int price;

    public Film(String title, int duration, int price) {
        this.title = title;
        this.duration = duration;
        this.price = price;
    }
   public String getTitle(){
        return title;
   }
   public int getDuration(){
        return duration;
   }
   public int getPrice(){
        return price;
   }
   public void setTitle(String title){
        this.title = title;
   }
   public void setDuration(int duration){
        this.duration = duration;
   }
   public void setPrice(int price){
        this.price = price;
   }
}
