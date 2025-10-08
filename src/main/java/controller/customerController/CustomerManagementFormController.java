package controller.customerController;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

import java.awt.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class CustomerManagementFormController extends Component implements Initializable {

    ObservableList<Customer> customerDetailsList=FXCollections.observableArrayList();

    @FXML
    private JFXButton btnAdd;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private JFXButton btndelete;

    @FXML
    private JFXComboBox<String> cmbProvince;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colCity;

    @FXML
    private TableColumn<?, ?> colCustomerID;

    @FXML
    private TableColumn<?, ?> colDOB;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colPostalcode;

    @FXML
    private TableColumn<?, ?> colProvince;

    @FXML
    private TableColumn<?, ?> colSalary;

    @FXML
    private TableColumn<?, ?> colTitle;

    @FXML
    private TableView<Customer> tblCustomerDetails;

    @FXML
    private DatePicker dPDateOfBith;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtCity;

    @FXML
    private JFXTextField txtCustomerId;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtPostalCode;

    @FXML
    private JFXTextField txtSalary;

    @FXML
    private JFXTextArea txtTitle;

    CustomerManagementService customerManagementService = new CustomerManagementController();

    @FXML
    void btnAddOnAction(ActionEvent event) {

        String customerId = txtCustomerId.getText();
        String address = txtAddress.getText();
        String city = txtCity.getText();
        Double salary = Double.parseDouble(txtSalary.getText());
        String title = txtTitle.getText();
        String postalCode = txtPostalCode.getText();
        String name = txtName.getText();
        LocalDate dob = dPDateOfBith.getValue();
        String province = cmbProvince.getValue();


        customerManagementService.addCustomerDetails(
                new Customer(customerId, name, title, dob, salary, address, city, province, postalCode)
        );
    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

        String customerId = txtCustomerId.getText();
        String address = txtAddress.getText();
        String city = txtCity.getText();
        Double salary = Double.parseDouble(txtSalary.getText());
        String title = txtTitle.getText();
        String postalCode = txtPostalCode.getText();
        String name = txtName.getText();
        LocalDate dob = dPDateOfBith.getValue();
        String province = cmbProvince.getValue();


        customerManagementService.updateCustomerDetails(
                new Customer(customerId, name, title, dob, salary, address, city, province, postalCode)
        );

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ObservableList<String> provinceList = FXCollections.observableArrayList(
                "Southern",
                "Western",
                "Eastern",
                "Northern"
        );
        cmbProvince.setItems(provinceList);

        colCustomerID.setCellValueFactory(new PropertyValueFactory<>("CustomerID"));
        colTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colDOB.setCellValueFactory(new PropertyValueFactory<>("dob"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colCity.setCellValueFactory(new PropertyValueFactory<>("city"));
        colPostalcode.setCellValueFactory(new PropertyValueFactory<>("postalCode"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        colProvince.setCellValueFactory(new PropertyValueFactory<>("province"));

        loadCustomerDetails();

    }

    public void loadCustomerDetails() {

        customerDetailsList=customerManagementService.getAllCustomerDetails();
        tblCustomerDetails.setItems(customerDetailsList);
    }


}
