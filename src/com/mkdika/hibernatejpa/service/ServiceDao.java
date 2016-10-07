package com.mkdika.hibernatejpa.service;

import com.mkdika.hibernatejpa.entity.Test1;
import java.util.List;

/**
 *
 * @author Maikel
 */
public interface ServiceDao {
    
    public void save(Object o);
    
    public void delete(Object o);

    public List<Test1> getTest1s();
    
    public Test1 getTest1ById(String id);

}
