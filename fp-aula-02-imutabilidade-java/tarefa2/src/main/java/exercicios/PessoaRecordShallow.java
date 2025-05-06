package exercicios;
/*
      Crie um record chamado PessoaRecordShallow com campos `String nome` e `Cidade cidade`.
      Veja que, apesar de ser um record e você não poder reatribuir valores para os campos,
      PessoaRecordShallow é superficialmente imutável (shallow imutability), pois Cidade é mutável.

  */
public record PessoaRecordShallow(String nome, Cidade cidade) {
}
