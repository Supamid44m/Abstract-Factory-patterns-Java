public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory OpenWheelFactory = FactoryProducer.getFactory(true);
        RacingCar car1=OpenWheelFactory.BuildRacingcar("F1");
        car1.setcarbrand("ferrari");
        car1.showinfo();

        RacingCar car2=OpenWheelFactory.BuildRacingcar("Gokart");
        car2.showinfo();

        AbstractFactory StockFactory=FactoryProducer.getFactory(false);
        RacingCar car3=StockFactory.BuildRacingcar("GT");
        car3.showinfo();

    }
    
}

