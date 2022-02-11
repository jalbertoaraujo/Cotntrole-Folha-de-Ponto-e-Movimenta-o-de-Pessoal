package Uteis;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.table.TableColumn;


import View.TelaAuditoria;

public class ComboBoxAuditoria {
	
	public static JComboBox comboBox;
	
	public void comboboxauditoria() {
		
		TableColumn auditponto = TelaAuditoria.tabelaacompanhamentoponto.getColumnModel().getColumn(7);
		comboBox = new JComboBox();
		
		comboBox.addItem("ARQUIVADO");
		comboBox.addItem("DEVOLVIDO");
		
		auditponto.setCellEditor(new DefaultCellEditor(comboBox));
		
	}

}
