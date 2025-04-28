/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.testes.erp;

import br.org.coletivojava.erp.comunicacao.transporte.ERPTipoCanalComunicacao;

import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;

import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class CriarAnoacoes {

    @Test
    public void criarAnotacoes() {
        //  SBCore.configurar(new ConfigCoreJunitPadraoDevLib(), SBCore.ESTADO_APP.DESENVOLVIMENTO);
        try {

            //       for (ERPTipoCanalComunicacao trassp : ERPTipoCanalComunicacao.values()) {
            //            GeradorAPIERP gerador = new GeradorAPIERP(trassp);
            //              gerador.salvarEmDiretorioPadraoSubstituindoAnterior();
            //         }
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro Criando anotações", t);
        }
    }

}
