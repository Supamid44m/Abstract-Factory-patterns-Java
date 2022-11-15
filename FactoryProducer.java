public class FactoryProducer {
    public static AbstractFactory getFactory(boolean OpenWheel){   
        if(OpenWheel){
           return new OpenWheelCarFactory();         
        }else{
           return new StockCarFactory();
        }
     }
    
}
