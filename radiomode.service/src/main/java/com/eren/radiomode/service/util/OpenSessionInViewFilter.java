/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.util;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessResourceFailureException;

/**
 *
 * @author firat
 */
public class OpenSessionInViewFilter extends org.springframework.orm.hibernate3.support.OpenSessionInViewFilter {

    @Override
    protected Session getSession(SessionFactory sessionFactory)
            throws DataAccessResourceFailureException {
        Session session = super.getSession(sessionFactory);
        session.setFlushMode(FlushMode.COMMIT);
        return session;
    }

    @Override
    protected void closeSession(Session session, SessionFactory factory) {
        session.flush();
        super.closeSession(session, factory);
    }
}
