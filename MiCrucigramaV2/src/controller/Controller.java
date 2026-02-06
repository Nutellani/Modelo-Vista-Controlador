package controller;

import model.Model;
import view.View;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JTextField;

/*


    (CLASE DE CONSULTA)
    -Clase Controller: Ver si el profe prefiere usar el MouseAdapter o los 51 AddActionListeners
    -Clase Controller: Donde se deber ubicar el metodo fillCasillasMap(). Lo puse en el controller para que el Model no tenga acceso a la View


 */

public class Controller implements ActionListener {

    private Model model;
    private View view;
    private String palabraActual;
    private HashMap<String, ArrayList<JTextField>> casillasMap = new HashMap<>();

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        fillCasillasMap();
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

        this.view.btnComprobarPalabra.addActionListener(this);
        this.view.btnComprobarCrucigrama.addActionListener(this);

        this.view.box1_1.addActionListener(this);
        this.view.box1_2_2_2.addActionListener(this);
        this.view.box1_3.addActionListener(this);
        this.view.box1_4.addActionListener(this);
        this.view.box1_5.addActionListener(this);
        this.view.box1_6_3_1.addActionListener(this);
        this.view.box2_1.addActionListener(this);
        this.view.box2_3.addActionListener(this);
        this.view.box2_4.addActionListener(this);
        this.view.box2_5.addActionListener(this);
        this.view.box3_2.addActionListener(this);
        this.view.box3_3.addActionListener(this);
        this.view.box3_4.addActionListener(this);
        this.view.box3_5.addActionListener(this);
        this.view.box3_6.addActionListener(this);
        this.view.box3_7.addActionListener(this);
        this.view.box3_8.addActionListener(this);
        this.view.box3_9.addActionListener(this);
        this.view.box3_10.addActionListener(this);
        this.view.box3_11_6_6.addActionListener(this);
        this.view.box4_1.addActionListener(this);
        this.view.box4_2.addActionListener(this);
        this.view.box4_3.addActionListener(this);
        this.view.box4_4.addActionListener(this);
        this.view.box4_5.addActionListener(this);
        this.view.box4_6_6_2.addActionListener(this);
        this.view.box4_7.addActionListener(this);
        this.view.box5_1.addActionListener(this);
        this.view.box5_2.addActionListener(this);
        this.view.box5_3.addActionListener(this);
        this.view.box5_5.addActionListener(this);
        this.view.box5_6.addActionListener(this);
        this.view.box5_7_7_3.addActionListener(this);
        this.view.box5_8.addActionListener(this);
        this.view.box5_9.addActionListener(this);
        this.view.box5_10.addActionListener(this);
        this.view.box7_1.addActionListener(this);
        this.view.box7_2.addActionListener(this);
        this.view.box7_4.addActionListener(this);
        this.view.box7_5.addActionListener(this);
        this.view.box7_6.addActionListener(this);
        this.view.box7_7.addActionListener(this);
        this.view.box7_8.addActionListener(this);
        this.view.box7_9.addActionListener(this);

    
        /*MouseAdapter mouseAdapter = new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                JTextField panel = (JTextField) e.getSource();
                System.out.println(panel.getText());

                // ----------------------------
                // ----------------------------
            }
        };

        Container root = view.getContentPane();
        recorrerComponentes(root, mouseAdapter);
       
        */
    }
        /*
    private void recorrerComponentes(Component c, MouseAdapter mouseAdapter) {

        if (c instanceof JTextField) {
            JTextField pane = (JTextField) c;
            pane.addMouseListener(mouseAdapter);
        }

        if (c instanceof Container || c instanceof JPanel) {
            for (Component child : ((Container) c).getComponents()) {
                recorrerComponentes(child, mouseAdapter);
            }
        }
    }
    MANERA JULI */
    
    private void fillCasillasMap() {
        ArrayList<JTextField> palabra1 = new ArrayList<>();
        palabra1.add(view.box1_1);
        palabra1.add(view.box1_2_2_2);
        palabra1.add(view.box1_3);
        palabra1.add(view.box1_4);
        palabra1.add(view.box1_5);
        palabra1.add(view.box1_6_3_1);

        casillasMap.put("btn1", palabra1);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println(e.getClass());

        JButton source = (JButton) e.getSource();
        palabraActual = source.getText();

        System.out.println(source.getText());

        pistaSwitch(source.getText());

    }

    private void pistaSwitch(String button) {

        switch (button) {

            case "1":

                view.textPista.setText(model.getPistaMap().get("btn1"));
                break;

            case "2":

                view.textPista.setText(model.getPistaMap().get("btn2"));
                break;

            case "3":

                view.textPista.setText(model.getPistaMap().get("btn3"));
                break;

            case "4":

                view.textPista.setText(model.getPistaMap().get("btn4"));
                break;

            case "5":

                view.textPista.setText(model.getPistaMap().get("btn5"));
                break;

            case "6":

                view.textPista.setText(model.getPistaMap().get("btn6"));
                break;

            case "7":

                view.textPista.setText(model.getPistaMap().get("btn7"));
                break;
        }

    }
}
