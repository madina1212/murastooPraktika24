import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Texnika texnika = new Texnika();
        texnika.stop();
        System.out.println("""
                Welcome to our store.
                What do you choose?           
                         """);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            if (a <= 0) {
                System.out.println("Hello, can you show me the menu?");
            } else if (a <=1) {
                System.out.println("""
                        AllRight:
                        1:Blender
                        2:AwashingMachine
                        3:Afridge
                        4:Hairdryer
                        5:Tothebuhop
                                """);
            } else if (a <= 2) {
                Blender blender = new Blender();
                blender.getBlender();
            } else if (a <=3) {
                AwashingMachine awashingMachine = new AwashingMachine();
                awashingMachine.getAwashingMachine();
            } else if (a <=4) {
                Afridge afridge = new Afridge();
                afridge.getAfridge();
            } else if (a <=5) {
                Hairdryer hairdryer = new Hairdryer();
                hairdryer.getHairdryer();
            } else if (a <=6) {
                Tothebuhop tothebuhop = new Tothebuhop();
                tothebuhop.getTothebuhop();
            } else {
                System.out.println("I'm glad you came, please come again");
            }
        }
    }
}