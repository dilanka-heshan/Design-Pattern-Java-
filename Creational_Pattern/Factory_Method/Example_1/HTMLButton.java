package Creational_Pattern.Factory_Method.Example_1;

//concrete Product - HTML Button
public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering HTML Button");
    }

    @Override
    public void onClick(String eventHandler) {
        System.out.println("HTML Button clicked with event handler: " + eventHandler);
    }

}
