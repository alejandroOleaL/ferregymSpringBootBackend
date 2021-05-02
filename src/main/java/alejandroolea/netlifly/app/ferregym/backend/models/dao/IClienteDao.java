package alejandroolea.netlifly.app.ferregym.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import alejandroolea.netlifly.app.ferregym.backend.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

	
}
