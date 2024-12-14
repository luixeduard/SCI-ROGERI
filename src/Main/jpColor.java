/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

/**
 *
 * @author luix_
 */
public class jpColor extends javax.swing.JPanel{
    private Color color1 = new Color(0,0,0);
    private Color color2 = new Color(0,0,0);
    
    public jpColor(){
    }
    
    public jpColor(Color c1, Color c2){
        color1 = c1;
        color2 = c2;        
    }
    
    @Override
    public void paint(Graphics g) {    
        Graphics2D g2 = (Graphics2D) g.create();
        Rectangle clip = g2.getClipBounds();   
        g2.setPaint(new GradientPaint(0.0f, 0.0f, color1.brighter(),0.0f ,getHeight(), color2.brighter()));        
        g2.fillRect(clip.x, clip.y, clip.width, clip.height);        
    }
    
}