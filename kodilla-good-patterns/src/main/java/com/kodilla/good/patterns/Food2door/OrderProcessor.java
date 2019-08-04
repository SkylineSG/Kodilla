package com.kodilla.good.patterns.Food2door;

public class OrderProcessor {
    private InformationService informationService;
    private PreparationOrders orderPreparation;

    public OrderProcessor(InformationService informationService, PreparationOrders orderPreparation) {
        this.informationService = informationService;
        this.orderPreparation = orderPreparation;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isAvailable = orderPreparation.prepareOrder(orderRequest.getCustomer(), orderRequest.getFoodProducer());
        if (isAvailable) {
            informationService.info(orderRequest.getCustomer(), orderRequest);

            return new OrderDto(orderRequest.getCustomer(), orderRequest.getOrderedProducts(), true);
        } else {
            return new OrderDto(orderRequest.getCustomer(), orderRequest.getOrderedProducts(), false);
        }
    }
}
