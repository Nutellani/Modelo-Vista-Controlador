/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author frncm
 */
public class Tablero {
        static public String[][] tablero;
        static public String[][] resuelto;
   
    public Tablero() {
        this.tablero = new String[11][13];
        this.resuelto = new String[11][13];
    }

    public  String[][] getTablero() {
        return tablero;
    }

    public  void setTablero(String[][] tablero) {
        Tablero.tablero = tablero;
    }
    
    public static String[][] iniciarTableroResuelto() {
        
        String[][] resuelto = {
            {" ", " ", " ", " ", " ", " ", " ", "C", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", "A", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", "E", " ", " ", "M", " ", " ", " ", " ", " "},
            {"C", "E", "R", "A", "M", "I", "C", "A", " ", " ", " ", " ", " "},
            {" ", "X", " ", " ", "E", " ", " ", "R", " ", " ", " ", " ", " "},
            {" ", "I", " ", " ", "R", " ", " ", "A", "M", "A", "B", "L", "E"},
            {" ", "T", " ", " ", "G", " ", " ", " ", " ", "M", " ", " ", " "},
            {" ", "O", " ", " ", "E", " ", " ", " ", " ", "I", " ", " ", " "},
            {" ", " ", " ", " ", "N", " ", " ", " ", " ", "G", " ", " ", " "},
            {" ", " ", " ", " ", "T", " ", " ", " ", " ", "O", " ", " ", " "},
            {" ", " ", " ", " ", "E", " ", " ", " ", " ", " ", " ", " ", " "}
        };
        
        
        
        
        
        
        
        return resuelto;
    }
    
    public static void mostrarResuelto(String[][] resuelto,String[][]res){
        
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(" " + res[i][j]);
            }
        System.out.println(" ");
    }
        
    }
    
    
    
    
    
    
    public String[][] IniciarTablero(){
            
        for(int i = 0; i<11; i++){
            for (int j = 0; j<13; j++){            
                tablero[i][j] = " ";
            }
            System.out.println();
        }
        return tablero;
    }
    
    
    
    
   public static String[][] MostrarTablero(String[][] tablero) {
    for (int i = 0; i < 11; i++) {
        for (int j = 0; j < 13; j++) {
            System.out.print(" " + tablero[i][j]);
        }
        System.out.println(" ");
    }
    return tablero;
}

}
