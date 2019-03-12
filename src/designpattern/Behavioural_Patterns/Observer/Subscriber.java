package designpattern.Behavioural_Patterns.Observer;

/**
 *
 * @author Marwa
 */
public class Subscriber implements Observer {

    public void update() {
      // get the blog change
        System.out.println("updated");
    }

}
