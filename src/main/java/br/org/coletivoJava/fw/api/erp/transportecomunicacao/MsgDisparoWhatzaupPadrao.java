package br.org.coletivoJava.fw.api.erp.transportecomunicacao;

import javax.inject.Qualifier;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfDisparoComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.erp.InfoReferenciaApiErp;
import br.org.coletivojava.erp.comunicacao.transporte.ERPTransporteComunicacao;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Qualifier
@InfoReferenciaApiErp(tipoObjeto = ERPTransporteComunicacao.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MsgDisparoWhatzaupPadrao {
}