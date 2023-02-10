public class AwashingMachine extends Texnika{
    public AwashingMachine(int yearOfmade, String color, int price) {
        super(yearOfmade, color, price);
    }
    public AwashingMachine(){
    }
    public void getAwashingMachine(){
        System.out.println("""
        'AwashingMachine'
        1:The washing machine was released in 2012
        2:The color of the washing machine is white
        3:The price of the washing machine is 20,000 soms       
                """);
    }
    public void  start(){

    }
    public void stop(){

    }
}
