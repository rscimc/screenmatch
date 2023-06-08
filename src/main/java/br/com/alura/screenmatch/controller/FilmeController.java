package br.com.alura.screenmatch.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.screenmatch.domain.film.DadosCadastroFilmes;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    List<Filme> listaDeFilmes = new ArrayList<>(); 
    
    @GetMapping
    public String carregaPaginaFormulario() {
        return "filmes/formulario";
    }

    @PostMapping
    public String cadastraFilme(DadosCadastroFilmes dados) {
        //System.out.println(dados);
        Filme filme = new Filme(dados);
        //System.out.println(filme);
        listaDeFilmes.add(filme);
        System.out.println(listaDeFilmes);
        return "filmes/formulario";
    }
}
