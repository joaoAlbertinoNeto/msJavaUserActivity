package br.com.ms.msjavauseractivity.application.port.in.rest;

import br.com.ms.msjavauseractivity.domain.rest.CustomerActivityRequest;

public interface CustomerActivityInputPortIn {
	public String createCustomerTicket(CustomerActivityRequest customerTicketResquest);

}
