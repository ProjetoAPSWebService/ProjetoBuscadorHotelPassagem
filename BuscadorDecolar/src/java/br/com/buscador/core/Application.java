package br.com.buscador.core;

import br.com.buscador.bean.Hotel;
import br.com.buscador.dao.DaoHotel;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author Saulo
 */
public class Application {

    public static void main(String[] args) {
        System.out.println("ahaaha");

//        Configuration conf = new AnnotationConfiguration();
//        conf.configure();
//        SchemaExport se = new SchemaExport(conf);
//        se.create(true, true);

        Hotel hotel = new Hotel();
        hotel.setCidade("Campo Mourão");
        hotel.setNome("Hotel Vacilo.net");
        hotel.setEndereco("Avenida Duas Vias");
        
        DaoHotel dao = new DaoHotel();
        dao.persistir(hotel);
        
        
        

    }
}
