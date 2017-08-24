package fxml;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 *
 * @author kaeru
 */
public class MachineHistoryFXMLController implements Initializable {
	
@FXML
    private VBox root_vbox;
    @FXML
    private MenuBar fileMenu;
    @FXML
    private SplitPane history_splitpane;
    @FXML
    private ListView<?> machineList;
    @FXML
    private ScrollPane history_scroll_pane;
    @FXML
    private Pane history_view_pane;
	
	
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            // TODO
    }	

    @FXML
    private void listClicked(MouseEvent event) {
    }
	
}
