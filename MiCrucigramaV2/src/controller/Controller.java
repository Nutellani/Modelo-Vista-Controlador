package controller;

import java.awt.Component;
import java.awt.Container;
import model.Model;
import view.View;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;

/*



    CAMBIAR: JTextPane por ---> ... JTextField (JTextPane no es compatible con addActionListener por eso o: se agrega un MouseAdapter para poder ser usado,
    o se debe CAMBIAR por otro JText)

    
    (CLASE DE CONSULTA)
    -Clase Model: Ver si el profe prefiere usar el MouseAdapter o los 51 AddActionListeners
    -Clase Controller: Donde se deber ubicar el metodo fillCasillasMap(). Lo puse en el controller para que el Model no tenga acceso a la View



 */

public class Controller implements ActionListener {

    private Model model;
    private View view;
    private String palabraActual;
    private HashMap<String, ArrayList<JTextPane>> casillasMap = new HashMap<>();

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

        MouseAdapter mouseAdapter = new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                JTextPane pane = (JTextPane) e.getSource();
                System.out.println(pane.getText());

                // ----------------------------
                
                // ----------------------------
            }
        };

        Container root = view.getContentPane();
        recorrerComponentes(root, mouseAdapter);
    }

    private void fillCasillasMap() {
        ArrayList<JTextPane> palabra1 = new ArrayList<>();
        palabra1.add(view.box1_1);
        palabra1.add(view.box1_2_2_2);
        palabra1.add(view.box1_3);
        palabra1.add(view.box1_4);
        palabra1.add(view.box1_5);
        palabra1.add(view.box1_6_3_1);

        casillasMap.put("btn1", palabra1);

    }

    private void recorrerComponentes(Component c, MouseAdapter mouseAdapter) {

        if (c instanceof JTextPane) {
            JTextPane pane = (JTextPane) c;
            pane.addMouseListener(mouseAdapter);
        }

        if (c instanceof Container || c instanceof JPanel) {
            for (Component child : ((Container) c).getComponents()) {
                recorrerComponentes(child, mouseAdapter);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton source = (JButton) e.getSource();
        palabraActual = source.getText();

        System.out.println(source.getText());

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

                view.textClue.setText(model.getPistaMap().get("btn7"));
                break;
        }

    }
}
