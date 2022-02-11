package Uteis;

import java.net.InetAddress;
import java.net.UnknownHostException;

import View.TelaAdmissaoValidar;
import View.TelaFolhaValidar;
import View.TelaValidar;

public class IdentificadorAdmissao {

	public void identificadoradmissao() {

		String ip = "";
		String nomepc = "";
		
		try {
			ip = InetAddress.getLocalHost().getHostAddress();
			nomepc = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		TelaAdmissaoValidar.tfnomeadmissaovalidar.setText(nomepc);
		TelaAdmissaoValidar.tfcodigoadmissaovalidar.setText(ip);
		String ip2 = TelaAdmissaoValidar.tfcodigoadmissaovalidar.getText().replace(" ","").replace(".","").replace(",","");		
		TelaAdmissaoValidar.tfcodigoadmissaovalidar.setText(ip2);
	}

}
