public class FactoryProducer {
   public static AbstractFactory getFactory(String choice){
   
      if(choice.equalsIgnoreCase("COLOR"))
         return new ColorFactory();
      
      return null;
   }
}