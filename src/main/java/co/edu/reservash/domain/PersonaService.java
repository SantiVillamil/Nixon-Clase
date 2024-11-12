package co.edu.reservash.domain;
import java.util.List;
/**
*
* @author Santiago Camacho
*/
public interface PersonaService {
 List<Persona> listar();
 Persona listarId(int id);
 Persona add(Persona p);
 Persona edit(Persona p);
 void delete(int id);
}