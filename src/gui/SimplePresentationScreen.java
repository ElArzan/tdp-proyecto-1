package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import java.time.LocalDateTime;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField txtLU;
	private JLabel lblApellido;
	private JTextField textApellido;
	private JLabel lblLU;
	private JTextField textNombre;
	private JLabel lblNombre;
	private JTextField textEMail;
	private JLabel lblEMail;
	private JTextField txtGitHubURL;
	private JLabel lblNGitHubURL;
	private JLabel lblNewLabel;
	private JLabel lblFotoPersonal;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(585, 275));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 260));
		tabbedPane.addTab("Informacion del alumno", null, tabInformation, "Muestra la informacion declarada por el alumno");
		tabInformation.setLayout(null);
		
		//Apartado LU
		txtLU = new JTextField();
		txtLU.setText(String.valueOf(studentData.getId()));
		txtLU.setBounds(97, 20, 318, 20);
		tabInformation.add(txtLU);
		txtLU.setColumns(10);
		
		lblLU = new JLabel("LU");
		lblLU.setBounds(10, 23, 36, 14);
		tabInformation.add(lblLU);
		
		//Apartado Apellido		
		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 54, 46, 14);
		tabInformation.add(lblApellido);
		
		textApellido = new JTextField();
		textApellido.setText(studentData.getLastName());
		textApellido.setBounds(97, 51, 318, 20);
		tabInformation.add(textApellido);
		textApellido.setColumns(10);
		
		//Apartado Nombre
		textNombre = new JTextField();
		textNombre.setText(studentData.getFirstName());
		textNombre.setBounds(97, 82, 318, 20);
		tabInformation.add(textNombre);
		textNombre.setColumns(10);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 85, 46, 14);
		tabInformation.add(lblNombre);
		
		//Apartado e-mail
		textEMail = new JTextField();
		textEMail.setText(studentData.getMail());
		textEMail.setBounds(97, 113, 318, 20);
		tabInformation.add(textEMail);
		textEMail.setColumns(10);
		
		lblEMail = new JLabel("E-mail");
		lblEMail.setBounds(10, 116, 46, 14);
		tabInformation.add(lblEMail);
		
		//Apartado GitHub URL
		txtGitHubURL = new JTextField();
		txtGitHubURL.setText(studentData.getGithubURL());
		txtGitHubURL.setBounds(97, 144, 318, 20);
		tabInformation.add(txtGitHubURL);
		txtGitHubURL.setColumns(10);
		
		lblNGitHubURL = new JLabel("GitHub URL");
		lblNGitHubURL.setBounds(10, 147, 77, 14);
		tabInformation.add(lblNGitHubURL);
		
		//Apartado Tiempo y Dia
		lblNewLabel = new JLabel("Esta ventana fue generada el "+ LocalDateTime.now().getDayOfMonth() +"/"+ LocalDateTime.now().getMonthValue() +"/"+ LocalDateTime.now().getYear() + " a las: " + LocalDateTime.now().getHour() +":"+ LocalDateTime.now().getMinute() +":"+ LocalDateTime.now().getSecond());
		lblNewLabel.setBounds(10, 175, 415, 20);
		tabInformation.add(lblNewLabel);
		contentPane.add(tabbedPane, BorderLayout.WEST);
		
		//Apartado Foto Personal
		lblFotoPersonal = new JLabel("");
		lblFotoPersonal.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource("/images/MiFoto.jpeg")));
		contentPane.add(lblFotoPersonal, BorderLayout.EAST);
		
		
		
	}
}
