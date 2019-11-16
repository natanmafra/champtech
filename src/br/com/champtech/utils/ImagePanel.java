package br.com.champtech.utils;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Objects;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Fukutu
 */
public class ImagePanel extends JPanel {

    private Icon icon;
    private Image image;

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    private boolean isLoaded = false;

    @Override
    protected void paintComponent(Graphics g) {

        if (!isLoaded && Objects.nonNull(this.icon)) {
            this.isLoaded = true;
            
            ImageIcon imageIcon = new ImageIcon(this.icon.toString());
            imageIcon.setImage(imageIcon.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH));
            
            this.image = imageIcon.getImage();
            
            System.out.println("Image loaded!");
        }
        
        super.paintComponent(g);
        g.drawImage(new ImageIcon("teste.jpg").getImage(), 0, 0, this);

    }
}
