package experiments.oop.project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author x14435708
 */
public class Question {
    private String Banswer;
    private String Canswer;
    private String Panswer;
    public Question(){
    Banswer = new String();
    Canswer = new String();
    Panswer = new String();
    }

    public String getCanswer() {
        return Canswer;
    }

    public void setCanswer(String Canswer) {
        this.Canswer = Canswer;
    }

    public String getPanswer() {
        return Panswer;
    }

    public void setPanswer(String Panswer) {
        this.Panswer = Panswer;
    }

    public String getAnswer() {
        return Banswer;
    }

    public void setAnswer(String Banswer) {
        this.Banswer = Banswer;
    }
    
}
