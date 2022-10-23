package com.example.ThiGK.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ThiGK.entity.TranThaiThanhEntity;
import com.example.ThiGK.service.TranThaiThanhEntityService;

@RequestMapping("/server")
@RestController
public class TranThaiThanhController {
	@Autowired
	TranThaiThanhEntityService service;

	@PostMapping
	boolean addPost(@RequestBody TranThaiThanhEntity entity) {

		return service.addOne(entity);

	}
	@GetMapping("/{id}")
	TranThaiThanhEntity getEntity(@PathVariable String id ) {
		
		return service.getOne(id);
	}
}
