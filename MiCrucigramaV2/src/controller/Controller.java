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
    -Achicar fillCasillasMap(), con un metodo con for ??


 */
public class Controller implements ActionListener {

    private Model model;
    private View view;
    private String palabraActual;
    private String accionARealizar;
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
        palabra2.add(view.box2_1);
        palabra2.add(view.box1_2_2_2);
        palabra2.add(view.box2_3);
        palabra2.add(view.box2_4);
        palabra2.add(view.box2_5);
        casillasMap.put("btn2", palabra2);

        ArrayList<JTextField> palabra3 = new ArrayList<>();
        palabra3.add(view.box1_6_3_1);
        palabra3.add(view.box3_2);
        palabra3.add(view.box3_3);
        palabra3.add(view.box3_4);
        palabra3.add(view.box3_5);
        palabra3.add(view.box3_6);
        palabra3.add(view.box3_7);
        palabra3.add(view.box3_8);
        palabra3.add(view.box3_9);
        palabra3.add(view.box3_10);
        palabra3.add(view.box3_11_6_6);
        casillasMap.put("btn3", palabra3);

        ArrayList<JTextField> palabra4 = new ArrayList<>();
        palabra4.add(view.box4_1);
        palabra4.add(view.box4_2);
        palabra4.add(view.box4_3);
        palabra4.add(view.box4_4);
        palabra4.add(view.box4_5);
        palabra4.add(view.box4_6_6_2);
        palabra4.add(view.box4_7);
        casillasMap.put("btn4", palabra4);

        ArrayList<JTextField> palabra5 = new ArrayList<>();
        palabra5.add(view.box5_1);
        palabra5.add(view.box5_2);
        palabra5.add(view.box5_3);
        palabra5.add(view.box5_4_6_8);
        palabra5.add(view.box5_5);
        palabra5.add(view.box5_6);
        palabra5.add(view.box5_7_7_3);
        palabra5.add(view.box5_8);
        palabra5.add(view.box5_9);
        palabra5.add(view.box5_10);
        casillasMap.put("btn5", palabra5);

        ArrayList<JTextField> palabra6 = new ArrayList<>();
        palabra6.add(view.box6_1);
        palabra6.add(view.box4_6_6_2);
        palabra6.add(view.box6_3);
        palabra6.add(view.box6_4);
        palabra6.add(view.box6_5);
        palabra6.add(view.box3_11_6_6);
        palabra6.add(view.box6_7);
        palabra6.add(view.box5_4_6_8);
        casillasMap.put("btn6", palabra6);

        ArrayList<JTextField> palabra7 = new ArrayList<>();
        palabra7.add(view.box7_1);
        palabra7.add(view.box7_2);
        palabra7.add(view.box5_7_7_3);
        palabra7.add(view.box7_4);
        palabra7.add(view.box7_5);
        palabra7.add(view.box7_6);
        palabra7.add(view.box7_7);
        palabra7.add(view.box7_8);
        palabra7.add(view.box7_9);
        casillasMap.put("btn7", palabra7);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        realizarAccionBoton((JButton) source);
    }

    private void realizarAccionBoton(JButton source) {

        System.out.println(source.getText());
        Boolean adivinoPalabra = false;

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
                if (comprobarPalabraActual(palabraActual)) {
                    view.textPista.setText("ADIVINÓ LA PALABRA " + palabraActual + " :)");
                } else {
                    view.textPista.setText("NOP, SIGUE INTENTANDO LA PALABRA " + palabraActual);
                }
                break;

            case "Comprobar Crucigrama":

                for (int i = 1; i <= model.cantidadPalabras(); i++) {
                    String iterador = String.valueOf(i);
                    comprobarPalabraActual(iterador);
                    if (!comprobarPalabraActual(iterador)) {
                        view.textPista.setText("NOP, SIGUE INTENTANDO EL CRUCIGRAMA");
                        return;
                    }
                }
                view.textPista.setText("GANASTE, TERMINASTE EL CRUCIGRAMA");
                break;

        }
    }

    private void pistaSwitch(String button) {
        view.textPista.setText(model.getPistaMap().get("btn" + button));
    }

    /**
     * En este metodo compara cada letra escrita desde la view con las
     * soluciones.
     *
     * @param palabraActual (String del nombre del boton para ser utilizado como
     * key, obtener el tamaño de sus letras para usar .size())
     */
    private Boolean comprobarPalabraActual(String palabraActual) {

        ArrayList<JTextField> tamanioPalabra = casillasMap.get("btn" + palabraActual);

        for (int i = 0; i < tamanioPalabra.size(); i++) {

            String letraCasilla = casillasMap.get("btn" + palabraActual).get(i).getText();
            String letraSolucion = model.getSolucionMap().get("btn" + palabraActual).substring(i, i + 1);

            if (!letraCasilla.equalsIgnoreCase(letraSolucion)) {
                System.err.println("Palabra INCORRECTA encontrada en botón " + palabraActual);
                return false;
            }

        }
        return true;
    }
}
