/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao.parent;

import java.util.Collection;
import java.util.List;

/**
 *
 * @author work
 */
public interface IEntityDAO {

    void saveEntity(Object object);

    void saveEntity(Collection<?> objectList);

    Object loadEntity(Class entityClass, int id);

    void updateEntity(Object object);

    void updateEntity(Collection<?> objectList);

    void deleteEntity(Object object);

    void deleteEntity(Collection<?> objectList);
    
    public List loadEntityByExample(Object object);

    public List loadEntityByParam(Object object, int firstResult, int maxResults, String orderBy);

    public List loadEntityByParam(Object object);
}
