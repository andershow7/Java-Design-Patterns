public class AbstractFactoryPatternDemo {
   public static void main(String[] args) {

      //get color factory
      AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

      //get an object of Color Red
      Color color1 = colorFactory.getColor("RED");
      color1.fill();

      //get an object of Color Green
      Color color2 = colorFactory.getColor("GREEN");
      color2.fill();

      //get an object of Color Blue
      Color color3 = colorFactory.getColor("BLUE");
      color3.fill();
      
   }
}