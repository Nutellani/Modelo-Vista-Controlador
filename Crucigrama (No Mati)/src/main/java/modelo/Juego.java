/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.InputStream;
import java.util.ArrayList;
import vista.*;
import controlador.*;


/**
 *
 * @author frncm
 */
public class Juego {
    int puntaje;
    
    public static boolean compararTableros(String[][] tablero, String[][] resuelto){
        String[][] res;
        
        res = Tablero.iniciarTableroResuelto();
        
        tablero[3][0] = vista.Jogo.e1.getText().toUpperCase();
        tablero[3][1] = vista.Jogo.e2.getText().toUpperCase();
        tablero[3][2] = vista.Jogo.e3.getText().toUpperCase();
        tablero[3][3] = vista.Jogo.e4.getText().toUpperCase();
        tablero[3][4] = vista.Jogo.e5.getText().toUpperCase();    //<-------- para ir actualizando la matriz que va a resolver el jugador
        tablero[3][5] = vista.Jogo.e6.getText().toUpperCase();    // y despues compararla con la matriz resuelta 
        tablero[3][6] = vista.Jogo.e7.getText().toUpperCase();
        tablero[3][7] = vista.Jogo.e8.getText().toUpperCase();
        tablero[4][1] = vista.Jogo.e9.getText().toUpperCase();
        tablero[5][1] = vista.Jogo.e10.getText().toUpperCase();
        tablero[6][1] = vista.Jogo.e11.getText().toUpperCase();
        tablero[7][1] = vista.Jogo.e12.getText().toUpperCase();
        tablero[2][4] = vista.Jogo.e13.getText().toUpperCase();
        tablero[4][4] = vista.Jogo.e14.getText().toUpperCase();
        tablero[5][4] = vista.Jogo.e15.getText().toUpperCase();
        tablero[6][4] = vista.Jogo.e16.getText().toUpperCase();
        tablero[7][4] = vista.Jogo.e17.getText().toUpperCase();
        tablero[8][4] = vista.Jogo.e18.getText().toUpperCase();
        tablero[9][4] = vista.Jogo.e19.getText().toUpperCase();
        tablero[10][4] = vista.Jogo.e20.getText().toUpperCase();
        tablero[0][7] = vista.Jogo.e21.getText().toUpperCase();
        tablero[1][7] = vista.Jogo.e22.getText().toUpperCase();
        tablero[2][7] = vista.Jogo.e23.getText().toUpperCase();
        tablero[4][7] = vista.Jogo.e24.getText().toUpperCase();
        tablero[5][7] = vista.Jogo.e25.getText().toUpperCase();
        tablero[5][8] = vista.Jogo.e26.getText().toUpperCase();
        tablero[5][9] = vista.Jogo.e27.getText().toUpperCase();
        tablero[5][10] = vista.Jogo.e28.getText().toUpperCase();
        tablero[5][11] = vista.Jogo.e29.getText().toUpperCase();
        tablero[5][12] = vista.Jogo.e30.getText().toUpperCase();
        tablero[6][9] = vista.Jogo.e31.getText().toUpperCase();
        tablero[7][9] = vista.Jogo.e32.getText().toUpperCase();
        tablero[8][9] = vista.Jogo.e33.getText().toUpperCase();
        tablero[9][9] = vista.Jogo.e34.getText().toUpperCase();
        
        
        

         boolean tablerosSonIguales = true;
 
    for (int i = 0; i < 11; i++) {
        for (int j = 0; j < 13; j++) {
            if (!tablero[i][j].equals(res[i][j])) {
                tablerosSonIguales = false;
                System.out.println("ESTA MAL. LOS TABLEROS SON DISTINTOS");
                Tablero.MostrarTablero(tablero);
                System.out.println("--------------------------------");
                Tablero.mostrarResuelto(tablero,res);
                

                
                if(tablero[i][j].length()>1){
                    System.out.println("acaaaaaaa" + tablero[i][j]);
                    tablero[i][j] = " ";
                }
                return false; 
            }
        }
    }
    
    System.out.println("ESTÁ BIEN. LOS TABLEROS SON IGUALES");
    Tablero.MostrarTablero(tablero);
    System.out.println("--------------------------------");
    Tablero.mostrarResuelto(tablero,res);
    
    
    
    
    
    
    return tablerosSonIguales;
    
    }
    
    
    
    public static void igualarTableros(String[][] tablero, String[][] resuelto){
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 13; j++) {
                
            }
        }
    }
    
    
   
    
    
    
}
