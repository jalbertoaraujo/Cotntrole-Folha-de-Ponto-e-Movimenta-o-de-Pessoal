package Uteis;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JOptionPane;

import Controle.Acompanhamento;



public class ExportarCSV {
	
	public boolean exportarCsv(String caminhoCompleto,
			List<Acompanhamento> lista, String data) throws HeadlessException, IOException {

		File file = new File(caminhoCompleto.toString() + "_"+data+".csv");

		OutputStreamWriter bufferOut = null;

		boolean sucesso = false;

		try {

			bufferOut = new OutputStreamWriter(new FileOutputStream(file),
					StandardCharsets.ISO_8859_1);

			int contador = 1;

			bufferOut.write("iD" + ";" + "MATRÍCULA" + ";" + "CONTRATO" + ";" + "NOME COLABORADOR"
					+ ";" + "FUNÇÃO" + ";" + "OBSERVAÇÃO" + ";"
					+ "TIPO DE PONTO" + ";" + "SITUAÇÃO" + ";" + "PERÍODO" + "\n");

			NumberFormat tresDigitos = new DecimalFormat("000");

			try {

				DateFormat formatBR = new SimpleDateFormat("dd/MM/YYYY");
				String dataBr = "";

				for (Acompanhamento ls : lista) {

					//dataBr = formatBR.format(ls//);

					String linha = tresDigitos.format(contador)
							+ ";" + ls.getMatricula() + ";" + ls.getContrato()
							+ ";" + ls.getNome() + ";" + ls.getFuncao()
							+ ";" + ls.getObs() + ";" + ls.getTipodeponto()
							+ ";" + ls.getSituacao() + ";" + ls.getPeriodo().toUpperCase();

					bufferOut.write(linha + "\n");

					contador++;

				}

				sucesso = true;
				bufferOut.close();

			} catch (Exception e) {

				bufferOut.close();
				file.delete();
				return sucesso;

			}

			bufferOut.close();
			return sucesso;

		} catch (Exception f) {

			JOptionPane.showMessageDialog(null,
					"O arquivo está já está aberto!", "Exportar Lançamento",
					JOptionPane.ERROR_MESSAGE);

		}

		return sucesso;

	}

}
