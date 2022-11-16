package Modul4_5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
import javax.swing.*;

public class Modul5_2 
{ 
    public static void main( String[] args )
    { 
        String w = ""; 
        w = JOptionPane.showInputDialog("Enter Word 1"); 
        String msg = "" + w + ""; 
        
        String ww = ""; 
        ww = JOptionPane.showInputDialog("Enter Word 2"); 
        String mm = "" + ww + "";
        
        String www = ""; 
        www = JOptionPane.showInputDialog("Enter Word 3"); 
        String mmm = "" + www + "";

        JOptionPane.showMessageDialog(null, ("" + msg + "  " + mm + "  " + mmm +" ")); 

    } 
} 
    