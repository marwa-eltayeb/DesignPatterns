/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Creational_Patterns.FactoryMethod;

/**
 *
 * @author Marwa
 */
public abstract class KnifeStore {
    public Knife orderKnife(String knifeType) {
    Knife knife = null;
    // now creating a knife is a method in the class knife = createKnife(knifeType);
    knife.sharpen();
    knife.polish();
    knife.pack();
    return knife;
    }
    
    
    abstract Knife createKnife(String type);

}
