//package cap01;
//
//import java.awt.BorderLayout;
//import java.awt.Dimension;
//import java.awt.Graphics;
//import java.awt.Image;
//import java.awt.Toolkit;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowFocusListener;
//import java.awt.event.WindowListener;
//
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//public class VentanaMain extends  JFrame{ 
//	
//	private static Dimension TAMAYO_PANTALLA = Toolkit.getDefaultToolkit().getScreenSize();
//	private Cliente aliado = new Cliente();
//	private Servidor alemania = new Servidor();
//	
//	public Cliente getAliado() {
//		return aliado;
//	}
//
//	public void setAliado(Cliente aliado) {
//		this.aliado = aliado;
//	}
//
//	public Servidor getAlemania() {
//		return alemania;
//	}
//
//	public void setAlemania(Servidor alemania) {
//		this.alemania = alemania;
//	}
//
//	public VentanaMain(JFrame ventServidor, JFrame ventCliente) {
//		
//		setTitle("SEGUNDA GUERRA MUNDIAL");
//		setSize(TAMAYO_PANTALLA);
//		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//		
//		JPanel pnlCentral = new JPanel() {
//
//			@Override
//			protected void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                ImageIcon iconoFondo = new ImageIcon(getClass().getResource("MapaWWII.png"));
//                Image imagenFondo = iconoFondo.getImage();
//                g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
//			}
//			
//		};
//		
//		
//		add(pnlCentral, BorderLayout.CENTER);
//		
//		this.addWindowListener(new WindowAdapter() {
//
//			@Override
//			public void windowClosing(WindowEvent e) {
//				ventServidor.dispose();
//				ventCliente.dispose();
//				FreeChart f = new FreeChart("WWII");
//				f.setVisible( true );
//				
//			}
//
//		});
//	}
//	
//	public JFrame getVentanaMain() {
//		VentanaMain vent = new VentanaMain(null, null);
//		return vent;
//		
//	}
//	
//	public static void main(String[] args) {
//		
//		Cliente aliado = new Cliente();
//		Servidor alemania = new Servidor();
//		
//		VentanaMain ventM = new VentanaMain(aliado, alemania);
//		ventM.setVisible( true );
//		
//		alemania.setVisible( true );
//		aliado.setVisible( true );
//
//	}
//
//}
