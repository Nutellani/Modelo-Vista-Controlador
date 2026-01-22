package model;

import java.util.HashMap;

public class Model {

    private String textClue;
    private HashMap<String, String> preguntaMap = new HashMap<>();
    private HashMap<String, String> solucionMap = new HashMap<>();

    public Model() {

        fillPreguntaMap();
        fillSolucionMap();

    }

    // GETTERS & SETTERS
    public String getTextClue() {
        return textClue;
    }

    public void setTextClue(String textClue) {
        this.textClue = textClue;
    }

    public HashMap<String, String> getPreguntaMap() {
        return preguntaMap;
    }

    public void setPreguntaMap(HashMap<String, String> preguntaMap) {
        this.preguntaMap = preguntaMap;
    }

    public HashMap<String, String> getSolucionMap() {
        return solucionMap;
    }

    public void setSolucionMap(HashMap<String, String> solucionMap) {
        this.solucionMap = solucionMap;
    }

    // METHODS
    public void fillPreguntaMap() {

        this.solucionMap.put("btn1", "Profe buena onda que me va a aprobar B)");
        this.solucionMap.put("btn2", "Personaje en el League of Leyends que llega a su power spike cuando v");
        this.solucionMap.put("btn3", "Autor de los libros: Carrie, It y El Resplandor");
        this.solucionMap.put("btn4", "Estás jugando al...");
        this.solucionMap.put("btn5", "Ataque icónico y definitivo de Vegeta");
        this.solucionMap.put("btn6", "Luna donde viven los Na'vi en AVATAR");
        this.solucionMap.put("btn6", "¿Quien fué quien convenció a Anakin Skywalker de irse al lado oscuro?");

    }

    public void fillSolucionMap() {

        this.solucionMap.put("btn1", "VARGAS");
        this.solucionMap.put("btn2", "YASUO");
        this.solucionMap.put("btn3", "STEPHENKING");
        this.solucionMap.put("btn4", "CRUCIGRAMA");
        this.solucionMap.put("btn5", "FINALFLASH");
        this.solucionMap.put("btn6", "PANDORA");
        this.solucionMap.put("btn7", "PALPATINE");

    }
}
