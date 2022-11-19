/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Professor
 */
public class RegistroMedicoTableModel extends AbstractTableModel {
 
    private List<RegistroMedico> list = new ArrayList<>();
    private final String[] columnNames = {"No. RM", "Paciente", "Endereco", "Classe", "Sala"};

    public void setList(List<RegistroMedico> list) {
        this.list = list;
        fireTableDataChanged();
    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column]; //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public int getRowCount() {
            return list.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
 switch (columnIndex) {
        case 0:
            return list.get(rowIndex).getRm();
        case 1:
            return list.get(rowIndex).getPaciente();
        case 2:
            return list.get(rowIndex).getEndereco();
        case 3:
            return list.get(rowIndex).getClasse();
        case 4:
            return list.get(rowIndex).getSala();
        default:
            return null;
        }
        
    }
  
    
}
