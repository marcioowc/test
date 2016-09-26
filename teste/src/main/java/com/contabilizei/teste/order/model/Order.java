package com.contabilizei.teste.order.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.contabilizei.teste.customer.model.Customer;
import com.contabilizei.teste.orderitem.model.OrderItem;

@Entity
@Table(name="pedido")
public class Order implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="id_cliente")
	private Integer customerId;
	
	@Column(name="dat_emissao")
	private Date date;
	
	@OneToOne
	@JoinColumn(name="id_cliente",referencedColumnName="id",nullable=true,insertable=false,updatable=false)
	private Customer customer;
	
	@OneToMany(targetEntity=OrderItem.class)
	private List<OrderItem> orderItem;

}
