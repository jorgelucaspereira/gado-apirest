package com.gado.apirest.controller;

import com.gado.apirest.model.AnimalTipo;
import com.gado.apirest.repository.AnimalTipoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/gado")
@Api(value = "API REST Gados")
@CrossOrigin(origins = "*")
public class AnimalTipoController {

    @Autowired
    AnimalTipoRepository animalTipoRepository;

    @GetMapping("/animais-tipo")
    @ApiOperation(value = "Retorna uma lista de 'AnimaisTipo'")
    public List<AnimalTipo> listaAnimaisTipo() {
        return animalTipoRepository.findAll();
    }

    @GetMapping("/animal-tipo/{id}")
    @ApiOperation(value = "Retorna um único 'AnimalTipo', passando um id como parâmetro")
    public AnimalTipo listaAnimalTipoUnico(@PathVariable(value = "id") long id) {
        return animalTipoRepository.findById(id);
    }

    @PostMapping("/animal-tipo")
    @ApiOperation(value = "Salva um 'AnimalTipo'")
    public AnimalTipo salvaAnimalTipo(@RequestBody AnimalTipo animalTipo) {
        return animalTipoRepository.save(animalTipo);
    }

    @DeleteMapping("/animal-tipo")
    @ApiOperation(value = "Deleta um 'AnimalTipo'")
    public void deletaAnimalTipo(@RequestBody AnimalTipo animalTipo) {
        animalTipoRepository.delete(animalTipo);
    }

    @PutMapping("/animal-tipo")
    @ApiOperation(value = "Atualiza um 'AnimalTipo'")
    public AnimalTipo atualizaAnimalTipo(@RequestBody AnimalTipo animalTipo) {
        return animalTipoRepository.save(animalTipo);
    }
}
