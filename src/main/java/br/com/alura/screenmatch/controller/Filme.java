package br.com.alura.screenmatch.controller;

import br.com.alura.screenmatch.domain.film.DadosCadastroFilmes;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="filmes")
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    private String nome;
    private Integer duracaoEmMinutos;
    private Integer anoLancamento;
    private String genero;
    
    public Filme(DadosCadastroFilmes dados) {
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.anoLancamento = dados.ano();
        this.genero = dados.genero();
    }

    public Filme() {}
    
    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public Integer getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public Integer getAnoLancamento() {
        return anoLancamento;
    }
    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Filme [nome=" + nome + ", duracaoEmMinutos=" + duracaoEmMinutos + ", anoLancamento=" + anoLancamento
                + ", genero=" + genero + "]";
    }

    

}
