package com.mkdika.hibernatejpa.cli;

import com.mkdika.hibernatejpa.entity.Test1;
import com.mkdika.hibernatejpa.service.ServiceDao;
import com.mkdika.hibernatejpa.service.ServiceDaoImpl;

/**
 *
 * @author Maikel
 */
public class Main {
    
    private static ServiceDao svc = new ServiceDaoImpl();

    public static void main(String[] args) {      
        printTotalRecord();
        
        Test1 t = new Test1();
        t.setId("222");
        t.setColumn1("c1");
        t.setColumn2("c2");
        t.setColumn3("c3");
        t.setColumn4(662d);
        
        svc.save(t);
        
        printTotalRecord();                        
    }
    
    public static void printTotalRecord() {
        System.out.println("Size: " + svc.getTest1s().size());        
    }    
}
