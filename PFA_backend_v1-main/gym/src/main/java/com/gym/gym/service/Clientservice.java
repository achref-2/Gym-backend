package com.gym.gym.service;

import java.util.List;
import java.util.Optional;

import com.gym.gym.model.client;

public interface Clientservice {
    public client saveClient(client c);
    Optional<client> getClientById(Integer id);
    public List<client> getAllClients();
}