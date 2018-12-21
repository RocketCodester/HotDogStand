//         COSC 1337.S01
//         Lab 5
//         2015/4/7
//         TestHotDogStand.java
//---------------------------------------------------------------
public class TestHotDogStand {
    public static void main (String args[]){
        HotDogStand s1 = new HotDogStand(1,2);
        System.out.println(s1);
        HotDogStand s2 = new HotDogStand(2,2);
        System.out.println(s2);
        if(s1.equals(s2))
            System.out.println("Objects are equal");
        else
            System.out.println("Objects are not equal");
        HotDogStand s3 = new HotDogStand();
        System.out.println(s3); 
        System.out.println(HotDogStand.getTotalSold()); 
        HotDogStand s4 = new HotDogStand(s2);
        if(s4.equals(s2))
            System.out.println("Objects are equal");
        else
            System.out.println("Objects are not equal");        
        System.out.println(s4.getNumSold()); 
        s4.dispose();
        System.out.println(HotDogStand.getTotalSold()); 
    }
}