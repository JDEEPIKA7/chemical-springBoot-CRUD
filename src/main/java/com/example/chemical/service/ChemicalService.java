package com.example.chemical.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.chemical.model.Chemical;
import com.example.chemical.repository.ChemicalRepository;

@Service
public class ChemicalService {
    @Autowired
    ChemicalRepository chemicalRepository;

   
    public List<Chemical> getAllChemicals() {
        List<Chemical> chemicals = new ArrayList<Chemical>();
        chemicalRepository.findAll().forEach(chemicals1 -> chemicals.add(chemicals1));
        return chemicals;
    }


    public Chemical getChemicalById(int position) {
        return chemicalRepository.findById(position).get();
    }


    public void saveOrUpdate(Chemical chemicals) {
        chemicalRepository.save(chemicals);
    }

    
    public void delete(int position) {
        chemicalRepository.deleteById(position);
    }


    public void update(Chemical chemicals, int position) {
        chemicalRepository.save(chemicals);
    }

}
