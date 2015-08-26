/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.domain.Tag;
import com.eren.radiomode.service.TagService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author firat
 */
public class TagServiceImpl implements TagService {

    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    public Tag findTagByName(String tagName) {
        Tag tag = new Tag();
        tag.setName(tagName);
        List<Tag> tags = entityDAOFactory.getTagDAO().loadEntityByParam(tag);
        if (tags.size() > 0 && tags.get(0).getRefcount() > 0) {
            return tags.get(0);
        }
        return null;
    }
    
}
