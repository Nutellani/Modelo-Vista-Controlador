package segunda.calcualdora;

import controller.Controller;
import model.Model;
import view.View;

public class SegundaCalcualdora {

    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();

        Controller ctrl = new Controller(model, view);
        ctrl.iniciar();
        view.setVisible(true);
    }

}
