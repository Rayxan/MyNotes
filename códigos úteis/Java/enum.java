//Program.java

package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program{
	public static void main(String[] args) {
		
		//new Date() mostra a data de agora 
		Order order = new Order(1090, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);//Lembrar que após a sobreposição da função toString, só é necessário digitar o nome da classe na hora da impressao da função	
		
		//-------------------------------------------
		//Conversão de String para enum
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}
}

//------------------------------------------------------------------------------
//OrderStatus.java

package entities.enums;

public enum OrderStatus{
	
	PENDING_PAYMENT,
	PROCESSING,
	SHIPPED,
	DELIVERED;
}

//------------------------------------------------------------------------------
//Order.java

package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order{
	
	private Integer id;
	private Date moment;
	private OrderStatus status;
	
	public Order() {
		
	}
	
	public Order(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getmoment() {
		return moment;
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public OrderStatus getStatus() {
		return status;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
}
