/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao.parent;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author work
 */
public class EntityDAO extends HibernateDaoSupport implements IEntityDAO {

    public Object loadEntity(Class entityClass, int id) {
        return getHibernateTemplate().get(entityClass, id);
    }

    public void saveEntity(Object object) {
        getHibernateTemplate().saveOrUpdate(object);
    }

    public void saveEntity(Collection<?> objectList) {
        getHibernateTemplate().saveOrUpdateAll(objectList);
    }

    public void updateEntity(Object object) {
        getHibernateTemplate().update(object);
    }

    public void updateEntity(Collection<?> objectList) {
        getHibernateTemplate().update(objectList);
    }

    public void deleteEntity(Object object) {
        getHibernateTemplate().delete(object);
    }

    public void deleteEntity(Collection<?> objectList) {
        getHibernateTemplate().deleteAll(objectList);
    }

    // calismiyor
    public List loadEntityByExample(Object object) {
        return getHibernateTemplate().findByExample(object);
    }

    public List loadEntityByParam(Object object, int firstResult, int maxResults, String orderBy) {
        DetachedCriteria criteria = DetachedCriteria.forClass(object.getClass());
        Method[] methods = object.getClass().getDeclaredMethods();
        boolean result = true;
        try {
            for (Method method : methods) {
                String methodName = method.getName();

                if (methodName.startsWith("get") || methodName.startsWith("is")) {
                    String fieldName = "";
                    if (methodName.startsWith("get")) {
                        fieldName = methodName.substring(3, 4).toLowerCase(Locale.UK).concat(methodName.substring(4));
                    } else {
                        fieldName = methodName.substring(2, 3).toLowerCase(Locale.UK).concat(methodName.substring(3));
                    }
                    Field field = object.getClass().getDeclaredField(fieldName);
                    Object param = method.invoke(object);

                    //TODO buna gerek kalmadi artik
                    if (param != null && param.getClass().getSuperclass() == Number.class) {
                        Number paramNumber = (Number) param;
                        if (paramNumber.intValue() != 0) {
                            criteria.add(Restrictions.eq(fieldName, param));
                        }
                    } else if (param != null) {
                        criteria.add(Restrictions.eq(fieldName, param));
                    }
                }
            }
        } catch (IllegalAccessException ex) {
            result = false;
            Logger.getLogger(EntityDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            result = false;
            Logger.getLogger(EntityDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            result = false;
            Logger.getLogger(EntityDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchFieldException ex) {
            result = false;
            Logger.getLogger(EntityDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            result = false;
            Logger.getLogger(EntityDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        //TODO burayi test et
        if (result = false) {
            throw new DataAccessException("loadEntityByParam exception for" + object.getClass()) {
            };
        }
        if (orderBy != null && !orderBy.equals("")) {
            criteria.addOrder(Order.desc(orderBy));
        }
        List entityList = getHibernateTemplate().findByCriteria(criteria, firstResult, maxResults);        
        return entityList;
    }

    public List loadEntityByParam(Object object) {
        return loadEntityByParam(object, 0, 0, null);
    }
}
