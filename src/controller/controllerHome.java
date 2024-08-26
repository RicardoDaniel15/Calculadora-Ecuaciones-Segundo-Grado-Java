package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class controllerHome {

    @FXML
    private TextField txtResultado;
    private String pivote = "";
    private Logica lg;

    @FXML
    void AddOperation(ActionEvent event) {
        addNumberCoeficiente("+");
    }
    @FXML
    void MinusOperation(ActionEvent event) {
        addNumberCoeficiente("-");
    }
    @FXML
    void buttonClicKAX2(ActionEvent event) {
        addNumberCoeficiente("x^2");
    }
    @FXML
    void buttonClick1(ActionEvent event) {
        addNumberCoeficiente("1");
    }
    @FXML
    void buttonClick2(ActionEvent event) {
        addNumberCoeficiente("2");
    }
    @FXML
    void buttonClick3(ActionEvent event) {
        addNumberCoeficiente("3");
    }
    @FXML
    void buttonClick4(ActionEvent event) {
        addNumberCoeficiente("4");
    }
    @FXML
    void buttonClick5(ActionEvent event) {
        addNumberCoeficiente("5");
    }
    @FXML
    void buttonClick6(ActionEvent event) {
        addNumberCoeficiente("6");
    }
    @FXML
    void buttonClick7(ActionEvent event) {
        addNumberCoeficiente("7");
    }
    @FXML
    void buttonClick8(ActionEvent event) {
        addNumberCoeficiente("8");
    }
    @FXML
    void buttonClick9(ActionEvent event) {
        addNumberCoeficiente("9");
    }
    @FXML
    void buttonClickBX(ActionEvent event) {
        addNumberCoeficiente("x");
    }
    @FXML
    void eliminarCoeficiente(ActionEvent event) {
        if (pivote == null || pivote.isEmpty()) {
            this.txtResultado.setText("");
        } else {
            // Eliminar el último carácter de pivote y actualizar la variable
            this.pivote = this.pivote.substring(0, pivote.length() - 1);
            actualizarDisplay();
        }
    }

    @FXML
    void limpiarDisplay(ActionEvent event) {
        this.txtResultado.setText("");
        this.pivote = "";
    }

    @FXML
    void showResult(ActionEvent event){
        lg = new Logica();
        if(lg.extraerCoeficientes(this.pivote)==0){
            System.out.println(lg.getA());
            System.out.println(lg.getB());
            System.out.println(lg.getC());
            System.out.println(lg.resolucion());
            this.txtResultado.setText(lg.resolucion());
        }else{
            System.out.println("No tiene solucion");
            this.txtResultado.setText("No tiene resolucion en los reales");
        }

    }

    private void addNumberCoeficiente(String termino) {
        pivote += termino;
        actualizarDisplay();
    }

    private void actualizarDisplay() {
        this.txtResultado.setText("    "+this.pivote);
    }

}
