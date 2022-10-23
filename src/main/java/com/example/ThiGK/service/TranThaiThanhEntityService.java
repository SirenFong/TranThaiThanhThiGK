package com.example.ThiGK.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ThiGK.entity.TranThaiThanhEntity;
import com.example.ThiGK.repository.TranThaiThanhRepository;

@Service
public class TranThaiThanhEntityService {
	@Autowired
	TranThaiThanhRepository repository;

	public boolean addOne(TranThaiThanhEntity entity) {
		boolean rs = false;
		if (entity != null) {
			try {
				repository.save(entity);
				rs = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rs;

	}
	public TranThaiThanhEntity getOne(String id) {
		TranThaiThanhEntity rs = null;
		if(id!=null) {
			try {
				rs=repository.findById(id).orElse(null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rs;
		
	}

}
