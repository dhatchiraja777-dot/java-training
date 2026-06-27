
class vehicle{
    void start(){
        System.out.println("vehicle is starting");
    }
}
class car extends vehicle{
    void drive(){
        System.out.println("vehicle is driving");
        
    }
}public class vehicleinheritane{
public static void main(String[] args) {
 car bar = new car();
 bar.start();
 bar.drive();
}   
}
