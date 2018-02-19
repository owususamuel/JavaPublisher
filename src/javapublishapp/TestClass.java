/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapublishapp;

/**
 *
 * @author owusu
 */
public class TestClass {

  
    public static void main(String[] args) {
        
        Publisher publish = new Publisher();
        
        publish = new Book();
        publish.setTitle("Kofi");
        publish.showProperties();
        
        publish = new Book("Grief Child", "Lawrance Dramani", 34, 435745302);
        publish.showProperties();
        
        publish = new Journal();
        publish.setIsbn(343432234);
        publish.showProperties();
        
        
        publish = new Journal("Artificial Intelligence", 5, 101, 720102252);     
        publish.showProperties();
        
    }
    
}
