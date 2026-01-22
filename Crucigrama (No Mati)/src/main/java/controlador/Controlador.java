/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.Desktop;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;

import vista.*;
import modelo.*;
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static modelo.Tablero.resuelto;
import static modelo.Tablero.tablero;





/**
 *
 * @author frncm
 */
public class Controlador implements ActionListener {

    private final Menu startMenu;
    private final Instrucciones startInstrucciones;
    private final Jogo startJogo;
    private final Tablero startTablero;
    private final Juego startJuego;
    private final Ventana_Ganaste startGanaste;
    
   

    public Controlador(Menu startMenu, Instrucciones startInstrucciones,Jogo startJogo, Tablero startTablero, Juego startJuego, Ventana_Ganaste startGanaste) {
        this.startMenu = startMenu;
        this.startInstrucciones = startInstrucciones;
        this.startJogo = startJogo;
        this.startTablero = startTablero;
        this.startJuego = startJuego;
        this.startGanaste = startGanaste;
        //todos los action listeners:
        
        this.startMenu.getBoton_instucciones().addActionListener(this);
        this.startMenu.getBoton_jugar().addActionListener(this);
        this.startMenu.getBoton_salir().addActionListener(this);
        //ActionListener del boton de las instrucciones
        this.startInstrucciones.getBoton_volver().addActionListener(this);
        //ActionListener de el botones del juego
        this.startJogo.getBtnTerminar().addActionListener(this);
        this.startGanaste.getBotonReiniciar().addActionListener(this);
        this.startGanaste.getBotonSalirGanaste().addActionListener(this);
        
        
        
        
        
    }

    

    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==startMenu.getBoton_instucciones()){
               MostrarInstrucciones();
            }else if(e.getSource()==startMenu.getBoton_jugar()){     //<----------- aca los botones del menu(jugar,salir,ver las instrucciones)
                MostrarJuego();
            }else if(e.getSource()==startMenu.getBoton_salir()){
                salirJuego();
            }else if(e.getSource()==startInstrucciones.getBoton_volver()){  //<---------aca el boton de volver en las instrucciones
                volverInicio();
            }else if(e.getSource()==startJogo.getBtnTerminar()){
                botonComparar();
                if(Juego.compararTableros(tablero, resuelto) == (true)){
                    mostrarGanaste();
                }
            }else if(e.getSource()== startGanaste.getBotonSalirGanaste()){
                System.exit(0);
            }else if(e.getSource()==startGanaste.getBotonReiniciar()){
                MostrarJuegoGanaste();
            }
        }catch(Exception ex){
            System.out.println("ERROR...");
            ex.printStackTrace();

        }
    }
    //mostrar instrucciones
    private void MostrarInstrucciones(){
        /*
        startMenu.dispose();
        startInstrucciones.setVisible(true);
        */
        
        File archivo;
        
        archivo = new File("archivo.txt");
        leer();
        
    
    }
    
    //volver de las instrucciones al menu
    private void volverInicio() {
        startInstrucciones.dispose();
        startMenu.setVisible(true);
    }
    
    //salir
    private void salirJuego() {
        System.exit(0);
    }
        String nombreJugador;
    
    private void MostrarJuego(){
        startMenu.dispose();
        nombreJugador = Menu.campo_nombre.getText();
        startJogo.setVisible(true);
        
        String[][] tablero = startTablero.IniciarTablero();
        startTablero.MostrarTablero(tablero);
    }
    
    private void MostrarJuegoGanaste(){
        startGanaste.dispose();
        //startJogo.dispose();
        startJogo.setVisible(true);
        String[][] tablero = startTablero.IniciarTablero();
        vaciarTablero();
        startTablero.MostrarTablero(tablero);
    }
    
    private void botonComparar(){
      startJuego.compararTableros(modelo.Tablero.tablero, modelo.Tablero.resuelto);
    }
    
    private void mostrarGanaste(){
       
        startJogo.dispose();
        startGanaste.setVisible(true);
        Ventana_Ganaste.espacio_nombre_jugador.setText(nombreJugador);
        
    }
    
    public static void vaciarTablero(){
        vista.Jogo.e1.setText(" ");
        vista.Jogo.e2.setText(" ");
        vista.Jogo.e3.setText(" ");
        vista.Jogo.e4.setText(" ");
        vista.Jogo.e5.setText(" ");
        vista.Jogo.e6.setText(" ");
        vista.Jogo.e7.setText(" ");
        vista.Jogo.e8.setText(" ");
        vista.Jogo.e9.setText(" ");
        vista.Jogo.e10.setText(" ");
        vista.Jogo.e11.setText(" ");
        vista.Jogo.e12.setText(" ");
        vista.Jogo.e13.setText(" ");
        vista.Jogo.e14.setText(" ");
        vista.Jogo.e15.setText(" ");
        vista.Jogo.e16.setText(" ");
        vista.Jogo.e17.setText(" ");
        vista.Jogo.e18.setText(" ");
        vista.Jogo.e19.setText(" ");
        vista.Jogo.e20.setText(" ");
        vista.Jogo.e21.setText(" ");
        vista.Jogo.e22.setText(" ");
        vista.Jogo.e23.setText(" ");
        vista.Jogo.e24.setText(" ");
        vista.Jogo.e25.setText(" ");
        vista.Jogo.e26.setText(" ");
        vista.Jogo.e27.setText(" ");
        vista.Jogo.e28.setText(" ");
        vista.Jogo.e29.setText(" ");
        vista.Jogo.e30.setText(" ");
        vista.Jogo.e31.setText(" ");
        vista.Jogo.e32.setText(" ");
        vista.Jogo.e33.setText(" ");
        vista.Jogo.e34.setText(" ");
    }
    
    //-------------archivos------------
    
    File archivo;
    
        private void crearArchivo(){

           archivo= new File("archivo.txt");
           try{
               if (archivo.createNewFile()){
                   System.out.println("Archivo creado con exito");
               }
               else{
                   System.out.println("Error al crear archivo");
               }


       }catch(IOException exepcion){
        exepcion.printStackTrace(System.out);

        }

    }
    
        private void escribir(){
        try{
            FileWriter escritura= new FileWriter(archivo);
            escritura.write("¿Que es un crucigrama?");
            escritura.write("Un crucigrama es un juego de palabras donde debes");
            escritura.write("llenar una cuadricula con letras, formando palabras que se");
            escritura.write("cruzan horizontal y verticalmente. Cada palabra esta definida por");
            escritura.write("una pista que te ayuda a descubrirla");
            escritura.write("");
            escritura.write("Objetivo del juego:");
            escritura.write("El objetivo es llenar todas las casillas de la cuadricula con las letras");
            escritura.write("correctas para formar palabras basadas en las pistas proporcionadas");

            escritura.close(); 
            System.out.println("texto añadido con exito");

        }catch(IOException excepcion){
            excepcion.printStackTrace(System.out);
        }
    }
    
        
private void leer(){
    
    String contenido;
    StringBuilder textoCompleto = new StringBuilder(); 
    
    try{
        FileReader lector= new FileReader("Archivos/instrucciones.txt"); 
        BufferedReader lectura= new BufferedReader(lector); 
        contenido= lectura.readLine();// 
        
        while(contenido != null){
            System.out.println(contenido);
            textoCompleto.append(contenido).append("\n"); 
            contenido=lectura.readLine();
            
        }
        
        System.out.println(contenido); 
         JOptionPane.showMessageDialog(null, textoCompleto.toString(), "Contenido del Archivo", JOptionPane.INFORMATION_MESSAGE);
        
    }catch (IOException excepcion){
        excepcion.printStackTrace(System.out);
    }
    
    
    }
}
