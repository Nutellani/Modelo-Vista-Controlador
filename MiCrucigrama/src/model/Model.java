package model;

import java.util.HashMap;

public class Model {

    private String boxTitle;
    private String boxAnswer;
    private String boxHits;
    private String boxMiss;
    private HashMap<String, String> respuestaMap = new HashMap<>();
    
    private String box2_1;
    private String box2_2;
    private String box2_3;
    private String box2_4;
    private String box2_5;
    
//    private HashMap<String, String> respuestaUsuario = new HashMap<>();

    public Model() {
        fillMap();
    }

    private void fillMap(){
        this.respuestaMap.put("box2_1", "YASUO");
    }
    
    // GETTERS & SETTERS

    public String getBoxTitle() {
        return boxTitle;
    }

    public void setBoxTitle(String boxTitle) {
        this.boxTitle = boxTitle;
    }

    public String getBoxAnswer() {
        return boxAnswer;
    }

    public void setBoxAnswer(String boxAnswer) {
        this.boxAnswer = boxAnswer;
    }

    public String getBoxHits() {
        return boxHits;
    }

    public void setBoxHits(String boxHits) {
        this.boxHits = boxHits;
    }

    public String getBoxMiss() {
        return boxMiss;
    }

    public void setBoxMiss(String boxMiss) {
        this.boxMiss = boxMiss;
    }

    public HashMap<String, String> getRespuestaMap() {
        return respuestaMap;
    }

    public void setRespuestaMap(HashMap<String, String> respuestaMap) {
        this.respuestaMap = respuestaMap;
    }

    public String getBox2_1() {
        return box2_1;
    }

    public void setBox2_1(String box2_1) {
        this.box2_1 = box2_1;
    }

    public String getBox2_2() {
        return box2_2;
    }

    public void setBox2_2(String box2_2) {
        this.box2_2 = box2_2;
    }

    public String getBox2_3() {
        return box2_3;
    }

    public void setBox2_3(String box2_3) {
        this.box2_3 = box2_3;
    }

    public String getBox2_4() {
        return box2_4;
    }

    public void setBox2_4(String box2_4) {
        this.box2_4 = box2_4;
    }

    public String getBox2_5() {
        return box2_5;
    }

    public void setBox2_5(String box2_5) {
        this.box2_5 = box2_5;
    }
    
    // METHODS
    
}
