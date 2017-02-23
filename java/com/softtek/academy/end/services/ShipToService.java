package com.softtek.academy.end.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.softtek.academy.end.domain.ShipTo;
import com.softtek.academy.end.repository.ShipToRepository;

@Service
public class ShipToService {
	
    private ShipToRepository shipToRepository = new ShipToRepository();

    public List<ShipTo> list() {
        return this.shipToRepository.list();
    }
}
