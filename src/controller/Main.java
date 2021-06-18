package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    private static Stage stage;

    private static Scene scenePrincipal;
    private static Scene sceneBOTela;
    private static Scene sceneBOTelaPF;
    private static Scene sceneBOTelaPJ;
    private static Scene sceneTelaOperacoes;
    private static Scene sceneCadastroDelegado;
    private static Scene sceneCadastroPolicial;
    private static Scene sceneCadastroDetento;
    private static Scene sceneCadastroDenuncia;
    private static Scene sceneCadastroFuncionario;
    private static Scene sceneCadastroViatura;
    private static Scene sceneBuscaPolicial;
    private static Scene sceneBuscaDetento;
    private static Scene sceneBuscaDetento2;
    private static Scene sceneBuscaDenuncia;
    private static Scene sceneBuscaFuncionario;
    private static Scene sceneBuscaViatura;
    private static Scene sceneExcluirDelegado;
    private static Scene sceneExcluirDetento;
    private static Scene sceneExcluirFuncionario;
    private static Scene sceneExcluirpolicial;
    private static Scene sceneExcluirViatura;
    private static Scene sceneExcluirDenuncia;
    private static Scene sceneListaEBusca;
    private static Scene sceneAtualizarDelegado;
    private static Scene sceneAtualizarFuncionario;
    private static Scene sceneAtualiizarPolicial;
    private static Scene sceneAtualizarDenunciaPF;
    private static Scene sceneAtualizarDenunciaPJ;
    private static Scene sceneAtualizarDetento;
    private static Scene sceneAtualizarViatura;
    private static Scene sceneOperacoesDenuncia;
    private static Scene sceneAtualizarCelas;
    private static Scene sceneListagemDelegado;
    private static Scene sceneListagemDetento;
    private static Scene sceneListagemFuncionario;
    private static Scene sceneListagemPolicial;
    private static Scene sceneListagemDenuncia;
    private static Scene sceneListagemViatura;
    private static Scene sceneBOAnonimo;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;

        Parent mainTela = FXMLLoader.load(getClass().getResource("../view/TelaInicial.fxml"));
        scenePrincipal = new Scene(mainTela, 640, 400);
        primaryStage.setTitle("DelegaSystem");

        Parent bOTela = FXMLLoader.load(getClass().getResource("../view/TelaBO.fxml"));
        sceneBOTela = new Scene(bOTela, 640, 400);
        primaryStage.setTitle("Denuncia");

        Parent bOTelaPF = FXMLLoader.load(getClass().getResource("../view/BOPessoaFisicaCompleto.fxml"));
        sceneBOTelaPF = new Scene(bOTelaPF, 640, 400);
        primaryStage.setTitle("Denuncia Com Pessoa Fisica");

        Parent bOTelaPJ = FXMLLoader.load(getClass().getResource("../view/BOPessoaJuridicaCompleto.fxml"));
        sceneBOTelaPJ = new Scene(bOTelaPJ, 640, 400);
        primaryStage.setTitle("Denuncia Com Pessoa Jurídica");

        Parent telaOperacoes = FXMLLoader.load(getClass().getResource("../view/CadastroEAtualizacao.fxml"));
        sceneTelaOperacoes = new Scene(telaOperacoes, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent listaEBusca = FXMLLoader.load(getClass().getResource("../view/ListaEBusca.fxml"));
        sceneListaEBusca = new Scene(listaEBusca, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent cadastroDelegado = FXMLLoader.load(getClass().getResource("../view/CadastroDelegado.fxml"));
        sceneCadastroDelegado = new Scene(cadastroDelegado, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent cadastroPolicial = FXMLLoader.load(getClass().getResource("../view/CadastroPolicial.fxml"));
        sceneCadastroPolicial = new Scene(cadastroPolicial, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent cadastroDetento = FXMLLoader.load(getClass().getResource("../view/CadastroDetento.fxml"));
        sceneCadastroDetento = new Scene(cadastroDetento, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent cadastroDenuncia = FXMLLoader.load(getClass().getResource("../view/CadastroEAtualizacao.fxml"));
        sceneCadastroDenuncia = new Scene(cadastroDenuncia, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent cadastroFuncionario = FXMLLoader.load(getClass().getResource("../view/CadastroFuncionario.fxml"));
        sceneCadastroFuncionario = new Scene(cadastroFuncionario, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent cadastroViatura = FXMLLoader.load(getClass().getResource("../view/CadastroViatura.fxml"));
        sceneCadastroViatura = new Scene(cadastroViatura, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent buscaPolicial = FXMLLoader.load(getClass().getResource("../view/BuscaPolicial.fxml"));
        sceneBuscaPolicial = new Scene(buscaPolicial, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent buscaDetento = FXMLLoader.load(getClass().getResource("../view/BuscaDetento.fxml"));
        sceneBuscaDetento = new Scene(buscaDetento, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent buscaDetento2 = FXMLLoader.load(getClass().getResource("../view/BuscaDetento.fxml"));
        sceneBuscaDetento2 = new Scene(buscaDetento2, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent buscaFuncionario = FXMLLoader.load(getClass().getResource("../view/BuscaFuncionario.fxml"));
        sceneBuscaFuncionario = new Scene(buscaFuncionario, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent buscaViatura = FXMLLoader.load(getClass().getResource("../view/BuscaViatura.fxml"));
        sceneBuscaViatura = new Scene(buscaViatura, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent buscaDenuncia = FXMLLoader.load(getClass().getResource("../view/BuscaDenuncia.fxml"));
        sceneBuscaDenuncia = new Scene(buscaDenuncia, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent excluirDelegado = FXMLLoader. load(getClass().getResource("../view/ExcluirDelegado.fxml"));
        sceneExcluirDelegado = new Scene(excluirDelegado, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent excluirDenuncia = FXMLLoader.load(getClass().getResource("../view/ExcluirDenuncia.fxml"));
        sceneExcluirDenuncia = new Scene(excluirDenuncia, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent excluirViatura = FXMLLoader.load(getClass().getResource("../view/ExcluirViatura.fxml"));
        sceneExcluirViatura = new Scene(excluirViatura, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent excluirPolicial = FXMLLoader.load(getClass().getResource("../view/ExcluirPolicial.fxml"));
        sceneExcluirpolicial = new Scene(excluirPolicial, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent excluirFuncionario = FXMLLoader.load(getClass().getResource("../view/ExcluirFuncionario.fxml"));
        sceneExcluirFuncionario = new Scene(excluirFuncionario, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent excluirDetento = FXMLLoader.load(getClass().getResource("../view/ExcluirDetento.fxml"));
        sceneExcluirDetento = new Scene(excluirDetento, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent atualizarDetento = FXMLLoader.load(getClass().getResource("../view/AtualizarDetento.fxml"));
        sceneAtualizarDetento = new Scene(atualizarDetento, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent atualizarDelegado = FXMLLoader.load(getClass().getResource("../view/AtualizarDelegado.fxml"));
        sceneAtualizarDelegado = new Scene(atualizarDelegado, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent atualizarFuncionario = FXMLLoader.load(getClass().getResource("../view/AtualizarFuncionario.fxml"));
        sceneAtualizarFuncionario = new Scene(atualizarFuncionario, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent atualizarPolicial = FXMLLoader.load(getClass().getResource("../view/AtualizarPolicial.fxml"));
        sceneAtualiizarPolicial = new Scene(atualizarPolicial, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent atualizarDenunciaPF = FXMLLoader.load(getClass().getResource("../view/AtualizarDenunciaPF.fxml"));
        sceneAtualizarDenunciaPF = new Scene(atualizarDenunciaPF, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent atualizarDenunciaPJ = FXMLLoader.load(getClass().getResource("../view/AtualizarDenunciaPJ.fxml"));
        sceneAtualizarDenunciaPJ = new Scene(atualizarDenunciaPJ, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent atualizarViatura = FXMLLoader.load(getClass().getResource("../view/AtualizarViatura.fxml"));
        sceneAtualizarViatura = new Scene(atualizarViatura, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent operacoesDenuncia = FXMLLoader.load(getClass().getResource("../view/OperacoesDenuncia.fxml"));
        sceneOperacoesDenuncia = new Scene(operacoesDenuncia, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent atualizarCelas = FXMLLoader.load(getClass().getResource("../view/AtualizarCelas.fxml"));
        sceneAtualizarCelas = new Scene(atualizarCelas, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent listagemDetento = FXMLLoader.load(getClass().getResource("../view/ListagemDetento.fxml"));
        sceneListagemDetento = new Scene(listagemDetento, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent listagemDelegado = FXMLLoader.load(getClass().getResource("../view/ListagemDelegado.fxml"));
        sceneListagemDelegado = new Scene(listagemDelegado, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent listagemFuncionario = FXMLLoader.load(getClass().getResource("../view/ListagemFuncionario.fxml"));
        sceneListagemFuncionario = new Scene(listagemFuncionario, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent listagemPolicial = FXMLLoader.load(getClass().getResource("../view/ListagemPolicial.fxml"));
        sceneListagemPolicial = new Scene(listagemPolicial, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent listagemDenuncia = FXMLLoader.load(getClass().getResource("../view/ListagemDenuncia.fxml"));
        sceneListagemDenuncia = new Scene(listagemDenuncia, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent listagemViatura = FXMLLoader.load(getClass().getResource("../view/ListagemViatura.fxml"));
        sceneListagemViatura = new Scene(listagemViatura, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        Parent bOAnonimo = FXMLLoader.load(getClass().getResource("../view/BOAnonimo.fxml"));
        sceneBOAnonimo = new Scene(bOAnonimo, 640, 400);
        primaryStage.setTitle("Operações do sistema");

        primaryStage.setResizable(false);
        primaryStage.setScene(scenePrincipal);
        primaryStage.show();
    }

    public static void trocarTelas(int num){
        switch (num){
            case 1:
                stage.setScene(scenePrincipal);
                break;
            case 2:
                stage.setScene(sceneBOTela);
                break;
            case 3:
                stage.setScene(sceneBOTelaPF);
                break;
            case 4:
                stage.setScene(sceneBOTelaPJ);
                break;
            case 5:
                stage.setScene(sceneTelaOperacoes);
                break;
            case 6:
                stage.setScene(sceneCadastroDelegado);
                break;
            case 7:
                stage.setScene(sceneCadastroDenuncia);
                break;
            case 8:
                stage.setScene(sceneCadastroDetento);
                break;
            case 9:
                stage.setScene(sceneCadastroFuncionario);
                break;
            case 10:
                stage.setScene(sceneCadastroViatura);
                break;
            case 11:
                stage.setScene(sceneCadastroPolicial);
                break;
            case 12:
                stage.setScene(sceneBuscaDenuncia);
                break;
            case 13:
                stage.setScene(sceneBuscaDetento);
                break;
            case 14:
                stage.setScene(sceneBuscaDetento2);
                break;
            case 15:
                stage.setScene(sceneBuscaFuncionario);
                break;
            case 16:
                stage.setScene(sceneBuscaPolicial);
                break;
            case 17:
                stage.setScene(sceneBuscaViatura);
                break;
            case 18:
                stage.setScene(sceneExcluirDelegado);
                break;
            case 19:
                stage.setScene(sceneExcluirDenuncia);
                break;
            case 20:
                stage.setScene(sceneExcluirDetento);
                break;
            case 21:
                stage.setScene(sceneExcluirFuncionario);
                break;
            case 22:
                stage.setScene(sceneExcluirpolicial);
                break;
            case 23:
                stage.setScene(sceneExcluirViatura);
                break;
            case 24:
                stage.setScene(sceneListaEBusca);
                break;
            case 25:
                stage.setScene(sceneAtualiizarPolicial);
                break;
            case 26:
                stage.setScene(sceneAtualizarDelegado);
                break;
            case 27:
                stage.setScene(sceneAtualizarDenunciaPF);
                break;
            case 28:
                stage.setScene(sceneAtualizarDenunciaPJ);
                break;
            case 29:
                stage.setScene(sceneAtualizarDetento);
                break;
            case 30:
                stage.setScene(sceneAtualizarFuncionario);
                break;
            case 31:
                stage.setScene(sceneAtualizarViatura);
                break;
            case 32:
                stage.setScene(sceneOperacoesDenuncia);
                break;
            case 33:
                stage.setScene(sceneAtualizarCelas);
                break;
            case 34:
                stage.setScene(sceneListagemDelegado);
                break;
            case 35:
                stage.setScene(sceneListagemDetento);
                break;
            case 36:
                stage.setScene(sceneListagemDenuncia);
                break;
            case 37:
                stage.setScene(sceneListagemFuncionario);
                break;
            case 38:
                stage.setScene(sceneListagemPolicial);
                break;
            case 39:
                stage.setScene(sceneListagemViatura);
                break;
            case 40:
                stage.setScene(sceneBOAnonimo);

        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}