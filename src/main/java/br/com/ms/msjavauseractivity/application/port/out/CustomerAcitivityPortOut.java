package br.com.ms.msjavauseractivity.application.port.out;

import br.com.ms.msjavauseractivity.domain.kafka.CustomerAcitivityEvent;

public interface CustomerAcitivityPortOut {
	public void sendTicket(CustomerAcitivityEvent customerTicketEvent) throws Exception;
}
