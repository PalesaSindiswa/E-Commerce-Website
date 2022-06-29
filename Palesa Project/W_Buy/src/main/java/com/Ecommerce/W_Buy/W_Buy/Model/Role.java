package com.Ecommerce.W_Buy.W_Buy.Model;



import javax.persistence.*;

import org.hibernate.annotations.NaturalId;

import com.Ecommerce.W_Buy.W_Buy.Enum.RoleName;


@Entity
@Table(name = "roles")
public class Role {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	   
	  @Enumerated(EnumType.STRING)
	    @NaturalId
	    @Column(length = 60)
	    private RoleName name;
	  
	  public Role(RoleName name) {
	        this.name = name;
	    }
	  public Role() {

	    }

	    public void setRole(Long id) {
	    	this.id=id;
	    }
	    public Long getRole(){
	    	return id;
	    }
	    public void setName(RoleName name) {
	    	this.name=name;
	    }
	    public RoleName getName(){
	    	return name;
	    }
	    
	   
}
