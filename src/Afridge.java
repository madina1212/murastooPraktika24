public class Afridge extends  Texnika{
    public Afridge(int yearOfmade, String color, int price) {
        super(yearOfmade, color, price);
    }
    public Afridge(){
    }
    public void getAfridge(){
        System.out.println("""
        'Afridge'
        1:The refrigerator was released in 2010
        2:The color of the refrigerator is brown
        3:The price of the refrigerator is 25,000soms        
                """);
    }
    public void  start(){
    }
    public void stop(){
    }
}
