import java.util.HashMap;
import java.util.Set;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Controller{

    HashMap<Integer, String> infoMensal = new HashMap<Integer, String>();

    @FXML
    Button dia;

    @FXML
    void inserirTextoNaData(MouseEvent event) {
        //Label label1 = new Label("Insira o texto: ");
        TextField textField = new TextField ();
        Button botao = new Button("Inserir");
        StackPane raiz = new StackPane();
        raiz.getChildren().add(textField);
        raiz.getChildren().add(botao);
        StackPane.setAlignment(botao, Pos.BOTTOM_RIGHT);

        Stage stage2 = new Stage();
        Scene cena = new Scene(raiz, 400, 100);
        stage2.setScene(cena);
        stage2.show();

        botao.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent evento) {
                int dataID = Integer.parseInt(dia.getText().toString());
                infoMensal.put(dataID, textField.getText());
                System.out.println(dataID);
                imprimeMapa(infoMensal);
            }
            
        });
        
    }

    public static void imprimeMapa(HashMap<Integer, String> mapa){
        Set<Integer> chaves = mapa.keySet();
	    for (int chave : chaves){
			System.out.println(chave + mapa.get(chave));
	    }
    }


}
