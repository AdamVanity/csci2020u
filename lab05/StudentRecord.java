/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci2020lab05;

/**
 *
 * @author Andre
 */
public class StudentRecord{
    String sId;
    double assignments;
    double midterm;
    double exam;
    public  StudentRecord(String id, double assignments, double midterm, double exam){
        this.sId = id;
        this.assignments = assignments;
        this.midterm = midterm;
        this.exam = exam;       
        
    }
    
    public String getID(){return sId;}
    public double getAss(){return assignments;}
    public double getMidterm(){return midterm;}
    public double getExam(){return exam;}
    public String getLetter(){
        double value = (assignments *0.2) + midterm*0.3 + exam*0.5;
        if (value > 79){
            return "A";
        }
        else if (value > 69){
            return "B";
        }
        else if (value > 59){
            return "C";
        }
        else if (value > 49){
            return "D";
        }
        else{
            return "F";
        }
        
    }
}
