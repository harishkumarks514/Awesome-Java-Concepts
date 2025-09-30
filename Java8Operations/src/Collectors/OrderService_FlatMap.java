package Collectors;

import java.util.List;

public class OrderService_FlatMap {

	public static void main(String[] args) {

		public List<Item> getAllItems(List<Order> orders)
		{
			return orders.stream()
					.flatMap(Order -> order.getItems()
					.stream()).collect(Collectors.toList());
		}
	}
}
