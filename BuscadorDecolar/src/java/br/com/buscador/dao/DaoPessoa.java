package br.com.buscador.dao;

import br.com.buscador.bean.Pessoa;


public class DaoPessoa extends DaoGenerics<Pessoa> {

    public DaoPessoa() {
        super(Pessoa.class);
    }

}
