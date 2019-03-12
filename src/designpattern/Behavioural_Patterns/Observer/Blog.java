package designpattern.Behavioural_Patterns.Observer;

/**
 *
 * @author Marwa
 */
public class Blog extends Subject {
    
    private String state;
    
    public String getState(){
        return state;
    }
    
    // blog responsibilities

    @Override
    public void registerObserver(Observer observer) {
        super.registerObserver(observer); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Subscriber is registered to Blog");
    }

    @Override
    public void notifyMe() {
        super.notifyMe(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Subscriber is informed by change to the Blog");
    }

    @Override
    public void unregisterObserver(Observer observer) {
        super.unregisterObserver(observer); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Subscriber is unregistered to Blog");
    }
    
    
    
}
