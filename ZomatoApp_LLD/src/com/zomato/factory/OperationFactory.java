package com.zomato.factory;

public class OperationFactory {

    public static IOperationFactory getOperation(String type) {

        switch (type.toLowerCase()) {

            case "place":
                return new PlaceOrderOperation();

            case "cancel":
                return new CancelOrderOperation();

            case "pay":
                return new PayOrderOperation();

            default:
                throw new IllegalArgumentException("Invalid operation type");
        }
    }
}