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
public class BudgetKnifeStore extends KnifeStore{
    
    //up to any subclass of KnifeStore to define this method
    Knife createKnife(String knifeType) {
    if (knifeType.equals("steak")) {
    return new BudgetSteakKnife();
    } else if (knifeType.equals("chefs")) {
    return new BudgetChefsKnife();
    }
    //.. more types
    else return null;
}
    
}
