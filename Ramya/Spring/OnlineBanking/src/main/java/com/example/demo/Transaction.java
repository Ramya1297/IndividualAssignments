package com.example.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Transaction {
	@Id
	private String acc_num_source;
	private String acc_num_dest;
	private float amount;
	private Date date;
	
	public String getAcc_num_source() {
		return acc_num_source;
	}
	public void setAcc_num_source(String acc_num_source) {
		this.acc_num_source = acc_num_source;
	}
	public String getAcc_num_dest() {
		return acc_num_dest;
	}
	public void setAcc_num_dest(String acc_num_dest) {
		this.acc_num_dest = acc_num_dest;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Transaction [acc_num_source=" + acc_num_source + ", acc_num_dest=" + acc_num_dest + ", amount=" + amount
				+ ", date=" + date + "]";
	}
    
	
	

}
