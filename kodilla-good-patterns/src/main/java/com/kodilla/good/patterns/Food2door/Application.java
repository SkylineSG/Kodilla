package com.kodilla.good.patterns.Food2door;

import com.kodilla.good.patterns.Food2door.OrderProcessor;


public class Application {
    public static void main(String[] args){

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();

        OrderRequest orderRequest1 = orderRequestRetriever.retrive1();
        OrderRequest orderRequest2 = orderRequestRetriever.retrive2();
        OrderRequest orderRequest3 = orderRequestRetriever.retrive3();

        OrderProcessor orderProcessor = new OrderProcessor(new OrderService());
        orderProcessor.processing(orderRequest1);
        orderProcessor.processing(orderRequest2);
        orderProcessor.processing(orderRequest3);


        orderRequest1.getSupplier().process(orderRequest1);
        orderRequest1.getSupplier().process(orderRequest2);
        orderRequest1.getSupplier().process(orderRequest3);
    }
}
