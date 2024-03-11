public class Inky {
    public Inky(String pinky){

     
System.out.println(pinky);
        
        
    }

    public Inky(String pinky, String blinky, String monky) {
        System.out.println( pinky + " " + blinky );
        System.out.println(  blinky + " " + monky );
        System.out.println(  pinky + " " + blinky + " " + monky);
    }

    public static void main(String[] args) {
        String pinky = "donky";
        String blinky = "pinky";
        String monky = "monky";

       

  Inky ponky2 = new Inky(pinky);

        Inky ponky = new Inky(pinky, blinky, monky);
    }
}