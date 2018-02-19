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
public class Journal extends Publisher {
    
    private int volNumber;
    private int issueNumber;


    public int getVolNumber() {
        return volNumber;
    }

    public void setVolNumber(int volNumber) {
        this.volNumber = volNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
    
    public Journal() {
        this("No title", 1, 0, 0);
    }
    
    public Journal(String myTitle, int myVolN, int myIssueNum, long myIsbn) {
        super("Journal");
        title = myTitle;
        volNumber = myVolN;
        issueNumber = myIssueNum;
        isbn = myIsbn;
    }
    
    @Override
    public void showProperties() {
        super.showProperties();
        System.out.println("Journal title is: "+ title);
        System.out.println("Jounal vol number is: "+ volNumber);
        System.out.println("Issue Number: "+issueNumber);
        System.out.println("ISBN: "+isbn+ "\n");
        
    }
}
