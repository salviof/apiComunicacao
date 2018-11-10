/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package erp.comunicacao.transporte;

import erp.comunicacao.disparo.FabTipoTransporteComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;

/**
 *
 * @author desenvolvedor
 */
public interface ItfTipoTransporteComunicacao extends ItfBeanSimples {

    FabTipoTransporteComunicacao getTipoComunicacao();

}
