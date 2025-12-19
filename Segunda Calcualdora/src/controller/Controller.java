package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Model;
import view.View;

public class Controller implements ActionListener {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void iniciar(){
        addListeners();
        view.setTitle("Calcudora Ashei :)");
        view.setLocationRelativeTo(null);
    }
    
    // METHODS
    
    private void addListeners() {
        this.view.btnSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("chupala");
            }
        });
        this.view.btnResta.addActionListener(this);
        this.view.btnMultiplicacion.addActionListener(this);
        this.view.btnDivision.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e);
        
        System.out.println(e.getSource());
    }

}
