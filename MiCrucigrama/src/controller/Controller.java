package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import model.Model;
import view.View;

public class Controller implements ActionListener {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void iniciar() {
        addListeners();
        view.setTitle("Crucigramix");
        view.setLocationRelativeTo(null);
    }

    private void addListeners() {
        this.view.buttonAnswer.addActionListener(this);
        this.view.button2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        JButton source = (JButton) event.getSource();

        view.boxTitle.setText(obtenerPista(source.getText()));

    }

    // METHODS
    private String obtenerPista(String texto) {

        switch (texto) {
            
            case "2":
                return "Personaje del League of Legends que obtiene su Power Spike cuando va 0/10";

        }
        return "NADAAAAA";
    }

}
