import javax.swing.*;

	public class ventana extends JFrame{
		private JLabel etiqueta1, etiqueta2, etiqueta3;
    		private JTextField cajaTexto;
		private JTextArea cajaComentar;
		private JPasswordField cajaPass;
    		private JButton botonOk, botonCancelar;

	public ventana(){
		setLayout(null);

		//Usuario
		etiqueta1 = new JLabel("Username:");
              	//  .setBounds(x,y,ancho,alto)
          	etiqueta1.setBounds(15,15,100,25);
          	add(etiqueta1);
       		cajaTexto = new JTextField();
         	cajaTexto.setBounds(100,10,200,25);
          	add(cajaTexto);

		//Contraseña
		etiqueta2 = new JLabel("Password:");
         	etiqueta2.setBounds(15,50,250,25);
          	add(etiqueta2);
       		cajaPass  = new JPasswordField();
          	cajaPass.setBounds(100,50,200,25);
          	add(cajaPass);


		//Boton  ok
		botonOk = new JButton("OK");
           	botonOk.setBounds(170,80,100,30);
           	add(botonOk);
      		//Boton cancelar
		botonCancelar = new JButton("Cancelar");
           	botonCancelar.setBounds(80,80,100,30);
            	add(botonCancelar);
 	}
	 public static void main(String[] args){
      		ventana v = new ventana();
      		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     		v.setVisible(true);
      		v.setTitle("Login");
      		v.setSize(350,150);
         }

	}//class
