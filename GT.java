public class GT implements RacingCar{
    String carbrand;
    final int tiressize = 18;

     // Constructor
     public GT(){
        System.out.println("GT Car");

    }
     public GT(String carbrand){
         this.carbrand=carbrand;
     }
     //method
    
    public void setcarbrand(String carbrand){
        this.carbrand=carbrand;
       
    }
    public void gettiresSize(){
        
    }

    public void showinfo(){
        System.out.println("Brand:"+" "+carbrand);
        System.out.println("TiresSize:"+" "+tiressize);
    }
    
}
