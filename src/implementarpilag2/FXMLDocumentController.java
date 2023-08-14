/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementarpilag2;

import datos.Producto;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import modelo.Pila;

/**
 *
 * @author daniel_alberto.paz
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label tituloL;

    @FXML
    private Label NombreP;

    @FXML
    private Label CodigoP;

    @FXML
    private Label ValorP;

    @FXML
    private TextField nombrePTXT;

    @FXML
    private TextField codigoPTXT;

    @FXML
    private TextField valorPTXT;

    @FXML
    private MenuBar menuBar1;

    @FXML
    private TextArea textAreaP;

    Pila<Producto> pilaP1;

    @FXML
    private void apilarProducto(ActionEvent event) {

        String nombreP = nombrePTXT.getText();
        String codigoP = nombrePTXT.getText();
        double precioP = Double.parseDouble(valorPTXT.getText());

        Producto objP = new Producto(nombreP, codigoP, precioP);
        pilaP1.apilar(objP);
    }

    @FXML
    private void mostrarDatosP(ActionEvent event) {

        pilaP1.toString();

    }

    @FXML
    private void desapilarP(ActionEvent event) {
        pilaP1.desapilar();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pilaP1 = new Pila<>();
    }

}
