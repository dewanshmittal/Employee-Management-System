package com.moana;

import org.springframework.data.jpa.repository.JpaRepository;



public interface servicerepo extends JpaRepository<com.moana.model.Adminboss,String> {

	boolean existsByUseridAndPassword(String userid, String password);
	

}
