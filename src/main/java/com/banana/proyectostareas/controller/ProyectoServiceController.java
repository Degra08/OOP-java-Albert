package com.banana.proyectostareas.controller;

import com.banana.proyectostareas.model.Proyecto;
import com.banana.proyectostareas.persistence.ProyectoJPARepository;
import com.banana.proyectostareas.model.StatusMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/proyectos")
@Validated
public class ProyectoServiceController {

    private static final Logger logger = LoggerFactory.getLogger(ProyectoServiceController.class);

    @Autowired
    private ProyectoJPARepository repo;

    @PostMapping(value = "", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Proyecto> save(@RequestBody @Valid Proyecto newProyecto) {
        newProyecto.setId(null);
        repo.save(newProyecto);
        if (newProyecto != null && newProyecto.getId() > 0) return new ResponseEntity<>(newProyecto, HttpStatus.CREATED);
        else
            return new ResponseEntity<>(new StatusMessage(HttpStatus.BAD_REQUEST.value(), "No encontrado"), HttpStatus.BAD_REQUEST);

    }
}
