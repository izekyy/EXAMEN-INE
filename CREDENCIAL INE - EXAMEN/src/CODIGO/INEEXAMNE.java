package CODIGO;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import javax.swing.*;

public class INEEXAMNE extends JFrame {

    public INEEXAMNE() {
        super("INE");
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.gray);
        setLayout(null);
        componentes();
        setVisible(true);

    }
    public String photopath = null;
    public JLabel jLabelRutaFoto;
    public JLabel jLabelFoto;
    public JLabel jLabelNombre;
    public JTextField jTextFieldNombre;
    public JLabel jLabelApellidoP;
    public JTextField jTextFieldApellidoP;
    public JLabel jLabelApellidoM;
    public JTextField jTextFieldApellidoM;
    public JLabel jLabelEstado;
    public JTextField jTextFieldEstado;
    public JLabel jLabelCiudad;
    public JTextField jTextFieldCiudad;
    public JLabel jLabelColonia;
    public JTextField jTextFieldColonia;
    public JLabel jLabelCodigoP;
    public JTextField jTextFieldCodigoP;
    public JLabel jLabelCalle;
    public JTextField jTextFieldCalle;
    public JLabel jLabelNCasa;
    public JTextField jTextFieldNCasa;
    public JLabel jLabelCurp;
    public JTextField jTextFieldCurp;

    public static void main(String[] args) {
        INEEXAMNE formu = new INEEXAMNE();
    }

    private void componentes() {

        Font fuentePrincipal = new Font("Trajan", Font.ITALIC, 30);
        Font fuenteF = new Font("Trajan", 0, 14);
        Font fuenteC = new Font("Yu Gothic UI Semilight", 0, 14);

        JLabel jLabelTitulo = new JLabel("DATOS GENERALES");
        jLabelTitulo.setFont(fuentePrincipal);
        jLabelTitulo.setBounds(250, 0, 600, 50);
        add(jLabelTitulo);
        
        
        jLabelNombre = new JLabel("Nombre(s):");
        jLabelNombre.setFont(fuenteF);
        jLabelNombre.setBounds(25, 50, 200, 30);
        add(jLabelNombre);                                //NOMBRE
        jTextFieldNombre = new JTextField();
        jTextFieldNombre.setFont(fuenteC);
        jTextFieldNombre.setBounds(160, 50, 150, 30);
        add(jTextFieldNombre);

        
        
        jLabelApellidoP = new JLabel("Apellido Paterno:");
        jLabelApellidoP.setFont(fuenteF);
        jLabelApellidoP.setBounds(25, 90, 200, 30);
        add(jLabelApellidoP);
        jTextFieldApellidoP = new JTextField();              //A. OATERNO
        jTextFieldApellidoP.setFont(fuenteC);
        jTextFieldApellidoP.setBounds(160, 90, 150, 30);
        add(jTextFieldApellidoP);

        
        
        jLabelApellidoM = new JLabel("Apellido Materno:");
        jLabelApellidoM.setFont(fuenteF);
        jLabelApellidoM.setBounds(25, 130, 200, 30);
        add(jLabelApellidoM);                              //A. MATERNO
        jTextFieldApellidoM = new JTextField();
        jTextFieldApellidoM.setFont(fuenteC);
        jTextFieldApellidoM.setBounds(160, 130, 150, 30);
        add(jTextFieldApellidoM);

        
        
        jLabelEstado = new JLabel("Estado:");
        jLabelEstado.setFont(fuenteF);
        jLabelEstado.setBounds(25, 170, 200, 30);
        add(jLabelEstado);                                 //ESTADO
        jTextFieldEstado = new JTextField(); 
        jTextFieldEstado.setFont(fuenteC);
        jTextFieldEstado.setBounds(160, 170, 150, 30);
        add(jTextFieldEstado);
        
        
        jLabelCiudad = new JLabel("Ciudad:");
        jLabelCiudad.setFont(fuenteF);
        jLabelCiudad.setBounds(25, 210, 200, 30);
        add(jLabelCiudad);                                 //CIUDAD
        jTextFieldCiudad = new JTextField();
        jTextFieldCiudad.setFont(fuenteC);
        jTextFieldCiudad.setBounds(160, 210, 150, 30);
        add(jTextFieldCiudad);

        
        jLabelColonia = new JLabel("Colonia:");
        jLabelColonia.setFont(fuenteF);
        jLabelColonia.setBounds(350, 50, 200, 30);
        add(jLabelColonia);                                //COLONIA
        jTextFieldColonia = new JTextField();
        jTextFieldColonia.setFont(fuenteC);
        jTextFieldColonia.setBounds(480, 50, 150, 30);
        add(jTextFieldColonia);

        
        jLabelCodigoP = new JLabel("Codigo Postal:");
        jLabelCodigoP.setFont(fuenteF);
        jLabelCodigoP.setBounds(350, 90, 200, 30);
        add(jLabelCodigoP);                                  //CP
        jTextFieldCodigoP = new JTextField();
        jTextFieldCodigoP.setFont(fuenteC);
        jTextFieldCodigoP.setBounds(480, 90, 150, 30);
        add(jTextFieldCodigoP);

       
        jLabelCalle = new JLabel("Nombre de calle:");
        jLabelCalle.setFont(fuenteF);
        jLabelCalle.setBounds(350, 130, 200, 30);
        add(jLabelCalle);                                   //NUMERO DE CALLE
        jTextFieldCalle = new JTextField();
        jTextFieldCalle.setFont(fuenteC);
        jTextFieldCalle.setBounds(480, 130, 150, 30);
        add(jTextFieldCalle);

        
        jLabelNCasa = new JLabel("Numero de casa:");
        jLabelNCasa.setFont(fuenteF);
        jLabelNCasa.setBounds(350, 170, 200, 30);            //NUMERO DE CASA
        add(jLabelNCasa);
        jTextFieldNCasa = new JTextField();
        jTextFieldNCasa.setFont(fuenteC);
        jTextFieldNCasa.setBounds(480, 170, 150, 30);
        add(jTextFieldNCasa);

        
        jLabelCurp = new JLabel("CURP:");
        jLabelCurp.setFont(fuenteF);
        jLabelCurp.setBounds(350, 210, 200, 30);
        add(jLabelCurp);                                       //CURP
        jTextFieldCurp = new JTextField();
        jTextFieldCurp.setFont(fuenteC);
        jTextFieldCurp.setBounds(480, 210, 150, 30);
        add(jTextFieldCurp);
        
        JLabel jLabelfoto2 = new JLabel("Foto:");
        jLabelfoto2.setFont(fuenteF);
        jLabelfoto2.setBounds(25, 250, 150, 30);
        add(jLabelfoto2);

        
        JButton jButtonAbrir = new JButton("Abrir foto");
        jButtonAbrir.setFont(fuenteF);
        jButtonAbrir.setBackground(Color.black);
        jButtonAbrir.setForeground(Color.white);                //FOTOGRAFIA
        jButtonAbrir.setBounds(160, 250, 150, 30);
        jButtonAbrir.addActionListener((ActionEvent e) -> {
            evento_jButtonAbrir();
        });
        add(jButtonAbrir);
        

        jLabelRutaFoto = new JLabel();
        jLabelRutaFoto.setFont(fuenteF);
        jLabelRutaFoto.setBounds(160, 675, 150, 30);
        add(jLabelRutaFoto);
        jLabelFoto = new JLabel();
        jLabelFoto.setBounds(160, 250, 500, 500);
        add(jLabelFoto);

       
        JButton jButtonGuardar = new JButton("Exportar");
        jButtonGuardar.setFont(fuenteF);
        jButtonGuardar.setBackground(Color.black);
        jButtonGuardar.setForeground(Color.white);               //BOTON EXPORTAR
        jButtonGuardar.setBounds(650, 50, 100, 30);
        jButtonGuardar.addActionListener((ActionEvent e) -> {
            evento_jButtonGuardar();
        });
        add(jButtonGuardar);

    }

    public void evento_jButtonAbrir() {
        try {
            JFileChooser filechooser = new JFileChooser();
            if (JFileChooser.APPROVE_OPTION == filechooser.showDialog(null, "Abrir")) {
                File file = filechooser.getSelectedFile();
                photopath = file.getAbsolutePath();
                jLabelRutaFoto.setText(photopath);
                jLabelFoto.setIcon(new ImageIcon(photopath));
                System.out.println(photopath);
            }
        } catch (HeadlessException e) {
            System.out.println(e);
        }

    }

    private void evento_jButtonGuardar() {
        try {
            PDF ine =new PDF();
            ine.ine(photopath, 
                    jTextFieldNombre.getText(), 
                    jTextFieldApellidoP.getText(), 
                    jTextFieldApellidoM.getText(), 
                    jTextFieldCalle.getText(), 
                    jTextFieldNCasa.getText(), 
                    jTextFieldColonia.getText(), 
                    jTextFieldCodigoP.getText(), 
                    jTextFieldCiudad.getText(), 
                    jTextFieldEstado.getText(), 
                    jTextFieldCurp.getText());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.exit(0);
    }
}
