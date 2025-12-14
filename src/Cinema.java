public class Cinema {
    private String cinemaName;
    private int seats;

    public Cinema(String cinemaName, int seats){
        this.cinemaName = cinemaName;
        this.seats = seats;
    }
    public String getCinemaName(){
        return cinemaName;
    }
    public int getSeats(){
        return seats;
    }
    public void setCinemaName(){
        this.cinemaName = cinemaName;
    }
    public void setSeats(){
        this.seats = seats;
    }
}
