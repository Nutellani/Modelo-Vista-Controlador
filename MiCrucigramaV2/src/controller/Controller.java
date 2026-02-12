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
    -Vista del Programa, ver si poner un scroll bar o no
    -Achicar fillCasillasMap()


 */
public class Controller implements ActionListener {

    private Model model;
    private View view;
    private String palabraActual;
    private String accionARealizar;
    private Boolean intentosTerminados;
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

//        this.view.box1_1.addActionListener(this);
//        this.view.box1_2_2_2.addActionListener(this);
//        this.view.box1_3.addActionListener(this);
//        this.view.box1_4.addActionListener(this);
//        this.view.box1_5.addActionListener(this);
//        this.view.box1_6_3_1.addActionListener(this);
//        this.view.box2_1.addActionListener(this);
//        this.view.box2_3.addActionListener(this);
//        this.view.box2_4.addActionListener(this);
//        this.view.box2_5.addActionListener(this);
//        this.view.box3_2.addActionListener(this);
//        this.view.box3_3.addActionListener(this);
//        this.view.box3_4.addActionListener(this);
//        this.view.box3_5.addActionListener(this);
//        this.view.box3_6.addActionListener(this);
//        this.view.box3_7.addActionListener(this);
//        this.view.box3_8.addActionListener(this);
//        this.view.box3_9.addActionListener(this);
//        this.view.box3_10.addActionListener(this);
//        this.view.box3_11_6_6.addActionListener(this);
//        this.view.box4_1.addActionListener(this);
//        this.view.box4_2.addActionListener(this);
//        this.view.box4_3.addActionListener(this);
//        this.view.box4_4.addActionListener(this);
//        this.view.box4_5.addActionListener(this);
//        this.view.box4_6_6_2.addActionListener(this);
//        this.view.box4_7.addActionListener(this);
//        this.view.box5_1.addActionListener(this);
//        this.view.box5_2.addActionListener(this);
//        this.view.box5_3.addActionListener(this);
//        this.view.box5_5.addActionListener(this);
//        this.view.box5_6.addActionListener(this);
//        this.view.box5_7_7_3.addActionListener(this);
//        this.view.box5_8.addActionListener(this);
//        this.view.box5_9.addActionListener(this);
//        this.view.box5_10.addActionListener(this);
//        this.view.box7_1.addActionListener(this);
//        this.view.box7_2.addActionListener(this);
//        this.view.box7_4.addActionListener(this);
//        this.view.box7_5.addActionListener(this);
//        this.view.box7_6.addActionListener(this);
//        this.view.box7_7.addActionListener(this);
//        this.view.box7_8.addActionListener(this);
//        this.view.box7_9.addActionListener(this);

    }

    private void fillCasillasMap() {
        
        ArrayList<JTextField> palabra1 = new ArrayList<>(); //Al ser objetos se pasan por REFERENCIA entonces si quiero verificar las casillas de la view no hago view.box1_1, etc si no que usaria este ArrayList directamente al pasarse por referencia.
        palabra1.add(view.box1_1);
        palabra1.add(view.box1_2_2_2);
        palabra1.add(view.box1_3);
        palabra1.add(view.box1_4);
        palabra1.add(view.box1_5);
        palabra1.add(view.box1_6_3_1);

        casillasMap.put("btn1", palabra1);

        ArrayList<JTextField> palabra2 = new ArrayList<>();
        // TODO: completar map de palabras, cada palabra es una lista y cada elemento de la lista es una box correspondiente a una letra
        palabra1.add(view.);
        
        casillasMap.put("btn2", palabra2);
        
        
        ArrayList<JTextField> palabra3 = new ArrayList<>();
        
        casillasMap.put("btn3", palabra3);
        
        
        ArrayList<JTextField> palabra4 = new ArrayList<>();
        
        casillasMap.put("btn4", palabra4);
        
        
        ArrayList<JTextField> palabra5 = new ArrayList<>();
        
        casillasMap.put("btn5", palabra5);
        
        ArrayList<JTextField> palabra6 = new ArrayList<>();
        
        casillasMap.put("btn6", palabra6);
        
        
        ArrayList<JTextField> palabra7 = new ArrayList<>();
        
        casillasMap.put("btn7", palabra7);
        
        
        //System.out.println(view.CasillasMap(btn1, ArrayList(0)));
        // agregar otro ArrayList o se puede reutilizar el mismo arraylsit para agregar otro a un HashMap??
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Tu vieja");
       Object source = e.getSource();
        if (source instanceof JButton) {
            realizarAccionBoton((JButton) source);
            return;
        }

        if (source instanceof JTextField) {
            realizarAccionBox((JTextField) source);
            return;
        }
    }
    
    private void realizarAccionBoton(JButton source) {
        // todos los objetos son o heredan de JButton
        System.out.println(source.getText());

        if (source.getText().length() == 1) {
            this.palabraActual = source.getText();
            pistaSwitch(palabraActual);
            return;
        }

        if (palabraActual == null) {
            System.err.println("");
            return;
        }

        this.accionARealizar = source.getText();

        // if o un switch ?? Creo que el switch se ve mas prolijo.. y funcionan igual 
        switch (accionARealizar) {

            case "Comprobar Palabra Actual":
                comprobarPalabraActual(palabraActual);
                break;

            case "Comprobar Crucigrama":

                for (int i = 1; i <= model.tamanioMap(); i++) {
                    String iterador = String.valueOf(i);
                    comprobarPalabraActual(iterador);
                }
                break;

        }
    } 
    
    private void realizarAccionBox(JTextField source) {
        System.out.println("Pene " + source.getText());
    }

    private void comprobarPalabraActual(String palabraActual) {
        
        for (int i = 0; i < casillasMap.get("btn" + palabraActual).size(); i++) {
            // TODO: comprobar palabra letra por letra
        }
    }

    private void pistaSwitch(String button) {
        view.textPista.setText(model.getPistaMap().get("btn" + button));
    }
}
