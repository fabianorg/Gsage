package gsage.com.br.repository;

import gsage.com.br.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, String> {

    Cliente findById(long id);
}
