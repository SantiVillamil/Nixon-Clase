package co.edu.reservash.domain;
import java.util.List;
import org.springframework.data.repository.Repository;
/**
*
* @author Santiago Camacho
*/
public interface PersonaRepository extends Repository<Persona, Integer>{
 List<Persona> findAll();
 Persona findById(int id);
 Persona save(Persona p);
 void deleteById(int id);
}