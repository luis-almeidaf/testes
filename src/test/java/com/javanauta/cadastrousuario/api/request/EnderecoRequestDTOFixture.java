package com.javanauta.cadastrousuario.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EnderecoRequestDTOFixture {

    public static EnderecoRequestDTO build(String rua,

                                           Long numero,

                                           String bairro,

                                           String complemento,

                                           String cidade,

                                           String cep) {
        return new EnderecoRequestDTO(rua, numero, bairro, complemento, cidade, cep);
    }
}
