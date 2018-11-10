/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package erp.comunicacao.transporte;

/**
 *
 * @author desenvolvedor
 */
public interface ItfDisparoComunicacao {

    public void dispararInicioComunicacao(Itf pComunicacao);

    public void dispararRespostaComunicacao(ItfDisparoComunicacao pComunicacao);

}
