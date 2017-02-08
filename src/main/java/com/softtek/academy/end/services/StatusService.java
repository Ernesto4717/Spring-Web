package com.softtek.academy.end.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.softtek.academy.end.domain.Status;
import com.softtek.academy.end.repository.StatusRepository;

@Service
public class StatusService {
    
	private StatusRepository statusRepository = new StatusRepository();


    public List<Status> getCartStatus() {
        return this.statusRepository.getStatus("CART");
    }
}
