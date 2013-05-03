package br.com.buscador.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class HibernateConfiguration {

    public static final String userName = "aluno";
    public static final String password = "aluno";
    public static final String dataBase = "aluno";
    private static AnnotationConfiguration cfg = null;
    private static SessionFactory factory = null;

    
    @Deprecated
    public static SessionFactory getSessionFactory() {
        if (cfg == null) {
            cfg = new AnnotationConfiguration();
            cfg.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
            cfg.setProperty("hibernate.connection.username", userName);
            cfg.setProperty("hibernate.connection.password", password);
            cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/" + dataBase);
            cfg.setProperty("hibernate.show_sql", "false");
            cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
            cfg.setProperty("hibernate.connection.autocommit", "true");

//            cfg.addAnnotatedClass(Proprietario.class);

            factory = cfg.buildSessionFactory();
        }
        return factory;
    }
}
