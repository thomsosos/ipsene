module com.ipsene.ipsene {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ipsene.ipsene to javafx.fxml;
    exports com.ipsene.ipsene;
}