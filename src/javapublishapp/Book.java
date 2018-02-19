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
public class Book extends Publisher {
    private String author;
    private int editNumber;

          
    public Book() {
        this("No title", "Unknown", 0, 0);
    }
    
    public Book(String mtitle, String author, int editNumber, long isbn) {
        super("Book");
        title = mtitle;
        this.author = author;
        this.editNumber = editNumber;
        this.isbn = isbn;
    }
   

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getEditNumber() {
        return editNumber;
    }

    public void setEditNumber(int editNumber) {
        this.editNumber = editNumber;
    }


    @Override
     public void showProperties() {
         super.showProperties();
        System.out.println("Book title is  "+ title);
        System.out.println("Author of the is: "+ author);
        System.out.println("Edition Number: "+editNumber);
        System.out.println("ISBN: "+isbn +"\n");
        
    }
    
    
}
