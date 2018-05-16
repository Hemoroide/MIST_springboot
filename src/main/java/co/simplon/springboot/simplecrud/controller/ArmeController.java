package co.simplon.springboot.simplecrud.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.springboot.simplecrud.model.Arme;
import co.simplon.springboot.simplecrud.repository.ArmeRepository;
import co.simplon.springboot.simplecrud.service.ArmeService;


@RestController
@RequestMapping("/api")

public class ArmeController {
	
	@Autowired
	private ArmeRepository armeRepo;
	
	@Autowired
	ArmeService ArmeService;
	
	
	@CrossOrigin
	@GetMapping("/arme")
	List<Arme> getAllArmes(){
		return armeRepo.findAll();
	}
	
	
	@CrossOrigin
	@GetMapping("/arme/{id}")
	ResponseEntity<Arme> getArmeById(@PathVariable(value="id") long id) {
	    Arme arme = armeRepo.findOne(id);
	    if(arme == null) {
	        return ResponseEntity.notFound().build();
	    }
	    return ResponseEntity.ok().body(arme);
	}
	
	@CrossOrigin
	@PostMapping("/arme")
	public Arme addArme(@Valid @RequestBody Arme arme){
		return armeRepo.save(arme);
	}
	
	@CrossOrigin
	@PutMapping("/arme/{id}")
	ResponseEntity<Arme> updateArme(@PathVariable(value="id") long id, @Valid @RequestBody Arme arme) throws Exception{
		Arme ArmeToUpdate = this.ArmeService.getArme(id);
		if(ArmeToUpdate == null)
			return ResponseEntity.notFound().build();
		
		// Update the mandatory attributes
		ArmeToUpdate.setTypeArme(arme.getTypeArme());
		ArmeToUpdate.setTypeMunition(arme.getTypeMunition());
		ArmeToUpdate.setNomArme(arme.getNomArme());
		ArmeToUpdate.setNumeroSerieArme(arme.getNumeroSerieArme());

		Arme updatedArme = this.ArmeService.updateArme(ArmeToUpdate);
		return ResponseEntity.ok(updatedArme);
	}
	
	@CrossOrigin
	@DeleteMapping("/arme/{id}")
	ResponseEntity<Arme> deleteArme(@PathVariable(value="id") long id){
		Arme arme = armeRepo.findOne(id);
		if(arme == null)
			return ResponseEntity.notFound().build();
		
		armeRepo.delete(arme);
		return ResponseEntity.ok().build();
	}
	

}
