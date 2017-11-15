package com.report.dao.impl;

public class PersonDao implements IPersonDao {

	@Override  
    public void save() {  
        System.out.println("------------from PersonDao.save()");  
        System.out.println("------------spring test success");  
    }  

}
