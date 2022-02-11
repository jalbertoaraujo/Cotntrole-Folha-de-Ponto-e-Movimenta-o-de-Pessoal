package Uteis;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import View.QuadroMp;



public class ColorirTabelaDemissaoQuadro extends DefaultTableCellRenderer {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * @Override public Component getTableCellRendererComponent(JTable table,
	 * Object value, boolean isSelected, boolean hasFocus, int row, int column)
	 * { JLabel label = (JLabel) super.getTableCellRendererComponent(table,
	 * value, isSelected, hasFocus, row, column); Color c = Color.WHITE; Object
	 * text = table.getValueAt(row, 3); if (text != null &&
	 * "VERMELHO".equals(text.toString())) c = Color.RED;
	 * label.setBackground(c); return label; }
	 */

	@Override
	public Component getTableCellRendererComponent(JTable tabelademissaoquadro, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		Component renderer = (JLabel) super.getTableCellRendererComponent(tabelademissaoquadro, value, isSelected, hasFocus, row,
				column);

		Color fundo = null;
		Color fonte = null;

		Object text = tabelademissaoquadro.getValueAt(row, 16);
		Object text2 = tabelademissaoquadro.getValueAt(row, 17);		
		
		if (text2 != null && text2.equals("CANCELADA")){
			
			fundo = Color.GRAY;
			fonte = Color.WHITE;	
			
		} else if (text != null && text.equals("MP PROCESSADA")){
			
			fundo = Color.GREEN;
			fonte = Color.BLUE;
			
		} else if (text != null && text.equals("RETORNO OP")){
			
			fundo = Color.RED;
			fonte = Color.WHITE;			
					
		}else {
			
			fundo = Color.YELLOW;
			fonte = Color.BLACK;

		}if (isSelected){
			
			fundo = Color.WHITE;
			fonte = Color.BLUE;
		}

		renderer.setBackground(fundo);
		renderer.setForeground(fonte);

		return renderer;
	}

}
