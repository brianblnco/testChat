package brian.sockets.chat;



import javax.swing.*;
import java.awt.event.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;


//PROBANDO SI ES NECESATIO HACER UN PUSH PARA VER LOS CAMBIOS EN NUESTO REPOSITORIO DE GIT HUB ( commands line tool )
public class Cliente {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object x = JOptionPane.showInputDialog("Welcome! Introduce your name. ");
		
		MarcoCliente mimarco=new MarcoCliente(); //instanciamos el contenedor principal
		
		mimarco.setTitle("Hi " + x.toString() + "!");
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}










//DESARROLLO DE LA INTERFAZ
//JPanel creación
class LaminaMarcoCliente extends JPanel{
	
	
	private JTextField campo1; //caja de texto del mensaje que enviará el cliente
	
	private JButton miboton;
	
	//constructor donde añadimos los controles
	public LaminaMarcoCliente(){
	
		JLabel texto=new JLabel("Send a message");
		
		add(texto);
	
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");
		
		//isntanciamos ( clase interna ) el evento y se lo añadimos al esuchador de eventos  del boton
		EnviarTexto miEvento = new EnviarTexto();
		
		miboton.addActionListener(miEvento);
		
		add(miboton);	
		
	}
	
	//Clase Interna para el boton enviar
	private class EnviarTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			//System.out.println(campo1.getText());
			
			try {
				//puente virtual que va desde el cliente hasta el servidor 
				//lo abriremos posteriormente en la clase del servidor
				
				Socket socketServidor = new Socket("192.168.40.182",9999);
					
				//flujo de datos
				DataOutputStream flujo_salida = new DataOutputStream(socketServidor.getOutputStream()); //le pasamos como parmetro el 
			
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
		}

	}

	
}

//contenedor general del cliente  ( dentro irá el JPanel)
class MarcoCliente extends JFrame{
	
	//constructor contenedorr general
	public MarcoCliente(){
		
		setBounds(600,300,400,200); //dimensiones 
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente(); //instanciamos un objeto jpanel
		
		add(milamina);
		
		setVisible(true);
		}	
	
}


