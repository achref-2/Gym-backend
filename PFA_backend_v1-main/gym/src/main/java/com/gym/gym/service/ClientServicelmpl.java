package com.gym.gym.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.gym.model.client;
import com.gym.gym.repository.ClientRepository;


@Service
public class ClientServicelmpl implements Clientservice {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public client saveClient(client c) {
        return clientRepository.save(c);
    }
    
    @Override
    public Optional<client> getClientById(Integer id) {
        return clientRepository.findById(id);
    }

    @Override
    public List<client>getAllClients() {
        return clientRepository.findAll();
    }
} 
