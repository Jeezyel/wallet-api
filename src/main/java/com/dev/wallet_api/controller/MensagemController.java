package com.dev.wallet_api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensagemController {

    @CrossOrigin(origins = "*")
    @GetMapping("/api/msg")
    public String retornarMensagem() {
        return "mensagem da API java 2026";
    }
}