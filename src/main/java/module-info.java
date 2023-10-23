module com.example.addresbookxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.addresbookxml to javafx.fxml;
    exports es.ieslosmontecillos.addresbookxml;
}