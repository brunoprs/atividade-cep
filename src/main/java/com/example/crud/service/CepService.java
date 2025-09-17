package com.example.crud.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CepService {
    private final RestTemplate restTemplate = new RestTemplate();

    public String getCidadeByCep(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        ViaCepResponse response = restTemplate.getForObject(url, ViaCepResponse.class);
        if (response != null && response.getLocalidade() != null) {
            return response.getLocalidade();
        }
        return null; // Vai retornar NULL se o CEP for nulo
    }

    static class ViaCepResponse {
        private String localidade; // Campo que contém a cidade

        public String getLocalidade() {
            return localidade;
        }

        public void setLocalidade(String localidade) {
            this.localidade = localidade;
        }
    }
}