package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class InventoryController {

	@FXML
	private void switchToSheet() throws IOException {
		App.setRoot("sheet");
	}
}
