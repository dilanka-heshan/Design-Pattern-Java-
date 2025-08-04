package Creational_Pattern.Factory_Method.Example_1;

public class WebDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}