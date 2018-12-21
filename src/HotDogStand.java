//         COSC 1337.S01
//         Lab 5
//         2015/4/7
//         HotDogStand.java
//---------------------------------------------------------------
public class HotDogStand {
    private static int totalHotDogsSold = 0;
    private int numberID;
    private int hotDogsSold;
    private boolean disposeCalled=false;
    public HotDogStand(){
        numberID = 1;
        hotDogsSold = 0; 
        totalHotDogsSold+=hotDogsSold;
        System.out.println("Hot Dog Stand class - default constructor");
    }
    public HotDogStand(int numberID, int hotDogsSold){
        this.numberID = numberID;
        this.hotDogsSold = hotDogsSold;
        totalHotDogsSold+=hotDogsSold;
        System.out.println("Hot Dog Stand class - overloaded constructor");
    }
    public int getNumberID(){return numberID;}
    public static int getTotalSold(){return totalHotDogsSold;};
    @Override
    public String toString (){
        String x = " " + numberID + " " + hotDogsSold;
        return x;
    }
    public void numberID(int numberID){
        numberID++;
    }
    public void justSold(int hotDogsSold){
        hotDogsSold++;
        totalHotDogsSold++;
    }
    public int getNumSold(){return hotDogsSold;}
    
    public HotDogStand(HotDogStand original){
        if(original == null){
            throw new NullPointerException();
        } 
        else{
            numberID = original.numberID;
            hotDogsSold = original.hotDogsSold;
            totalHotDogsSold+=hotDogsSold;
            disposeCalled = false;
            System.out.println("Hot Dog Stand class - copy constructor");
        }
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj != null && getClass() == obj.getClass()){
            HotDogStand d = (HotDogStand)obj;
            return this.numberID == d.numberID;                    
        } 
        else{
            return false;
        }
    }
    @Override
    public void finalize(){
        System.out.println("Hot Dog Stand class - finalize method");
    }
    public void dispose(){
        disposeCalled = true;
        System.out.println("Hot Dog Stand class - dispose method");
    }
}