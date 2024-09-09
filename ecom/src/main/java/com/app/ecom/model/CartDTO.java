package com.app.ecom.model;

import java.util.ArrayList;
import java.util.List;

public class CartDTO {

    private Long cartId;
    private Double totalPrice = 0.0;
    private List<ProductDTO> products = new ArrayList<>();
}
