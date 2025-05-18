module com.sonti.sonti {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.sonti.sonti to javafx.fxml;
    exports com.sonti.sonti;
}