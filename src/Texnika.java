import java.util.Scanner;
public class Texnika{
    private int yearOfmade;
    private String color;
    private int price;
    public Texnika(){
    }
    public Texnika(int yearOfmade, String color, int price) {
        this.yearOfmade = yearOfmade;
        this.color = color;
        this.price = price;
    }

    public int getYearOfmade() {
        return yearOfmade;
    }

    public void setYearOfmade(int yearOfmade) {
        this.yearOfmade = yearOfmade;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void  start(){
        System.out.println("""
       Welcome to our store.
       What do you choose?       
                """);



    }
    public void stop(){
    }
}
