package Uteis;

import java.net.InetAddress;
import java.net.UnknownHostException;

import View.TelaFolhaValidar;
import View.TelaValidar;

public class IdentificadorFolha {

	public void identificadorfolha() {

		String ip = "";
		String nomepc = "";
		
		try {
			ip = InetAddress.getLocalHost().getHostAddress();
			nomepc = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		TelaFolhaValidar.tfnomefolhavalidar.setText(nomepc);
		TelaFolhaValidar.tfcodigofolhavalidar.setText(ip);
		String ip2 = TelaFolhaValidar.tfcodigofolhavalidar.getText().replace(" ","").replace(".","").replace(",","");		
		TelaFolhaValidar.tfcodigofolhavalidar.setText(ip2);
	}

}
