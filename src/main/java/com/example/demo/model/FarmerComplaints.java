package com.example.demo.model;


import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="complaints")
public class FarmerComplaints {

   @Id
   @GeneratedValue
    @Column(name="id")
    private long id;
    
    @Column(name="productid")
    private long productid;
    
   
    @Column(name="productname")
    private String productname;
    
  
   @Column(name="points")
    private int points;
    
   
    @Column(name="complaints")
    private String complaints;



   public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public long getProductid() {
		return productid;
	}



	public void setProductid(long productid) {
		this.productid = productid;
	}



	public String getProductname() {
		return productname;
	}



	public void setProductname(String productname) {
		this.productname = productname;
	}



	public int getPoints() {
		return points;
	}



	public void setPoints(int points) {
		this.points = points;
	}



	public String getComplaints() {
		return complaints;
	}



	public void setComplaints(String complaints) {
		this.complaints = complaints;
	}



public FarmerComplaints(long productid, String productname, int points, String complaints) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.points = points;
		this.complaints = complaints;
	}



@Override
    public String toString() {
        return "FarmerComplaints [id=" + id + ", productid=" + productid + ", productname=" + productname + ", points="
                + points + ", complaints=" + complaints + "]";
    }












    
    
    
}