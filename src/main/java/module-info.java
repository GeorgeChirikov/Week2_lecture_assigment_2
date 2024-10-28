module org.example.week2_lecture_assigment_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.week2_lecture_assigment_2 to javafx.fxml;
    exports org.example.week2_lecture_assigment_2;
}