package fxml;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import json.ReadWriteJSON;

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

	private Map syaryoMap = new HashMap();
	@FXML
	private Label history_label;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
		//File Read
		String fileName = "sample10_syaryo_history_pc200.json";
		syaryoMap = (new ReadWriteJSON()).read(fileName);
		
		//Add ListView
		ObservableList list = machineList.getItems();
		for(Object name : syaryoMap.keySet())
			list.add(name);
		
		//Event
		machineList.getSelectionModel().selectedIndexProperty().addListener(
			( ov , old , current ) ->{ 
				// リスト・ビュー内の選択項目を出力
				machineHistorySelected();
			}
		);
	}
	
	public void machineHistorySelected(){
		int index = machineList.getSelectionModel().getSelectedIndex();
		System.out.println( "Selection in the listView is : " + index );
		history_label.setText(machinePrint((Map)syaryoMap.get(machineList.getItems().get(index))));
	}
	
	public String machinePrint(Map map){
		StringBuilder sb = new StringBuilder();
		sb.append(map.get("name")+"\n");
		sb.append(map.get("category")+"\n");
		sb.append(map.get("komtrax")+"\n");
		
		return sb.toString();
	}
}
