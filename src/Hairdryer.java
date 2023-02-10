public class Hairdryer extends  Texnika{
    public Hairdryer(int yearOfmade, String color, int price) {
        super(yearOfmade, color, price);
    }
    public Hairdryer() {
    }
    public void getHairdryer(){
        System.out.println("""
        'Hairdryer'
        1:The hair dryer was released in 2008
        2:The color of the hair dryer is red     
        3:The price of the hair dryer is 5000 soms   
                """);
    }
    public void  start(){
    }
    public void stop(){
    }
}
