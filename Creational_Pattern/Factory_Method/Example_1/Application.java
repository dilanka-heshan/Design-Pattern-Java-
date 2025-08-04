package Creational_Pattern.Factory_Method.Example_1;

public class Application {
    private Dialog dialog;

    public void initialize() {
        String os = readApplicationConfigFile();

        if (os.equalsIgnoreCase("Windows")) {
            dialog = new WindowsDialog();
        } else if (os.equalsIgnoreCase("Web")) {
            dialog = new WebDialog();
        } else {
            throw new RuntimeException("Error! Unknown operating system.");
        }
    }

    public void main() {
        this.initialize();
        dialog.render();
    }

    // Simulated config reader
    private String readApplicationConfigFile() {
        // For demonstration: you can modify this to "Web" or "Windows"
        return "Web";
    }

    // Entry point
    public static void main(String[] args) {
        Application app = new Application();
        app.main();
    }
}
