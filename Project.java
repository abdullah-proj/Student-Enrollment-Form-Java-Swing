/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
/**
 *
 * @author mg112
 */
public class Project {
 
    public static void main(String[] args){
       
       FlatMacLightLaf.setup();
       ProjectObject p = new ProjectObject();
       p.setVisible(true);
}
}
