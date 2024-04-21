package org.example.arqteturasdois;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    private TextField modeloTextField;

    @FXML
    private TextField corTextField;

    @FXML
    private TextField cargaTextField;

    @FXML
    private TextField alimentacaoTextField;

    @FXML
    private Text fraseText;

    @FXML
    private Label fraseLabel;

    @FXML
    private ImageView imageView;

    private Caneta caneta;

    @FXML
    private void gerarFrase(ActionEvent event) {
        String modelo = modeloTextField.getText();
        String cor = corTextField.getText();
        String carga = cargaTextField.getText();


        String frase = "A marca da caneta é " + modelo + " ela tem a cor " + cor + " e está com a carga " + carga;
        fraseLabel.setText(frase);

        Image imagem = new Image(getClass().getResourceAsStream("WhatsApp Image 2024-04-14 at 11.27.27.jpeg"));
        imageView.setImage(imagem);
    }
}
