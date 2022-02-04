package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste{
   public void validar(Funcionario funcionario, BigDecimal aumento) {
       LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
       LocalDate dataAtual = LocalDate.now();
       long mesesDoUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
       if (mesesDoUltimoReajuste < 6) {
           throw new ValidacaoException("Intervalo entre reajuste deve ser de 6 meses!");
       }
   }
}
