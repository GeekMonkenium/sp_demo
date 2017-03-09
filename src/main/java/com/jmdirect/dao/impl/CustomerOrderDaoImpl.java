package com.jmdirect.dao.impl;

import com.jmdirect.dao.CustomerDao;
import com.jmdirect.dao.CustomerOrderDao;
import com.jmdirect.model.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Jatin Mehta on 09/03/2017.
 */
@Repository
@Transactional
public class CustomerOrderDaoImpl implements CustomerOrderDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void addCustomerOrder(CustomerOrder customerOrder) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(customerOrder);
        session.flush();
    }
}
