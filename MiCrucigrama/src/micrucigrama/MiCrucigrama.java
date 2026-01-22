package micrucigrama;

import view.View;
import model.Model;
import controller.Controller;

public class MiCrucigrama {
    
    public static void main(String[] args) {
        
        Model model = new Model();
        View view = new View();
        
        Controller controller = new Controller(model, view);
        controller.iniciar();
        view.setVisible(true);
        
        // TERMINAR DE LLENAR Y PROBAR SI ANDA EL BOTON 2 ashei
        
    }
    
}
