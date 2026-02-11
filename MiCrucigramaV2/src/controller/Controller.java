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
        
    }
    
    private void fillCasillasMap() {
        ArrayList<JTextField> palabra1 = new ArrayList<>();
        palabra1.add(view.box1_1);
        palabra1.add(view.box1_2_2_2);
        palabra1.add(view.box1_3);
        palabra1.add(view.box1_4);
        palabra1.add(view.box1_5);
        palabra1.add(view.box1_6_3_1);

        casillasMap.put("btn1", palabra1);
        
        System.out.println(view.CasillasMap(btn1, ArrayList(0)));

        // agregar otro ArrayList o se puede reutilizar el mismo arraylsit para agregar otro a un HashMap??
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton source = (JButton) e.getSource();
        // todos los objetos son o heredan de JButton

        palabraActual = source.getText();
        System.out.println(palabraActual);

        // if o un switch ?? Creo que el switch se ve mas prolijo.. y funcionan igual 
        switch (palabraActual) {

            case "Comprobar Palabra Actual":
                comprobarPalabraActual(palabraActual);
                break;

            case "Comprobar Crucigrama":

                for (int i = 0; i < model.getSolucionMap().size(); i++) {
                    String iterador = String.valueOf(i + 1);
                    comprobarPalabraActual(iterador);
                }
                break;

            default:
                
                pistaSwitch(palabraActual);
        }
    }

    private void comprobarPalabraActual(String palabraActual) {
        
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

            default:
                System.err.println("Ningun botón seleccionado");
        }

    }

//        if (palabraActual.equals("Comprobar Palabra Actual")){
//            comprobarPalabraActual();            
//        } else if (palabraActual.equals("Comprobar Crucigrama")){
//            for (int i = 0; i < 7; i++) {
//            comprobarPalabraActual();    
//            }
//        } else {
//            System.out.println(source.getText());
//            pistaSwitch(source.getText());
//        }
}
