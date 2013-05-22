import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class HelloWorldGui extends JFrame {
	public HelloWorldGui() {
		add(new JLabel("Hello World"));
		setLocationRelativeTo(null);
		pack();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new HelloWorldGui().setVisible(true);
			}
		});
	}
}
