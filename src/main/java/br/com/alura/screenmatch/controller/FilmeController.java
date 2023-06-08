package br.com.alura.screenmatch.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.screenmatch.domain.film.DadosCadastroFilmes;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    private List<Filme> listaDeFilmes = new ArrayList<>(); 
    
    @GetMapping
    public String carregaPaginaListagem(Model model) {
        model.addAttribute("lista", listaDeFilmes);
        return "filmes/lista";
    }

    @GetMapping("/formulario")
    public String carregaPaginaFormulario() {
        return "filmes/formulario";
    }

    @PostMapping
    public String cadastraFilme(DadosCadastroFilmes dados, Model model) {
        
        Filme filme = new Filme(dados);
        listaDeFilmes.add(filme);

        return "redirect:/filmes";
    }
}
