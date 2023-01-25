package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {
	
	@FXML
	private TextField txtNumber1;
	
	@FXML
	private TextField txtNumber2;
	
	
	@FXML
	private Label labelResult;
	

	@FXML
	private Button btSum;
	
	@FXML
	public void  onBtSumAction() {
		
	try {
		//com isso aki eu peguei os conteudos das minhas duas caixinha no Scenner Builder
		// e gardei nas vareaveis number1 e number2 e fiz a soma dos dois valores abaixo
		Locale.setDefault(Locale.US);
		double number1 = Double.parseDouble(txtNumber1.getText());
		double number2 = Double.parseDouble(txtNumber2.getText());
		double sum = number1 + number2;
		//e aki eu peguei o resultado da sopma e coloquei na caixinha do label no Scenner Builder
		labelResult.setText(String.format("%.2f", sum));
	}
	catch (NumberFormatException e ) {
		Alerts.showAlert("Error", "Parce error", e.getMessage(), AlertType.ERROR);
	}
	}
}
