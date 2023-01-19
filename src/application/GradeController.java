package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class GradeController implements Initializable {
	
	@FXML TextField txtKor,txtEng,txtSum,txtAvg;
	@FXML Button btnSum;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

	public void btnSumAction(ActionEvent event) {
		
		int kor = Integer.parseInt(txtKor.getText());
		
		int eng = Integer.parseInt(txtEng.getText());
		
		gradeModel sum = new gradeModel();
		
		int total = sum.sum(kor, eng);
		
		txtSum.setText(Integer.toString(total));
	}
	
	public void btnAvgAction(ActionEvent event) {
		
		int kor = Integer.parseInt(txtKor.getText());
		
		int eng = Integer.parseInt(txtEng.getText());
		
		gradeModel avg = new gradeModel();
		
		float Avg = avg.avg(kor,eng);
		
		txtAvg.setText(Float.toString(Avg));
		
	}
	
}
