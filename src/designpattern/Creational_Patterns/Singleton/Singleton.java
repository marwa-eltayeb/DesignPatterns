package designpattern.Creational_Patterns.Singleton;

/**
 * @author Marwa
 */
public class Singleton {  // lazy construction
    
    // the class variable is null if no instance is instantiated
    private static Singleton instance = null;

    private Singleton() {
    
    }
    
    // lazy construction of the instance
   public static Singleton getInstance() {
       
     if (instance == null) {
     instance = new Singleton();
     }
   
     return instance;
   }
    
}
