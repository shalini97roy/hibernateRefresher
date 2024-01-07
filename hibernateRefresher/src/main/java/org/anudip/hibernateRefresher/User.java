package org.anudip.hibernateRefresher;
import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity 
@Cacheable  
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE) 
public class User {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int UserId;
	String UserName;
	String Address;
	int Salary;
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", UserName=" + UserName + ", Address=" + Address + ", Salary=" + Salary
				+ "]";
	}

}
