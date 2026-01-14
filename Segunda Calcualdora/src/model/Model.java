package model;

public class Model {

    private Double txtNumeroUno;
    private Double txtNumeroDos;
    private Double txtResultado;

    public Model() {
    }

//    public Model(Double txtNumeroUno, Double txtNumeroDos, Double txtResultado) {
//        this.txtNumeroUno = txtNumeroUno;
//        this.txtNumeroDos = txtNumeroDos;
//        this.txtResultado = txtResultado;
//    }

    // SETTERS & SETTERS
    public Double getTxtNumeroUno() {
        return txtNumeroUno;
    }

    public void setTxtNumeroUno(Double txtNumeroUno) {
        this.txtNumeroUno = txtNumeroUno;
    }

    public Double getTxtNumeroDos() {
        return txtNumeroDos;
    }

    public void setTxtNumeroDos(Double txtNumeroDos) {
        this.txtNumeroDos = txtNumeroDos;
    }

    public Double getTxtResultado() {
        return txtResultado;
    }

    public void setTxtResultado(Double txtResultado) {
        this.txtResultado = txtResultado;
    }

    // METHODS
    public void sumar() {
        this.txtResultado = this.txtNumeroUno + this.txtNumeroDos;
    }

    public void restar() {
        this.txtResultado = this.txtNumeroUno - this.txtNumeroDos;
    }

    public void multiplicar() {
        this.txtResultado = this.txtNumeroUno * this.txtNumeroDos;
    }

    public void dividir() {

        if (this.txtNumeroUno == 0) {
            
            this.txtResultado = 0d;
            return;
        }
        this.txtResultado = this.txtNumeroUno / this.txtNumeroDos;
    }    
    
}
