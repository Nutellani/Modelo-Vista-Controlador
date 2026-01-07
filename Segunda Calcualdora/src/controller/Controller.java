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
        view.setTitle("Calcudora Ashei :)");
        view.setLocationRelativeTo(null);
    }

    // METHODS
    private void addListeners() {
        this.view.btnSuma.addActionListener(this);
        this.view.btnResta.addActionListener(this);
        this.view.btnMultiplicacion.addActionListener(this);
        this.view.btnDivision.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton source = (JButton) e.getSource();
        double num1;
        double num2;
        try {
            num1 = getNumeroUno();
            num2 = getNumeroDos();
        } catch (NumberFormatException exception) {
            view.txtResultado.setText("ERROR DE INPUT");
            return;
        }
        model.setTxtNumeroUno(num1);
        model.setTxtNumeroDos(num2);

        switch (source.getText()) {
            case "Suma":
                model.sumar();
                break;
            case "Resta":
                model.restar();
                break;
            case "Multiplicación":
                model.multiplicar();
                break;
            case "División":
                model.dividir();
                break;
        }

        view.txtResultado.setText(model.getTxtResultado().toString());
    }

    private Double getNumeroUno() {
        //try {
        return Double.parseDouble(view.txtNumeroUno.getText());
        //} catch (NumberFormatException e) {
        //view.txtResultado.setText("ERROR DE INPUT");
        //}
        //return 0d;
    }

    private Double getNumeroDos() {
        return Double.parseDouble(view.txtNumeroDos.getText());
    }

}
