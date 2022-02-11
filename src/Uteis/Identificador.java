package Uteis;

import java.net.InetAddress;
import java.net.UnknownHostException;

import View.TelaValidar;

public class Identificador {

	public void identificador() {

		String ip = "";
		String nomepc = "";
		
		try {
			ip = InetAddress.getLocalHost().getHostAddress();
			nomepc = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		TelaValidar.tfnomevalidar.setText(nomepc);
		TelaValidar.tfcodigovalidar.setText(ip);
		String ip2 = TelaValidar.tfcodigovalidar.getText().replace(" ","").replace(".","").replace(",","");		
		TelaValidar.tfcodigovalidar.setText(ip2);
	}

}
