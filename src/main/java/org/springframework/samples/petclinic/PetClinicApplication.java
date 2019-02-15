/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.model.Specialty;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.repository.OwnerRepository;
import org.springframework.samples.petclinic.repository.SpecialityRepository;
import org.springframework.samples.petclinic.repository.VetRepository;

/**
 * PetClinic Spring Boot Application.
 * 
 * @author Dave Syer
 *
 */
@SpringBootApplication
public class PetClinicApplication {
	
	private static final Logger log = LoggerFactory.getLogger(PetClinicApplication.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(PetClinicApplication.class, args);
    }
    
    @Bean
	public CommandLineRunner demoVetRepository(VetRepository vetRepository, SpecialityRepository specialityRepository, OwnerRepository ownerRepository) {
		return (args) -> {
			log.info("*****************************************************");
			log.info("BOOTCAMP - Spring y Spring Data - vetRepository");
			log.info("*****************************************************");
			
			//TODO Añade aquí tu código
//			//Crear un objeto Vet Sin Speciality
//			//Persiste el objeto Vet en BBDD
//			//
//			Vet v = new Vet();
//			v.setFirstName("paco");
//			v.setLastName("polo");
//			v.addSpecialty(null);
//			vetRepository.saveAndFlush(v);
//			
//			//
//			//Consultar por ID y comprobar que se ha creado correctamente
//			Specialty s = specialityRepository.findOne(1);
//			
//			//
//			//Editar el elemento recien creado para añadir Speciality concreta
//			
//			//
//			log.info("Listar todos los veterinarios");
//			for(Vet v: vetRepository.findAll()) {
//				log.info("Veterinario: "+ v);
//			}
			
			
//			System.out.println("Obtener una lista de Vets filtrando por lastName");
//			for(Vet v: vetRepository.findByLastName("polo")) {
//				log.info("Veterinario: "+ v);
//			}
//			System.out.println("");
//			System.out.println("Obtener una lista de Vets buscando en firtsName y lastName");
//			for(Vet v: vetRepository.findByFirstNameAndLastName("Sharon", "Jenkins")) {
//				log.info("Veterinario: "+ v);
//			}
//			System.out.println("");
//			System.out.println("Obtener una lista de Vets buscando en firtsName o lastName");
//			for(Vet v: vetRepository.findByFirstNameOrLastName("ppdsadas", "polo")) {
//				log.info("Veterinario: "+ v);
//			}
			
			
//			System.out.println("");
//			System.out.println("Obtener una lista de Vet buscando por la especialidad radiology");
//			for(Vet v: vetRepository.findVetsByNameSpecialty("radiology")) {
//				log.info("Veterinario: "+ v);
//			}
//			
//			System.out.println("");
//			System.out.println("Obtener una lista de Vet buscando por la especialidad surgery");
//			for(Vet v: vetRepository.findVetsByNameSpecialty("surgery")) {
//				log.info("Veterinario: "+ v);
//			}
//			
//			System.out.println("");
//			System.out.println("Obtener una lista de Vet buscando por la especialidad dentistry");
//			for(Vet v: vetRepository.findVetsByNameSpecialty("dentistry")) {
//				log.info("Veterinario: "+ v);
//			}
			
			
			System.out.println("");
			System.out.println("Buscar los Owner por su nombre y apellido por parte o total");
			for(Owner o: ownerRepository.findOwnersByFirstNameOrLastName("da")) {
				System.out.println(o.getFirstName()+'	'+o.getLastName());
				
			}
		};
	}
    
}
