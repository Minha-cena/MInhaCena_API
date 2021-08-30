package br.com.minhacena.minhacena_api.mapper;

import br.com.minhacena.minhacena_api.dto.CreateIlustradorDTO;
import br.com.minhacena.minhacena_api.dto.IlustradorDTO;
import br.com.minhacena.minhacena_api.model.Ilustrador;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class IlustradorMapper {

    private final ModelMapper modelMapper;

    public IlustradorMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public IlustradorDTO convertToDTO(CreateIlustradorDTO dto){
        return this.modelMapper
                .typeMap(CreateIlustradorDTO.class, IlustradorDTO.class)
                .map(dto);
    }

    public IlustradorDTO convertToDTO(Ilustrador dto){
        return this.modelMapper
                .typeMap(Ilustrador.class, IlustradorDTO.class)
                .map(dto);
    }

    public Ilustrador convertToEntity(IlustradorDTO dto){
        return this.modelMapper
                .typeMap(IlustradorDTO.class, Ilustrador.class)
                .map(dto);
    }
}
