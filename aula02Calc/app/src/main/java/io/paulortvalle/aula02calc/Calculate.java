package io.paulortvalle.aula02calc;

/**
 * Created by Paulo Valle on 15/2/2017.
 * Classe que recebe dois parametros e
 * retorna o resultado do calculo solicitado.
 */

public class Calculate {

    // Método que soma os dois valores fornecidos
    public String soma(String valor1, String valor2){

        Long lValor1 = this.converte(valor1);
        Long lValor2 = this.converte(valor2);
        Long lResult = lValor1 + lValor2;
        return lValor1.toString() + " + " + lValor2.toString() + " = " + lResult.toString();

    }

    // Método que subtrai os dois valores fornecidos
    public String subtrai(String valor1, String valor2){

        Long lValor1 = this.converte(valor1);
        Long lValor2 = this.converte(valor2);
        Long lResult = lValor1 - lValor2;
        return lValor1.toString() + " - " + lValor2.toString() + " = " + lResult.toString();

    }

    // Método que multiplica os dois valores fornecidos
    public String multiplica(String valor1, String valor2){

        Long lValor1 = this.converte(valor1);
        Long lValor2 = this.converte(valor2);
        Long lResult = lValor1 * lValor2;
        return lValor1.toString() + " * " + lValor2.toString() + " = " + lResult.toString();

    }

    // Método que divide os dois valores fornecidos
    public String divide(String valor1, String valor2){

        Long lValor1 = this.converte(valor1);
        Long lValor2 = this.converte(valor2);

        if (lValor2 == 0){
            return "Não é possível realizar a divizão por Zero";
        } else {
            Long lResult = lValor1 / lValor2;
            return lValor1.toString() + " / " + lValor2.toString() + " = " + lResult.toString();
        }
    }

    // Método que converte o valor de String para Long
    private Long converte(String valor){

        Long convertida;

        try{
            convertida = Long.parseLong(valor);
        }catch(Exception e){
            convertida = Long.valueOf(0);
        }

        return convertida;

    }
}