public class OpenWheelCarFactory  extends AbstractFactory{
    
    @Override
    public RacingCar BuildRacingcar(String carType){
       if(carType.equals("F1")){
          return new F1();
       }else if(carType.equals("Gokart")){
          return new Gokart("");
       }
       return null;
    }
    
}
