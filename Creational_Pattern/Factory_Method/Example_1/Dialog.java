package Creational_Pattern.Factory_Method.Example_1;

//Creator (Abstact class)
abstract class Dialog {
    public abstract Button createButton();

    public void render() {
        Button okbutton = createButton();
        okbutton.onClick("closeDialog");
        okbutton.render();

    }

}
