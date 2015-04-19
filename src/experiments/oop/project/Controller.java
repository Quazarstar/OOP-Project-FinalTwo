/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package experiments.oop.project;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


/**
 *
 * @author david
 */
public class Controller {
    private String cycle;
    private String subject;
    private String area;
    
    public void setCycle(String cycle){
        this.cycle = cycle;
        }
    
    public void setSubject(String subject){
        this.subject = subject;
        }
    
    public void setArea(String area){
        this.area = area;
    }
    
    public String getCycle(){
        return cycle;
    }
    
    public String getSubject(){
        return subject;
    }
    
    public String getArea(){
        return area;
    }
   
    
    public void writeCycle(){
        try{
                FileWriter fw = new FileWriter("selection.txt");
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(cycle);
                bw.close();
                
        }
        catch(IOException e){JOptionPane.showMessageDialog(null, "We have an issue in writing");}
    }
    
    
    public void writeSubject(){
        try{
                FileWriter fw2 = new FileWriter("selection2.txt");
                BufferedWriter bw2 = new BufferedWriter(fw2);
                bw2.write(subject);
                bw2.close();
                
                
        }
        catch(IOException e){JOptionPane.showMessageDialog(null, "We have an issue in writing");}
    }
    
    public void writeArea(){
        try{
                FileWriter fw3 = new FileWriter("selection3.txt");
                BufferedWriter bw3 = new BufferedWriter(fw3);
                bw3.write(area);
                bw3.close();
                
        }
        catch(IOException e){JOptionPane.showMessageDialog(null, "We have an issue in writing");}
    }
    
    
    public void readIn(){
        try {
        FileReader re = new FileReader("selection.txt");
        BufferedReader red = new BufferedReader(re);
        cycle = red.readLine();
        red.close();
        
        FileReader re2 = new FileReader("selection2.txt");
        BufferedReader red2 = new BufferedReader(re2);
        subject = red2.readLine();
        red2.close();
        
        FileReader re3 = new FileReader("selection3.txt");
        BufferedReader red3 = new BufferedReader(re3);
        area = red3.readLine();
        red3.close();
        
        
        }
        catch(IOException e){JOptionPane.showMessageDialog(null, "We have an issue in reading");}
    }
    
    public void checker(){
        JOptionPane.showMessageDialog(null,"Cycle => " + cycle + ". Subject => " + subject);
    
    } 
}


