package br.com.ms.msjavauseractivity.framework.adapter.in.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.ms.msjavauseractivity.application.port.in.rest.CustomerActivityInputPortIn;
import br.com.ms.msjavauseractivity.application.service.HandleSendCustomerActivityUseCase;
import br.com.ms.msjavauseractivity.domain.rest.CustomerActivityRequest;


@RestController
public class CustomerActivityInputImpl implements CustomerActivityInputPortIn{

	@Autowired
	private HandleSendCustomerActivityUseCase handleSendCustomerTicketsUseCase;
	
	@PostMapping(path = "create")
	@Override
	public String createCustomerTicket(@RequestBody CustomerActivityRequest customerTicketResquest) {
		handleSendCustomerTicketsUseCase.sendCustomerTickets(customerTicketResquest);
		return null;
	}

	

}
