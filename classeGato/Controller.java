package org.example.arqteturasgato;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;


    public class Controller {
        @FXML
        private TextField especieTextField;

        @FXML
        private TextField corTextField;

        @FXML
        private TextField tamanhoTextField;

        @FXML
        private TextField pesoTextField;

        @FXML
        private Text fraseText;

        @FXML
        private Label fraseLabel;

        @FXML
        private ImageView imageView;

        private Gato gato;

        @FXML
        private void gerarFrase(ActionEvent event) {
            String especie = especieTextField.getText();
            String cor = corTextField.getText();
            String tamanho = tamanhoTextField.getText();
            String peso = pesoTextField.getText();

            String frase = "A " + especie + " é " + cor + ", tem tamanho " + tamanho + " e pesa. " + peso;
            fraseLabel.setText(frase);

            Image imagem = new Image(getClass().getResourceAsStream("WhatsApp Image 2024-04-14 at 11.27.28.jpeg"));
            imageView.setImage(imagem);
        }
    }



