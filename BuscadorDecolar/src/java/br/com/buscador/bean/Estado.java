package br.com.buscador.bean;

public enum Estado {

    AC(""), AL(""), AM(""), AP(""), BA(""), CE(""), DF(""), ES(""), GO(""), MA(
    ""), MG(""), MS(""), MT(""), PA(""), PB(""), PE(""), PI(""), PR(""), RJ(
    ""), RN(""), RO(""), RS(""), SC(""), SE(""), SP(""), TO("");
    private String nome;

    public String getEstadoNome() {
        return nome;
    }

    private Estado(String nome) {
        this.nome = nome;
    }
}
