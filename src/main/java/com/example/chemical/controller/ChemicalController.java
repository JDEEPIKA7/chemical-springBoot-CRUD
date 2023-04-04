package com.example.chemical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chemical.model.Chemical;
import com.example.chemical.service.ChemicalService;

@RestController
@RequestMapping("/api")
public class ChemicalController {

    @Autowired
    ChemicalService chemicalService;

    
    @GetMapping("/")
    private List<Chemical> getAllChemical() {
        return chemicalService.getAllChemicals();
    }

    
    @GetMapping("/chemical/{position}")
    private Chemical getChemicals(@PathVariable("position") int position) {
        return chemicalService.getChemicalById(position);
    }


    @DeleteMapping("/chemicals/{position}")
    private void deleteChemical(@PathVariable("position") int bookid) {
        chemicalService.delete(bookid);
    }

    @PostMapping("/chemicals")
    private int saveChemical(@RequestBody Chemical chemicals) {
        chemicalService.saveOrUpdate(chemicals);
        return chemicals.getPosition();
    }

    @PutMapping("/Chemical")
    private Chemical update(@RequestBody Chemical chemicals) {
        chemicalService.saveOrUpdate(chemicals);
        return chemicals;
    }

}
