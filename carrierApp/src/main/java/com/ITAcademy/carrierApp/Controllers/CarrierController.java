package com.ITAcademy.carrierApp.Controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ITAcademy.carrierApp.Models.Carrier;
import com.ITAcademy.carrierApp.Exceptions.NotFoundException;

import com.ITAcademy.carrierApp.Repositories.CarrierRepository;


@RestController
public class CarrierController{
	
	
	@Autowired
	public CarrierRepository carrierRepository;
	
	//http://localhost:8080/helloworld	
	@GetMapping("/carrier")
	public List<Carrier> getAll() {
		
		return carrierRepository.findAll();
	}
		
	
//	@GetMapping("/carrier/{carrierId}")
//	public Carrier GetById(@PathVariable(value="carrierId") String carrierId) 
//	{
//		//si lo encuentro devuelvo un carrier y sino un notFoundException
//		return carrierRepository.findById(carrierId)
//				.orElseThrow(() -> {
//					return new NotFoundException("No encontre el carrier id: "+carrierId);
//				});
//	}
	
	
	@GetMapping("/carrier/{carrierId}")
	public ResponseEntity<Carrier> GetById(@PathVariable(value="carrierId") UUID carrierId) 
	{
		//si lo encuentro devuelvo un carrier y sino un notFoundException
		return ResponseEntity.ok(carrierRepository.findById(carrierId.toString())
				.orElseThrow(() -> {
					return new NotFoundException("No encontre el carrier id: "+carrierId.toString());
				}));
	}
		
	
	@PostMapping("/carrier")
	@ResponseBody
	public Carrier Save(@RequestBody Carrier carrier) {
		
		return carrierRepository.save(carrier);
	}
		
	
	@PutMapping("/carrier")
	@ResponseBody
	public Carrier update(@RequestBody Carrier carrier) {
		return carrierRepository.save(carrier);
	}
	
	
	@DeleteMapping("/carrier")
	public ResponseEntity<Carrier> delete(@RequestBody Carrier carrier) {
		carrierRepository.delete(carrier);
		return ResponseEntity.ok(carrier);
	}
	
	
}
