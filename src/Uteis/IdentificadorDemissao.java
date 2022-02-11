package Uteis;

import java.net.InetAddress;
import java.net.UnknownHostException;

import View.TelaDemissaoValidar;
import View.TelaFolhaValidar;
import View.TelaValidar;

public class IdentificadorDemissao {

	public void identificadordemissao() {

		String ip = "";
		String nomepc = "";
		
		try {
			ip = InetAddress.getLocalHost().getHostAddress();
			nomepc = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		TelaDemissaoValidar.tfnomedemissaovalidar.setText(nomepc);
		TelaDemissaoValidar.tfcodigodemissaovalidar.setText(ip);
		String ip2 = TelaDemissaoValidar.tfcodigodemissaovalidar.getText().replace(" ","").replace(".","").replace(",","");		
		TelaDemissaoValidar.tfcodigodemissaovalidar.setText(ip2);
	}

}
