package alejandroolea.netlifly.app.ferregym.backend.models.services;

import java.util.List;

import alejandroolea.netlifly.app.ferregym.backend.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
}
