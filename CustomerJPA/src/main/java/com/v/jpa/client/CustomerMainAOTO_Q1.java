package com.v.jpa.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.v.jpa.pojo.AddressAOTOJPA_Q1;
import com.v.jpa.pojo.CustomerAOTOJPA_Q1;

public class CustomerMainAOTO_Q1 {

    private static final EntityManagerFactory emFactoryObj;
    private static final String PERSISTENCE_UNIT_NAME = "JPAq1";  
 
    static {
        emFactoryObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }
 
    // This Method Is Used To Retrieve The 'EntityManager' Object
    public static EntityManager getEntityManager() {
        return emFactoryObj.createEntityManager();
    }

	public static void main(String[] args) {
		  EntityManager entityMgr = getEntityManager();
	        entityMgr.getTransaction().begin();
	 
		
	
		CustomerAOTOJPA_Q1 custmor1=new CustomerAOTOJPA_Q1(1,"ak");
		AddressAOTOJPA_Q1 address1=new AddressAOTOJPA_Q1(101,5,"MGroad","Maharashtra");
		custmor1.setA_address(address1);
		
		CustomerAOTOJPA_Q1 custmor2=new CustomerAOTOJPA_Q1(2,"ok");
		AddressAOTOJPA_Q1 address2=new AddressAOTOJPA_Q1(102,2,"MGroad","Hyd");
		custmor2.setA_address(address2);
		//crud operation using session object
		//insert
  
		
		entityMgr.persist(address1);
		entityMgr.persist(custmor1);
		
		
//		entityMgr.persist(address2);
//		entityMgr.persist(custmor2);
		
		
	//update

//		AddressAOTOJPA_Q1 addr1=entityMgr.find(AddressAOTOJPA_Q1.class, 101);
//		addr1.setState("mh");
		
		
		//delete

//		AddressAOTOJPA_Q1 addr1=entityMgr.find(AddressAOTOJPA_Q1.class, 101); 
//		System.out.println(addr1);
//		entityMgr.remove(addr1);

//		CustomerAOTOJPA_Q1 cust1=entityMgr.find(CustomerAOTOJPA_Q1.class, 1);//working parent with child deleted
//		System.out.println(cust1);
//		entityMgr.remove(cust1);

        entityMgr.getTransaction().commit();
 
        entityMgr.clear();
	}

}
