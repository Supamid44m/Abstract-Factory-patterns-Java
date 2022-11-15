public class GT {
    String carbrand;
    final int tiressize = 10;

     // Constructor
     public GT(){

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
