public class Blender extends  Texnika {
    public Blender(int yearOfmade, String color, int price) {
        super(yearOfmade, color, price);
    }
    public Blender() {
    }
    public void getBlender(){
        System.out.println("""
        'Blender'
        1:Blender was released in 2015
        2:The color of the blender is white
        3:The price of the blender is 1690 soms        
                """);
    }
    public void start() {
    }
    public void stop() {
    }
}
