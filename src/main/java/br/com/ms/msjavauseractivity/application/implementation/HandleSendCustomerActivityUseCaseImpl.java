package br.com.ms.msjavauseractivity.application.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.ms.msjavauseractivity.application.port.out.CustomerAcitivityPortOut;
import br.com.ms.msjavauseractivity.application.service.HandleSendCustomerActivityUseCase;
import br.com.ms.msjavauseractivity.domain.kafka.CustomerAcitivityEvent;
import br.com.ms.msjavauseractivity.domain.rest.CustomerActivityRequest;

@Component
public class HandleSendCustomerActivityUseCaseImpl implements HandleSendCustomerActivityUseCase {

	@Autowired
	private CustomerAcitivityPortOut customerTicketPortOut;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public void sendCustomerTickets(CustomerActivityRequest customerTicketResquest) {
		System.out.println("BEGIN HANDLE =========================================>");
		System.out.println("RECEIVED OBJECT:"+customerTicketResquest.toString());
		
		System.out.println("MAPPING TO EVENT OBJ....");
		CustomerAcitivityEvent event = mapper.map(customerTicketResquest, CustomerAcitivityEvent.class);
		try {
			customerTicketPortOut.sendTicket(event);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("<========================================= END HANDLE");
		
	}

}
