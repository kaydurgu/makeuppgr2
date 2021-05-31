
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private Button quitbtn;
    @FXML
    private Button kgzbtn;
    @FXML
    private Button worldbtn;
    @FXML
    private Label total;
    @FXML
    private Label death;
    @FXML
    private Label recovered;
    World Worldinfo;
    KGZ Kgzinfo;
    public Controller() throws IOException {
        Worldinfo = new World();
        Kgzinfo = new KGZ();

    }
    @FXML
    void kgzinfo(ActionEvent event) {
        total.setText("Total cases: "+Kgzinfo.KGZ_total());
        death.setText("Cases of death: "+Kgzinfo.KGZ_deaths());
        recovered.setText("Recovered: "+Kgzinfo.KGZ_recovered());
    }

    @FXML
    void quitplease(ActionEvent event) {
        Stage stage = (Stage) quitbtn.getScene().getWindow();
        stage.close();
    }

    @FXML
    void worldinfo(ActionEvent event) {
        total.setText("Total cases: "+Worldinfo.world_total());
        death.setText("Cases of death: "+Worldinfo.world_deaths());
        recovered.setText("Recovered: "+Worldinfo.world_recovered());
    }

}

