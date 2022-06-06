module ldp.grupo07.backgammonldp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens ldp.grupo07.backgammonldp to javafx.fxml;
    exports ldp.grupo07.backgammonldp;
}