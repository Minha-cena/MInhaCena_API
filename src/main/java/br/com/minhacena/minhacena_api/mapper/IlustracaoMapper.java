package br.com.minhacena.minhacena_api.mapper;

import br.com.minhacena.minhacena_api.dto.CreateIlustracaoDTO;
import br.com.minhacena.minhacena_api.dto.IlustracaoDTO;
import br.com.minhacena.minhacena_api.model.Ilustracao;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class IlustracaoMapper {

    private final ModelMapper modelMapper;

    public IlustracaoMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public IlustracaoDTO convertDTO(CreateIlustracaoDTO dto){
        return this.modelMapper
                .typeMap(CreateIlustracaoDTO.class, IlustracaoDTO.class)
                .map(dto);
    }

    public IlustracaoDTO convertToDTO(Ilustracao entity){
        return this.modelMapper
                .typeMap(Ilustracao.class, IlustracaoDTO.class)
                .addMapping(Ilustracao::getIlustradorId, IlustracaoDTO::setIlustrador)
                .addMapping(Ilustracao::getRedacaoId, IlustracaoDTO::setRedacao)
                .map(entity);
    }

    //public Ilustracao convertToEntity(IlustracaoDTO dto){}
}
