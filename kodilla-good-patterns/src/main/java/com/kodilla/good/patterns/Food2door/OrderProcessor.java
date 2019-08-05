package com.kodilla.good.patterns.Food2door;

public class OrderProcessor {

    public OrderService orderService;

    public OrderProcessor(OrderService orderService) {
        this.orderService= orderService;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public OrderDto processing(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getCustomer(),orderRequest.getProduct(),orderRequest.getSupplier());
        if (isOrdered) {
            return new OrderDto(orderRequest.getCustomer(), orderRequest.getProduct(), orderRequest.getSupplier(), true);
        }
        else {
            return new OrderDto(orderRequest.getCustomer(),orderRequest.getProduct(),orderRequest.getSupplier(),false);
        }

    }

}
