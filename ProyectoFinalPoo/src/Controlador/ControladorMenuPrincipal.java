
package Controlador;

import Vista.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorMenuPrincipal implements ActionListener{
    
    public MenuPrincipal menuPrincipal;
    public ControlNuevaPelicula controlNuevaPeliucla; 
    
    public ControladorMenuPrincipal( MenuPrincipal mp){
       menuPrincipal = mp;
       menuPrincipal.getBotonAgregarPelicula().addActionListener(this);
       menuPrincipal.getBotonBorrarPelicula().addActionListener(this);
       menuPrincipal.getBotonConfiguracionSalas().addActionListener(this);
       menuPrincipal.getBotonRevisarHorarios().addActionListener(this);
       menuPrincipal.getBotonComprarBoletos().addActionListener(this);
       menuPrincipal.getBotonSALIR().addActionListener(this);
    }
            
    
    
    public void actionPerformed(ActionEvent evento){
        if( menuPrincipal.getBotonAgregarPelicula() == evento.getSource()){
            menuPrincipal.setVisible(false);
            //controlNuevaPelicula.set
        }
        if( menuPrincipal.getBotonBorrarPelicula() == evento.getSource()){
            
        }
        if( menuPrincipal.getBotonConfiguracionSalas() == evento.getSource()){
            
        }
        if( menuPrincipal.getBotonRevisarHorarios() == evento.getSource()){
            
        }
        if( menuPrincipal.getBotonComprarBoletos() == evento.getSource()){
            
        }
        if( menuPrincipal.getBotonSALIR() == evento.getSource()){
            
        }
  
    }
    
    
    
    
    
    
    
    
    
    
    
}
