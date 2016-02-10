package netophp.mx.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import netophp.mx.dao.AbstractGenericDao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class AbstractGenericDaoHibernateImpl<T, PK extends Serializable> implements AbstractGenericDao<T, PK> {

    private SessionFactory sessionFactory;

    public AbstractGenericDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void create(T newInstance) {
        currentSession().save(newInstance);
    }

    @SuppressWarnings("unchecked")
    public T read(PK id) {
        return (T) currentSession().get(getType(), id);
    }

    public void update(T transientObject) {
        currentSession().update(transientObject);
    }

    public void delete(T persistentObject) {
        currentSession().delete(persistentObject);
    }

    @SuppressWarnings("unchecked")
    public List<T> findAll() {
        return currentSession().createQuery("from " + getType().getName()).list();
    }

    public long count() {
        Query query = currentSession().createQuery("Select count(*) from " + getType().getName());
        return (Long) query.uniqueResult();
    }

    @SuppressWarnings("rawtypes")
    private Class<?> getType() {
        ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
        return (Class) parameterizedType.getActualTypeArguments()[0];
    }

    public Session currentSession() {
        return sessionFactory.getCurrentSession();
    }
}
