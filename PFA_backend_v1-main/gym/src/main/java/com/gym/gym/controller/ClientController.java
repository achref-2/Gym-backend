package com.gym.gym.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.gym.model.client;
import com.gym.gym.service.*;


@RestController
@RequestMapping("/client")
@CrossOrigin

public class ClientController {
    @Autowired

    private Clientservice clientService;

    @PostMapping("/add")
    public String add(@RequestBody client c){
        clientService.saveClient(c);
        return "New student is added";
    }

    @GetMapping("/getAll")
    public List<client> list(){
        return clientService.getAllClients();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> getClientById(@PathVariable Integer id) {
        Optional<client> clientOptional = clientService.getClientById(id);
        if (clientOptional.isPresent()) {
            return ResponseEntity.ok(clientOptional.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Client not found with id: " + id);
        }
    }
}