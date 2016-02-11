package netophp.mx.dao.impl;

import netophp.mx.dao.AbstractGenericDao;
import netophp.mx.dao.PersonaDao;
import netophp.mx.domain.Persona;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaDaoImpl extends AbstractGenericDaoHibernateImpl<Persona, Long> implements PersonaDao {

    @Autowired
    public PersonaDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
