package br.com.buscador.bean;

import java.text.ParseException;
import javax.swing.text.MaskFormatter;

/**
 * @author Saulo
 */
public enum Mascaras {

    VALOR("#,##0.00"),
    DATA("##/##/####"),
    CPF("###.###.###-##"),
    CNPJ("##.###.###/####-##"),
    NUMERO("#,##0"),
    TELEFONE("(##)####-####"),
    ONLYNUMBER("#"),
    ONLYALPHANUMBER("*********************************************************");
    private String mascara;

    private Mascaras(String mascara) {
        this.mascara = mascara;
    }

    public String getMascara() {
        return mascara;
    }

    public MaskFormatter getMaskCharValid() {
        try {
            MaskFormatter mk = new MaskFormatter(getMascara());
            mk.setValidCharacters(" abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
            return mk;
        } catch (ParseException e) {
            return null;
        }
    }

    public MaskFormatter getMask() {
        try {
            return new MaskFormatter(getMascara());
        } catch (ParseException e) {
            return null;
        }
    }
}
