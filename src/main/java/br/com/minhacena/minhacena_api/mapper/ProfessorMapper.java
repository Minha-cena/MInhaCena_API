package br.com.minhacena.minhacena_api.mapper;

import br.com.minhacena.minhacena_api.dto.CreateProfessorDTO;
import br.com.minhacena.minhacena_api.dto.ProfessorDTO;
import br.com.minhacena.minhacena_api.model.Professor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ProfessorMapper {
    private final ModelMapper modelMapper;

    public ProfessorMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public ProfessorDTO convertToDTO(CreateProfessorDTO dto){
        return this.modelMapper
                .typeMap(CreateProfessorDTO.class, ProfessorDTO.class)
                .map(dto);
    }

    public Professor convertToEntity(ProfessorDTO dto){
        return this.modelMapper
                .typeMap(ProfessorDTO.class, Professor.class)
                .map(dto);
    }

    public ProfessorDTO convertToDTO(Professor entity){
        return this.modelMapper
                .typeMap(Professor.class, ProfessorDTO.class)
                .map(entity);
    }
}
