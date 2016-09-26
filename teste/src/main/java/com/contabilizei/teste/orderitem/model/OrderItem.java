package com.contabilizei.teste.orderitem.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.contabilizei.teste.orderitem.model.pk.OrderItemPK;

@Entity
@Table(name="item_pedido")
@IdClass(OrderItemPK.class)
public class OrderItem implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_pedido")
	private Integer orderId;
	
	@Id
	@Column(name="id_cliente")
	private Integer customerId;
	
	@Column(name="quantidade")
	private Double amount;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
