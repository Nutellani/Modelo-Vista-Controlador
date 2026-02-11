package model;

import java.util.HashMap;

public class Model {

    //private String textPista; CREO Q ESTA AL PEDO
    private HashMap<String, String> pistaMap = new HashMap<>();
    private HashMap<String, String> solucionMap = new HashMap<>();

    public Model() {

        fillPistaMap();
        fillSolucionMap();

    }

    // GETTERS & SETTERS
    /*public String getTextPista() {
        return textPista;
    }

    public void setTextPista(String textPista) {
        this.textPista = textPista;
    }*/

    public HashMap<String, String> getPistaMap() {
        return pistaMap;
    }

    public void setPistaMap(HashMap<String, String> pistaMap) {
        this.pistaMap = pistaMap;
    }

    public HashMap<String, String> getSolucionMap() {
        return solucionMap;
    }

    public void setSolucionMap(HashMap<String, String> solucionMap) {
        this.solucionMap = solucionMap;
    }

    // METHODS
    private void fillPistaMap() {

        this.pistaMap.put("btn1", "Profe buena onda que me va a aprobar B)");
        this.pistaMap.put("btn2", "Personaje del League of Leyends que llega a su power spike cuando vá 0/10");
        this.pistaMap.put("btn3", "Autor de los libros: Carrie, It y El Resplandor");
        this.pistaMap.put("btn4", "Luna donde viven los Na'vi en AVATAR");
        this.pistaMap.put("btn5", "Ataque icónico y definitivo de Vegeta (En Inglés)");
        this.pistaMap.put("btn6", "Estás jugando al...");
        this.pistaMap.put("btn7", "¿Quien fué quien convenció a Anakin Skywalker de irse al lado oscuro?");

    }

    private void fillSolucionMap() {

        this.solucionMap.put("btn1", "VARGAS");
        this.solucionMap.put("btn2", "YASUO");
        this.solucionMap.put("btn3", "STEPHENKING");
        this.solucionMap.put("btn4", "PANDORA");
        this.solucionMap.put("btn5", "FINALFLASH");
        this.solucionMap.put("btn6", "CRUCIGRAMA");
        this.solucionMap.put("btn7", "PALPATINE");

    }

    public String get(String number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
