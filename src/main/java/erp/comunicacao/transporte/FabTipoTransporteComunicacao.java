/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package erp.comunicacao.transporte;

import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import erp.comunicacao.transporte.ItfDisparoComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfDestinatario;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfTipoTransporteComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.TipoTransporteSBNativo;
import erp.ItfApiErpSuperBits;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoDaFabrica;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

/**
 *
 * @author desenvolvedor
 */
public enum FabTipoTransporteComunicacao implements ItfApiErpSuperBits<ItfDisparoComunicacao> {

    @InfoObjetoDaFabrica(nomeObjeto = "E-mail", classeObjeto = TipoTransporteSBNativo.class)
    EMAIL,
    @InfoObjetoDaFabrica(nomeObjeto = "SMS", classeObjeto = TipoTransporteSBNativo.class)
    SMS,
    @InfoObjetoDaFabrica(nomeObjeto = "Menu Intranet", classeObjeto = TipoTransporteSBNativo.class)
    INTRANET_MENU,
    @InfoObjetoDaFabrica(nomeObjeto = "Intranet Modal", classeObjeto = TipoTransporteSBNativo.class)
    INTRANET_MODAL,
    @InfoObjetoDaFabrica(nomeObjeto = "Api Personalizada", classeObjeto = TipoTransporteSBNativo.class)
    API_PERSONALIZADA,
    @InfoObjetoDaFabrica(nomeObjeto = "Whatzup", classeObjeto = TipoTransporteSBNativo.class)
    WHATZAUP,
    /**
     * O Modo automático se vira para encontrar o usuário, exemplo: se tiver uma
     * sessao do usuário conectada envia via modal, se não encontrar, tenta
     * watzap, se não encontrar, registra em notificações e envia um e-mail
     */
    @InfoObjetoDaFabrica(nomeObjeto = "Automático", classeObjeto = TipoTransporteSBNativo.class)
    AUTOMATICO;

    @Override
    public ItfTipoTransporteComunicacao getRegistro() {
        return (ItfTipoTransporteComunicacao) ItfApiErpSuperBits.super.getRegistro();

    }

    @Deprecated
    public void enviarMensagemEntreUsuarios(ItfUsuario pRemetente, ItfDestinatario pDestinatario, String mensagem) {
        SBCore.getCentralComunicacao().gerarComunicacaoEntre_Usuairos(FabTipoComunicacao.NOTIFICAR, pRemetente, pDestinatario, mensagem, this);

    }

    @Deprecated
    public void enviarMensagemDoSistemaParaDestinatario(ItfDestinatario pDestinatario, String mensagem) {
        SBCore.getCentralComunicacao().gerarComunicacaoEntre_Usuairos(FabTipoComunicacao.NOTIFICAR, new UsuarioSistemaRoot(), pDestinatario, mensagem, this);
    }

    @Override
    public Class getInterface() {
        return ItfDisparoComunicacao.class;

    }

}
