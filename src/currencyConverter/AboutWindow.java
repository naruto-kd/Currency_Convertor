package currencyConverter;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.net.URI;
import java.util.ResourceBundle;

public class AboutWindow extends JFrame {
	private static final ResourceBundle BUNDLE = ResourceBundle.getBundle("localization.translation"); //$NON-NLS-1$
	private JPanel contentPane;
	private static AboutWindow windowInstance = null;

	/**
	 * Create the aboutWindow frame
	 */
	private AboutWindow() {
		setTitle(BUNDLE.getString("AboutWindow.this.title")); //$NON-NLS-1$
		setBounds(100, 100, 347, 260);
		setLocationRelativeTo(null);
		setResizable( false );

		// Window components
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// Label "author"
		JLabel lblAuthor = new JLabel(BUNDLE.getString("AboutWindow.lblAuthor.text")); //$NON-NLS-1$
		lblAuthor.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuthor.setBounds(65, 170, 219, 33);

                // label "title"
		JLabel lblTitle = new JLabel("Currency Converter");
		lblTitle.setBounds(65, 12, 219, 33);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Noto Sans", Font.BOLD, 15));
		contentPane.add(lblTitle);
                
		// label with a clickable link " GITHUB "
		JLabel lblGithub = new JLabel("Visit my GitHub! : ");
		lblGithub.setBounds(56, 100, 219, 33);
		
		JLabel lblGithubLink = new JLabel("naruto-kd");
		lblGithubLink.setBounds(65, 100, 219, 33);
		lblGithubLink.setHorizontalAlignment(SwingConstants.CENTER);
		lblGithubLink.setForeground(Color.BLUE);
		lblGithubLink.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblGithubLink.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            Desktop.getDesktop().browse(new URI("https://github.com/naruto-kd"));
                        } catch (Exception ex) {
                                ex.printStackTrace();
                        }
                      }
                });
		contentPane.setLayout(null);

		// label "instagram"
		JLabel lblinsta = new JLabel("Follow me on instagram : ");
		lblinsta.setBounds(30, 120, 219, 33);
		
                
                JLabel lblinstaLink = new JLabel("_dinesh_royce_");
		lblinstaLink.setBounds(80, 120, 219, 33);
		lblinstaLink.setHorizontalAlignment(SwingConstants.CENTER);
		lblinstaLink.setForeground(Color.BLUE);
		lblinstaLink.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblinstaLink.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.instagram.com/_dinesh_royce_/"));
                } catch (Exception ex) {
                	ex.printStackTrace();
                }
            }
        });
        
                
                
		// label "version"
		JLabel lblVersion = new JLabel("Version 1.0");
		lblVersion.setHorizontalAlignment(SwingConstants.CENTER);
		lblVersion.setBounds(65, 45, 219, 33);
		
                contentPane.add(lblVersion);
		contentPane.add(lblAuthor);
		contentPane.add(lblGithubLink);
		contentPane.add(lblGithub);
                contentPane.add(lblinstaLink);
                contentPane.add(lblinsta);
	}

	// Check if the window is already created to launch only one instance of the window.
	public static AboutWindow getInstance() {
		if (windowInstance == null) {
			windowInstance = new AboutWindow();
		}
		 return windowInstance;
	}
}