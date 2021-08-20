import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.Consulta_const;
import model.vo.*;

public class APP_R5_Entregable extends JFrame implements ActionListener{

	private JButton boton1,boton2,boton3;
    private JLabel etiqueta1;
    private JTable Tabla1;
    private JScrollPane Barra1;
    private static final Consulta_const controlador = new Consulta_const();
    
	public APP_R5_Entregable() {
		this.setLayout(null);
        this.setTitle("Proyectos de construcción - Reto 5 - Ciclo 2 - MINTIC");
        etiqueta1 = new JLabel("Por favor, oprima algún botón para realizar una consulta");
        etiqueta1.setBounds(35, 0, 400, 80);
        this.add(etiqueta1);

		boton1=new JButton("Pregunta 1");
        boton1.setBounds(450, 70, 100, 40);
        boton1.setFont(new Font("Verdana",Font.BOLD,10));
		this.add(boton1);
        boton1.addActionListener(this);

        boton2=new JButton("Pregunta 2");
        boton2.setBounds(450, 120, 100, 40);
        boton2.setFont(new Font("Verdana",Font.BOLD,10));
		this.add(boton2);
        boton2.addActionListener(this);

        boton3=new JButton("Pregunta 3");
        boton3.setBounds(450, 170, 100, 40);
        boton3.setFont(new Font("Verdana",Font.BOLD,10));
		this.add(boton3);
		boton3.addActionListener(this);

        Barra1=new JScrollPane();
        Barra1.setBounds(27, 85, 400,150);
        getContentPane().add(Barra1);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) {
			construirTabla1();
            etiqueta1.setText("<html>id del proyecto, la fecha, la constructora y el serial \n de los proyectos que tengan como id de proyecto los números menores a 15 </html>");
		}   
		if (e.getSource()==boton2) {
			construirTabla2();
            etiqueta1.setText("<html>id del proyecto y el área máxima del Tipo de los proyectos con construcciones con un numero de cuartos/habitaciones igual a 2</html>");
		}
		if (e.getSource()==boton3) {
			construirTabla3();
            etiqueta1.setText("<html>id del proyecto y como segunda y última columna el nombre del Lider concatenado con su primer apellido separados por un espacio con el nombre de la columna como nombreapellido, y la condición deberá ser que todos los proyectos seleccionados pertenezcan al banco “Bancolombia”.</html>");
		}
	}
    //Construcción de la tabla de datos número 1
    private void construirTabla1() {
        String titulos[]={"ID_Proyecto","Fecha_Inicio","Constructora"," Serial_proyecto"};
        String informacion[][]=obtenerMatriz1();
        
        Tabla1=new JTable(informacion,titulos);
        Barra1.setViewportView(Tabla1);
    }
    private String[][] obtenerMatriz1() {
        try{
            ArrayList<Consulta1VO_19> lista1 = controlador.realizarConsulta1();
            String matrizInfo[][] = new String[lista1.size()][4];

            for (int i = 0; i < lista1.size(); i++) {
                matrizInfo[i][0]=lista1.get(i).getID_Proyecto()+"";
                matrizInfo[i][1]=lista1.get(i).getFecha_Inicio()+"";
                matrizInfo[i][2]=lista1.get(i).getConstructora()+"";
                matrizInfo[i][3]=lista1.get(i).getSerial_proyecto()+"";
            }
            return matrizInfo;
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
            return null;
        } 
    }
    //Construcción de la tabla de datos número 2

    private void construirTabla2() {
        String titulos[]={"ID_Proyecto","Area_Max"};
        String informacion[][]=obtenerMatriz2();
        
        Tabla1=new JTable(informacion,titulos);
        Barra1.setViewportView(Tabla1);
    }

    private String[][] obtenerMatriz2() {
        try{
            ArrayList<Consulta2VO_19> lista2 = controlador.realizarConsulta2();
            String matrizInfo[][] = new String[lista2.size()][2];

            for (int i = 0; i < lista2.size(); i++) {
                matrizInfo[i][0]=lista2.get(i).getID_Proyecto()+"";
                matrizInfo[i][1]=lista2.get(i).getArea_Max()+"";
            }
            return matrizInfo;
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
            return null;
        } 
    }
    private void construirTabla3() {
        String titulos[]={"ID_Proyecto","Nombreapellido"};
        String informacion[][]=obtenerMatriz3();
        
        Tabla1=new JTable(informacion,titulos);
        Barra1.setViewportView(Tabla1);
    }

    private String[][] obtenerMatriz3() {
        try{
            ArrayList<Consulta3VO_19> lista3 = controlador.realizarConsulta3();
            String matrizInfo[][] = new String[lista3.size()][2];

            for (int i = 0; i < lista3.size(); i++) {
                matrizInfo[i][0]=lista3.get(i).getID_Proyecto()+"";
                matrizInfo[i][1]=lista3.get(i).getnombreapellido()+"";
            }
            return matrizInfo;
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
            return null;
        } 
    }
    
	public static void main(String[] args){
		APP_R5_Entregable formulario1=new APP_R5_Entregable();
		formulario1.setSize(600, 300);
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false);
		formulario1.setVisible(true);
	}
}