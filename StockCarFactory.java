public class StockCarFactory extends AbstractFactory {
    @Override
    public RacingCar BuildRacingcar(String carType){
       if(carType.equals("GT")){
          return new GT();
       }else if(carType.equals("Rally")){
          return new Rally();
       }
       return null;
    }
    
}
