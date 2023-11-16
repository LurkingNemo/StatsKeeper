package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class SheetController {

	@FXML
	private void switchToInventory() throws IOException {
		App.setRoot("inventory");
	}
}
