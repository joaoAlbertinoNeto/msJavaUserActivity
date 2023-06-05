package br.com.ms.msjavauseractivity.framework.kafka.out;

import java.util.Random;
import java.util.UUID;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import br.com.ms.msjavauseractivity.application.port.out.CustomerAcitivityPortOut;
import br.com.ms.msjavauseractivity.domain.kafka.CustomerAcitivityEvent;

@Component
public class CustomerActivityKafkaOutImpl implements CustomerAcitivityPortOut {
	
	@Value("topic.name")
	private String topicName;

	@Autowired
	private KafkaTemplate<String,String> template; 
	
	
	@Override
	public void sendTicket(CustomerAcitivityEvent customerTicketEvent) throws Exception {
		 System.out.println("BEGIN SEND EVENT ==========================================>");
		 System.out.println(customerTicketEvent.toString());
		 template.send(createRecord(customerTicketEvent));
		 System.out.println("<=========================================== END SEND EVENT");
	}
	
	
	private ProducerRecord<String, String> createRecord(CustomerAcitivityEvent customerTicketEvent){
		return new ProducerRecord<String, String>(topicName, customerTicketEvent.toString());
	}

}
