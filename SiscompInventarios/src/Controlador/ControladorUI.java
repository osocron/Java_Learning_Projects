package Controlador;

import Modelo.CatalogoArticulosEntity;
import Modelo.SiscompArticulo;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.util.List;

/**
 * Created by gnosocrome on 24/07/15.
 */
public class ControladorUI extends Application{

    private ObservableList<SiscompArticulo> data = FXCollections.observableArrayList();

    @FXML
    TableView<SiscompArticulo> prodListTableView;
    @FXML
    TextField prodSearchTextField;
    @FXML
    TableColumn claveTableCol,descripGrupoTableCol,descripArticTableCol,codBarrasTableCol,precioMayTableCol,precioPublTableCol;

    @Override
    public void start(Stage primaryStage) throws Exception {
    }

    public void loadResources(){
        List<SiscompArticulo> listaArticulos = ControladorCatalogoArticulos.getListaArticulos();
        data.addAll(listaArticulos);
        fillTable();
    }

    private void fillTable(){
        claveTableCol.setCellValueFactory(new PropertyValueFactory<SiscompArticulo,String>("codigoArticulo"));
        descripGrupoTableCol.setCellValueFactory(new PropertyValueFactory<SiscompArticulo, String>("descripGrupo"));
        descripArticTableCol.setCellValueFactory(new PropertyValueFactory<SiscompArticulo, String>("descripArti"));
        codBarrasTableCol.setCellValueFactory(new PropertyValueFactory<SiscompArticulo, String>("codBarras"));
        precioMayTableCol.setCellValueFactory(new PropertyValueFactory<SiscompArticulo, String>("precioMay"));
        precioPublTableCol.setCellValueFactory(new PropertyValueFactory<SiscompArticulo, String>("precioPublico"));
        prodListTableView.setItems(data);
    }
}
