package br.com.ms.msjavauseractivity.application.service;

import br.com.ms.msjavauseractivity.domain.rest.CustomerActivityRequest;

public interface HandleSendCustomerActivityUseCase {
	
	public void sendCustomerTickets(CustomerActivityRequest customerTicketResquest);

}
