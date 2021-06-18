package controller;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextField;
        import model.fachada.FachadaSistema;

public class TelaInicialController {
    FachadaSistema fachadaSistema = new FachadaSistema();
    @FXML
    private Button button;

    @FXML
    private Label label;

    @FXML
    private TextField textField;

    @FXML
    void trocarParaBO(ActionEvent event) {
        Main.trocarTelas(32);
    }

    @FXML
    void atualizarCelas(ActionEvent event) {
        Main.trocarTelas(33);
        System.out.println(fachadaSistema.retornarCelas());
    }
    @FXML
    void mudarParaOperacoes(ActionEvent event) {
        Main.trocarTelas(5);
    }
    @FXML
    void mudarparaListagens(ActionEvent event) {
        Main.trocarTelas(24);
    }

}
