package com.contabilizei.teste;

import com.contabilizei.teste.order.model.Order;
import com.contabilizei.teste.ordercontroller.OrderController;
import com.contabilizei.teste.orderitem.model.OrderItem;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			/*CustomerController controller = new CustomerController();
			List<Customer> customer = controller.findAll();
			
			System.out.println(customer.size());*/
		
		/*ProductController controller = new ProductController();
		List<Product> product = controller.findAll();
		
		System.out.println(product);*/
		
		OrderController controller = new OrderController();
		Order product = controller.findById(1);
		
		System.out.println(product);
		
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("Cliente");
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Cliente cliente = new Cliente();
		cliente.setName("ZICA");
		cliente.setIdFederac(1111111111);
		em.persist(cliente);
		
		tx.commit();
		em.close();
		emf.close();*/
		
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("Customer");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Customer customer = new Customer();
		customer.setName("Cliente 3");
		customer.setIdFederac(00011111111);
		em.persist(customer);
		
		tx.commit();
		em.close();*/

	}

}
