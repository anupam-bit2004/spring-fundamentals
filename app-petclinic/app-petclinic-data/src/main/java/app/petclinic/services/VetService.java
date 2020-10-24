package app.petclinic.services;

import java.util.Set;

import app.petclinic.model.Vet;

public interface VetService {
	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}