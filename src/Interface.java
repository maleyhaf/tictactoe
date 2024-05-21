import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interface {
    public static void main(String args[]) {
        System.out.println("Testing Compilation...\n");

       /* THE CODE BELOW IS SEVERELY FOR TESTING PURPOSES ONLY
        * OBTAINED FROM RESOURCES ONLINE
        * TO CHECK FOR HOW GUI COMPILATION WOULD WORK WITH JAVA SWING
        */

        // Create a JFrame
        JFrame frame = new JFrame("Java Swing Example");

        // Create a JPanel
        JPanel panel = new JPanel();

        // Create a JButton
        JButton button = new JButton("Click Me!");

        // Add the button to the panel
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        // Set frame size
        frame.setSize(300, 200);

        // Set frame close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }

}
