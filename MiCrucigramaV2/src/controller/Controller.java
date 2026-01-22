package controller;

import java.awt.event.ActionEvent;
import model.Model;
import view.View;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
    
    private Model model;
    private View view;
    
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;   
    }

    public void iniciar(){
        
    }    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
