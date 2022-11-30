package CODIGO;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PDF {

    public void ine(String photopath, 
            String nombre, 
            String apellidoP, 
            String apellidoM, 
            String calle, 
            String casa, 
            String colonia,
            String cp, 
            String municipio, 
            String estado, 
            String curp) {
        
        Document document = new Document();
        try {
            
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream("CREDENCIAL_INE.pdf"));
            document.open();
           
            PdfContentByte cb = writer.getDirectContent();
            Graphics g = cb.createGraphicsShapes(PageSize.LETTER.getWidth(), PageSize.LETTER.getHeight());
           
            ImageIcon img = new ImageIcon(getClass().getResource("/imagenes/plantilla.jpg"));
            g.drawImage(img.getImage(), 0, 0, 700, 379, null);
            ImageIcon foto = new ImageIcon(photopath);
            g.drawImage(foto.getImage(), 50, 110, 145, 225, null);
            g.drawImage(foto.getImage(), 524, 150, 85, 113, null);
           
            Font f = new Font("Tahoma", Font.ITALIC, 12);
            g.setFont(f);
            g.drawString(nombre, 200, 125);
            g.drawString(apellidoP, 200, 140);
            g.drawString(apellidoM, 200, 155);
            g.drawString(calle, 200, 205);
            g.drawString(casa, 360, 205);
            g.drawString(colonia, 200, 220);
            g.drawString(cp, 360, 220);
            g.drawString(municipio, 200, 235);
            g.drawString(estado, 350, 235);
            g.drawString(curp, 240, 290);

        } catch (DocumentException e) {
            System.out.println(e);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        document.close();
        JOptionPane.showMessageDialog(null, "Exportacion completada!");

    }
}
