import base.CajeroAutomatico;
import derivada.CajeroAutomaticoBanelco;
import derivada.CajeroAutomaticoLink;
import derivada.Cliente;

public class Principal {

	public static void main(String[] args) {

		

		//CajeroAutomaticoLink cajeroLink = new CajeroAutomaticoLink(19000);
		CajeroAutomaticoLink cajeroLink = new CajeroAutomaticoLink(19000);
		CajeroAutomaticoBanelco cajeroBanelco = new CajeroAutomaticoBanelco(7500);
		
		Cliente guadalupe = new Cliente ("Guadalupe", 1050,"LINK");
		Cliente leandro = new Cliente ("Leandro",1100,"BANELCO");
		Cliente santino = new Cliente ("Santino",700,"BANELCO");
		
		
		System.out.println(cajeroLink.extraerDinero(guadalupe, 500));
		System.out.println(guadalupe.getSaldo());
		
		System.out.println(cajeroLink.extraerDinero(santino, 10000));
		System.out.println(santino.getSaldo());
		
		System.out.println(cajeroBanelco.extraerDinero(guadalupe, 650));
		System.out.println(guadalupe.getSaldo());
		System.out.println(guadalupe.getNombre());
		
		System.out.println(cajeroBanelco.extraerDinero(santino, 110));
		System.out.println(santino.getSaldo());
		
		System.out.println(cajeroBanelco.transferir(guadalupe, leandro, 210));
		System.out.println(cajeroLink.transferir(santino, leandro, 520));
		System.out.println(santino.getSaldo());
		System.out.println(leandro.getSaldo());

		
		
		
		

		

		


}
	}
