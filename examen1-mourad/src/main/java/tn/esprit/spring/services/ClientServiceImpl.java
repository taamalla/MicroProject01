package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.repository.ClientRepository;
@Service
@Slf4j
public class ClientServiceImpl implements IClientService {

	@Autowired
	ClientRepository clientRepository;

	@Override
	public List<Client> retrieveAllClients() {
		List<Client> listClient= null; 
		try {
			log.info("In Method retrieveAllClients() : ");
			listClient= clientRepository.findAll();
			for(Client c:listClient)
			{
				log.debug("Client:" + c.getNom()+ c.getPrenom());
			}
			log.info("Out of Method retrieveAllClients() without errors ");
		}
		catch (Exception e) {
			log.error("Error in Method retrieveAllClients() : " + e);		
		}
		return listClient;
	}

	@Override
	public Client addClient(Client c) {
		
		clientRepository.save(c);
		return c;
	}

	@Override
	public void deleteClient(Long id) {
		clientRepository.deleteById(id);

	}

	@Override
	public Client updateClient(Client c) {
		clientRepository.save(c);
		return c;
	}

	@Override
	public Client retrieveClient(Long id) {
		Client c= clientRepository.findById(id).get();
		return c;
	}

}
