import java.util.*;
class BikeWithPolymorphism{  
  void run(){
	  System.out.println("running");
	  }  
}  
class Splendor extends BikeWithPolymorphism{  
  void run(){
	  System.out.println("running safely with 60km");
	  }  
  
  public static void main(String args[]){  
    BikeWithPolymorphism b = new Splendor();//upcasting  
    b.run();  
  }  
}