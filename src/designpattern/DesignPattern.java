/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

import designpattern.Behavioural_Patterns.Observer.Blog;
import designpattern.Behavioural_Patterns.Observer.Owner;
import designpattern.Behavioural_Patterns.Observer.Subject;
import designpattern.Behavioural_Patterns.Observer.Subscriber;

/**
 *
 * @author Marwa
 */
public class DesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Blog b = new Blog();
        Subscriber s1 = new Subscriber();
        Subscriber s2 = new Subscriber();
        Subscriber s3 = new Subscriber();
        b.registerObserver(s1);
        b.registerObserver(s2);
        b.registerObserver(s3);
        b.notifyMe();
        b.unregisterObserver(s3);
     
    }
    
}
