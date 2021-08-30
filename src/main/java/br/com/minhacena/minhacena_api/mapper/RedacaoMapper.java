package br.com.minhacena.minhacena_api.mapper;

import br.com.minhacena.minhacena_api.dto.CreateProfessorDTO;
import br.com.minhacena.minhacena_api.dto.CreateRedacaoDTO;
import br.com.minhacena.minhacena_api.dto.RedacaoDTO;
import br.com.minhacena.minhacena_api.model.Redacao;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RedacaoMapper {

    private final ModelMapper modelMapper;

    public RedacaoMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public RedacaoDTO convertToDTO(CreateRedacaoDTO dto){
        return this.modelMapper
                .typeMap(CreateRedacaoDTO.class, RedacaoDTO.class)
                .map(dto);
    }

    public RedacaoDTO convertDTO(Redacao entity){
        return this.modelMapper
                .typeMap(Redacao.class, RedacaoDTO.class)
                .addMapping(Redacao::getProfessorId, RedacaoDTO::setCodigoProfessor)
                .map(entity);
    }

    //public Redacao convertToEntity(RedacaoDTO dto){}
}
