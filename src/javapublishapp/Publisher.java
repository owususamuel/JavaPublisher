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
public class Publisher {
    
    String title;
    long isbn;
    
    public Publisher() {
        
    }
    
    public Publisher(String type) {
        System.out.println("Details of "+type+" follows: ");
    }
    
    public void showProperties() {
        System.out.println("A puplication from Fonnoo Prints!");
        
    }
    
    
    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
}
