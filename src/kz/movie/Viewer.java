package kz.movie;

public class Viewer extends Person {

    private int age;

    public Viewer (String name, int age){
        super(name);
        this.age = age;
    }
    @Override
    public String getRole() { return " kz.movie.Viewer"; }
    public int getAge(){
        return age;
    }

}
