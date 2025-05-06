package exercicios;

/*
       Crie um record chamado PessoaRecord com campos `String nome` e `CidadeRecord cidade`.
      Veja que, agora todos os campos de PessoaRecord são imutáveis (incluindo cidade que é finalmente um record),
      isto torna PessoaRecord profundamente (totalmente) imutável (deep imutability).
*/

public record PessoaRecord(String nome, CidadeRecord cidade) {
}