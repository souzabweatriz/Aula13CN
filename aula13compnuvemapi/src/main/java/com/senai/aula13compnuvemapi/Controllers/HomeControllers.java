package com.senai.aula13compnuvemapi.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController 
public class HomeControllers {
    @GetMapping("/") // Rota raiz
    public String home(){
         return "<h2>Aula 13 - API de Produtos</h2>"
             + "<p>Computação em Nuvem - SENAI 2026</p>"
             + "<p>Desenvolvido por: professor Daniel Vieira</p>"
             + "<p>API desenvolvida com Java e Spring Boot</p>"
             + "<p>Para acessar a lista de produtos, acesse a rota: /produtos</p>"
                + "<p>Para acessar um produto específico, acesse a rota: /produtos/{id}</p>"
                + "<p>Exemplo: /produtos/1</p>"
                +"<p>Curso Tecnólogo em Análise e Desenvolvimento de Sistemas</p>"
                + "<p>UniSenai - 2026</p>";
        
    }   
 

    
}
