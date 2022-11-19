/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.RegistroMedico;
import model.RegistroMedicoTableModel;

/**
 *
 * @author Professor
 */
public class RegistroMedicoDAO {
    RegistroMedicoTableModel tabelmodel = new RegistroMedicoTableModel();
    String pathFile = "db.txt";
    String pathFileTemp = "dbTemp.txt";
    String readFile = "";
    
    List <RegistroMedico> listRegistroMedico = new ArrayList<>();
    private final TableRowSorter<TableModel> sorter = new TableRowSorter<>(tabelmodel);
    
    
    
    
}
