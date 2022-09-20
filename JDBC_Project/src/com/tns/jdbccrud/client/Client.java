package com.tns.jdbccrud.client;

import java.sql.SQLException;

import com.tnsif.jdbccrud.service.service;



public class Client {

	public static void main(String[] args) throws SQLException 
	{
		service service1=new service();
        //service.addStudent();
        service1.getStudents();
        service1.updateStudent();
        service1.deleteStudnet();
        //service1.closeSession();
	}

}