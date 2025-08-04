package Creational_Pattern.Factory_Method.Example_1;

//Concrete Product
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows Button");
    }

    @Override
    public void onClick(String eventHandler) {
        System.out.println("Windows Button clicked with event handler: " + eventHandler);
    }

}
