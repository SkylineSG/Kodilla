//package com.kodilla.good.patterns.challenges;
//
//import java.time.LocalDate;
//
//public class Application {
//    public static void main(String[] args) {
//
//        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
//        OrderRequest orderRequest = orderRequestRetriever.retrieve();
//
//        ProductOrderService productOrderProcessor = new ProductOrderService(new MailService(),new ProductPhone(),
//                new PhoneRepository());
//        productOrderProcessor.process(orderRequest);
//
//    }
//}