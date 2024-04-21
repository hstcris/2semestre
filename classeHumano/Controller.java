package org.example.arqteturastres;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    private TextField nomeTextField;

    @FXML
    private TextField nacionalidadeTextField;

    @FXML
    private TextField sexoTextField;

    @FXML
    private TextField pesoTextField;

    @FXML
    private Text fraseText;

    @FXML
    private Label fraseLabel;

    @FXML
    private ImageView imageView;

    private Humano humano;

    @FXML
    private void gerarFrase(ActionEvent event) {
        String nome = nomeTextField.getText();
        String nacionalidade = nacionalidadeTextField.getText();
        String sexo = sexoTextField.getText();
        String peso = pesoTextField.getText();

        String frase = "O nome é " + nome + ", de nacionalidade " + nacionalidade + ", sexo " + sexo + " e pesa " + peso;
        fraseLabel.setText(frase);

        Image imagem = new Image(getClass().getResourceAsStream("WhatsApp Image 2024-04-11 at 22.22.05.jpeg"));
        imageView.setImage(imagem);
    }
}

