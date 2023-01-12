package model.dao;

import model.entity.Calculo;

public class CalculoDao extends GenericDao<Calculo> {

    public void salvar(Calculo c) {
        String insert = "INSERT INTO " +
                "CALCULOS (TIPO, VALOR_PRINCIPAL, TAXA, MESES, MONTANTE, TOTAL_DE_JUROS) " +
                "VALUES (?,?,?,?,?,?)";
        save(insert, c.getTipo().getDescricao(), c.getValorPrincipal(), c.getTaxa(),
                c.getMeses(), c.getMontante(), c.getTotalJuros()
        );
    }

}