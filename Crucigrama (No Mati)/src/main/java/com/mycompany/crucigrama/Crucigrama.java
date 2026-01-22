/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crucigrama;

import vista.*;
import modelo.*;
import controlador.*;


/**
 *
 * @author frncm
 */
public class Crucigrama {

    public static void main(String[] args) {
        
        
        
        //-----------------------
        //instanciacion de la vista
         Menu startMenu = new Menu();
        Instrucciones startInstrucciones = new Instrucciones();
        Jogo startJogo = new Jogo();
        Ventana_Ganaste startGanaste = new Ventana_Ganaste();

        // Instanciación del modelo
        Juego startJuego = new Juego();
        Tablero startTablero = new Tablero();
        
        
        
        // Instanciación del controlador
        Controlador controlador = new Controlador(startMenu, startInstrucciones, startJogo, startTablero, startJuego,startGanaste);
        
        startMenu.setVisible(true);
        
    }
}
