module aydin._githubdemo {
    requires javafx.controls;
    requires javafx.fxml;

    opens aydin._githubdemo to javafx.fxml;
    exports aydin._githubdemo;
}
