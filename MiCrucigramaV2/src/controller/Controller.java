package controller;

import model.Model;
import view.View;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import javax.swing.JButton;

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
        this.view.btn1.addActionListener(this);
        this.view.btn2.addActionListener(this);
        this.view.btn3.addActionListener(this);
        this.view.btn4.addActionListener(this);
        this.view.btn5.addActionListener(this);
        this.view.btn6.addActionListener(this);
        this.view.btn7.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton source = (JButton) e.getSource();
        System.out.println(source.getName());
        /*if (source.getName()) {

        }*/
        pistaSwitch(source.getText());

    }

    private void pistaSwitch(String button) {

        switch (button) {

            case "1":

                view.textClue.setText(model.getPistaMap().get("btn1"));
                break;

            case "2":

                view.textClue.setText(model.getPistaMap().get("btn2"));
                break;

            case "3":

                view.textClue.setText(model.getPistaMap().get("btn3"));
                break;

            case "4":

                view.textClue.setText(model.getPistaMap().get("btn4"));
                break;

            case "5":

                view.textClue.setText(model.getPistaMap().get("btn5"));
                break;

            case "6":

                view.textClue.setText(model.getPistaMap().get("btn6"));
                break;

            case "7":

                view.textClue.setText(model.getPistaMap().get("btn7w"));
                break;
        }

    }
}
