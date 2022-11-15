public class Rally  implements RacingCar{
    String carbrand;
    final int tiressize = 15;

     // Constructor
     public Rally(){
        System.out.println("Rally Car");
    }
     public Rally(String carbrand){
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
