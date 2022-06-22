package com.study.cart;

import java.util.List;

public interface CartService {

  List<CartDTO> list(String id);

  int create(CartDTO cartDTO);

  int update(CartDTO cartDTO);

  int delete(int contentsno);

  int total(int contentsno);
}
