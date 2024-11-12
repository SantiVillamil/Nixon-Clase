package co.edu.reservash.infraestructura;
import co.edu.reservash.domain.Persona;
import co.edu.reservash.domain.PersonaService;
import co.edu.reservash.domain.TipoPersona;
import co.edu.reservash.domain.TipoPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
*
* @author Santiago Camacho
*/
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/personasrest"})
public class PersonaRest {
 @Autowired
 PersonaService service;

 @Autowired
 TipoPersonaService tpservice;

 @GetMapping("/persona")
 public List<Persona> listar(){
 return service.listar();
 }

 @PostMapping("/agregarpersona")
 public Persona agregar(@RequestBody Persona p){
 return service.add(p);
 }

 @GetMapping("/persona/{id}")
 public Persona listarId(@PathVariable("id") int id){
 return service.listarId(id);
 }

 @PutMapping("/persona/{id}")
 public Persona editar(@RequestBody Persona p, @PathVariable("id") int id){
 p.setId(id);
 return service.edit(p);
 }
 
 @DeleteMapping("/persona/{id}")
 public void Delete(@PathVariable("id") int id){
 service.delete(id);
 }

 @GetMapping("/tp_persona")
 public List<TipoPersona> listarTp(){
 return tpservice.listar();
 }
 
 @PostMapping("/agregar_tp_persona")
 public TipoPersona agregar(@RequestBody TipoPersona tp){
 return tpservice.add(tp);
 }

 @GetMapping("/tp_persona/{id}")
 public TipoPersona listarIdTP(@PathVariable("id") int id){
 return tpservice.listarId(id);
 }

 @PutMapping("/tp_persona/{id}")
 public TipoPersona editar(@RequestBody TipoPersona tp, @PathVariable("id") int id){
 tp.setId_tp(id);
 return tpservice.edit(tp);
 }
 
 @DeleteMapping("/tp_persona/{id}")
 public void Deletetp(@PathVariable("id") int id){
 tpservice.delete(id);
 }
}