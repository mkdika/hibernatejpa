package com.mkdika.hibernatejpa.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Maikel
 */
@Entity
@Table(name = "test1", catalog = "test", schema = "")
public class Test1 implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    
    @Basic(optional = false)
    @Column(name = "column1")
    private String column1;
    
    @Basic(optional = false)
    @Column(name = "column2")
    private String column2;
    
    @Basic(optional = false)
    @Column(name = "column3")
    private String column3;
    
    @Basic(optional = false)
    @Column(name = "column4")
    private double column4;

    public Test1() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    public String getColumn3() {
        return column3;
    }

    public void setColumn3(String column3) {
        this.column3 = column3;
    }

    public double getColumn4() {
        return column4;
    }

    public void setColumn4(double column4) {
        this.column4 = column4;
    }       
}
