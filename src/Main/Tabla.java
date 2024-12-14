/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author luix_
 */
public class Tabla {
    public void ver_tabla(JTable tabla, Object[][] datos){
        DefaultTableModel d = new DefaultTableModel(
                datos,
                new String [] {
                    "Nombre de usuario", "Nombre", "Apellidos", "Modificar", "Eliminar"
                }
            
        )
        {public boolean isCellEditable(int row, int column){
            return false;
        }};
        tabla.setModel(d);
        TableColumnModel columnModel = tabla.getColumnModel();//878
        columnModel.getColumn(0).setPreferredWidth(200);
        columnModel.getColumn(1).setPreferredWidth(225);
        columnModel.getColumn(2).setPreferredWidth(252);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(100);
        tabla.setRowHeight(30);
    }
    
    public void ver_tabla2(JTable tabla, Object[][] datos){
        DefaultTableModel d = new DefaultTableModel(
                datos,
                new String [] {
                    "Maquinaria", ""
                }
            
        )
        {public boolean isCellEditable(int row, int column){
            return false;
        }};
        tabla.setModel(d);
        TableColumnModel columnModel = tabla.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(300);
        tabla.setRowHeight(30);
    }
}
