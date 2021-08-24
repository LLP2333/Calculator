package Calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ViewController {

    @FXML
    private TextField number1;

    @FXML
    private TextField number2;

    @FXML
    private Button add;

    @FXML
    private Button subtract;

    @FXML
    private Button multiply;

    @FXML
    private Button divide;

    @FXML
    private Button equalBut;


    @FXML
    void addBut(ActionEvent event) {
        String x=number1.getText();
        String y=number2.getText();

        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        String t=Integer.toString(a+b);
        option(t);

    }

    @FXML
    void divideBut(ActionEvent event) {
        String x=number1.getText();
        String y=number2.getText();

        Float a=Float.parseFloat(x);
        Float b=Float.parseFloat(y);
        /*int a = Integer.parseInt(x); int b = Integer.parseInt(y); */
        String t=Float.toString(a/b);
        option(t);

    }

    @FXML
    void multiplyBut(ActionEvent event) {
        String x=number1.getText();
        String y=number2.getText();

        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        String t=Integer.toString(a*b);
        option(t);
    }

    @FXML
    void subtractBut(ActionEvent event) {

        String x=number1.getText();
        String y=number2.getText();

        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        String t=Integer.toString(a-b);
        option(t);
    }
    //输出提示信息
    public void option(String message){
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.titleProperty().set("计算结果");
        alert.headerTextProperty().set(message);
        alert.showAndWait();
    }

}
