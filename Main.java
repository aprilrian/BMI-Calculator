import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() { // Run the GUI codes on the Event-Dispatching thread for thread safety
                new Controller(); // Let the constructor do the job
            }
        });
    }
}