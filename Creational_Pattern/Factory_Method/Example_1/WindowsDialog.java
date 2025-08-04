package Creational_Pattern.Factory_Method.Example_1;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
