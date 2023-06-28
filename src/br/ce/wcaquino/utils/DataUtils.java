package br.ce.wcaquino.utils;

import java.util.Calendar;
import java.util.Date;

public class DataUtils {

    /**
     * Retorna a data enviada por parâmetro com a adição dos dias desejado
     * a Data pode estar no futuro (dias > 0) ou no passado (dias < 0)
     *
     * @param data
     * @param dias
     * @return
     */

    public static Date adicionarDias(Date data, int dias) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(Calendar.DAY_OF_MONTH, dias);
        return calendar.getTime();
    }

    /**
     * Retorna data atual com a diferença de dias enviados por parâmetro
     *      a Data pode estar no futuro (parâmetro positivo) ou no passado (parâmetro negativo)
     *
     * @param dias Quantidade de dias a ser incrementado/decrementado
     * @return Data atualizada
     */
    public static Date obterDataComDiferencaDias(int dias) {
        return adicionarDias(new Date(), dias);
    }

    /**
     * Retorna uma instância de <code>Date</code> refletindo os valores passados por parâmetro
     *
     * @param dia
     * @param mes
     * @param ano
     * @return
     */
    public static Date obterData(int dia, int mes, int ano) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, dia);
        calendar.set(Calendar.MONTH, mes -1);
        calendar.set(Calendar.YEAR, ano);
        return calendar.getTime();
    }

    /**
     * Verifica se uma data é igual a outra
     *  Esta comparação considera apenas dia, mes e ano
     *
     * @param data1
     * @param data2
     * @return
     */




}
