package controller;

import com.jfoenix.controls.JFXButton;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFormController {

    @FXML
    private JFXButton btnCustomerMangeForm;

    @FXML
    private JFXButton btnItemMangeForm;

    @FXML
    private JFXButton btnOrderDetailManageForm;

    Stage customerMangeFormStage=new Stage();
    Stage itemMangeFormStage=new Stage();
    Stage orderMangeFormStage=new Stage();
    Stage orderDetailManageFormStage=new Stage();

    @FXML
    void btnCustomerMangeFormOnAction(ActionEvent event) throws IOException {
        customerMangeFormStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/CustomerManagement.fxml"))));
        customerMangeFormStage.show();
    }

    @FXML
    void btnItemMangeFormOnAction(ActionEvent event) throws IOException {
        itemMangeFormStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ItemManagement.fxml"))));
        itemMangeFormStage.show();
    }

    @FXML
    void btnOrderMangeFormOnAction(ActionEvent event) throws IOException {
        orderMangeFormStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/OrderManagement.fxml"))));
        orderMangeFormStage.show();
    }

    @FXML
    void btnOrderDetailMangeFormOnAction(ActionEvent event) throws IOException {
        orderDetailManageFormStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/OrderDetailManagement.fxml"))));
        orderDetailManageFormStage.show();
    }

}
