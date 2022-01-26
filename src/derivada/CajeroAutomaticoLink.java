package derivada;

import base.CajeroAutomatico;

public class CajeroAutomaticoLink extends CajeroAutomatico {

	private double saldo;

	public CajeroAutomaticoLink(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String extraerDinero(Cliente cliente, double montoAExtraer) {

		if (saldo >= montoAExtraer) {

			if (cliente.getRed().equalsIgnoreCase("BANELCO")) {
				cliente.setSaldo(cliente.getSaldo() + montoAExtraer * 0.88);
			} else {
				cliente.setSaldo(cliente.getSaldo() + montoAExtraer * 0.98);
			}
			saldo = saldo - montoAExtraer;

			return "la operacion se ha realizado con exito";

		} else {
			return "el cajero no tiene saldo disponible";
		}

	}

	@Override
	public String transferir(Cliente clienteOrigen, Cliente clienteDestino, double montoATransferir) {
		if (clienteOrigen.getRed().equalsIgnoreCase("LINK") && clienteDestino.getRed().equalsIgnoreCase("LINK")) {
			if (clienteOrigen.getSaldo() >= montoATransferir) {
				clienteDestino.setSaldo(clienteDestino.getSaldo() + montoATransferir);

				return "La transferencia se ha realizado con éxito";
			} else {
				return "El cliente de origen no tiene saldo suficiente para realizar la transferencia";
			}
		} else {
			return "La red del cliente origen y/o cliente destino no son LINK";
		}

	
	}

}
