package com.study.cart;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CartController {

  @Autowired
  @Qualifier("com.study.cart.CartServiceImpl")
  private CartService cartService;

  @PostMapping("/contents/cart/{price}/{stock}/{productName}/{productDescription}/{filename}")
  public ResponseEntity<Integer> cart(@RequestBody CartDTO vo, @PathVariable int price, @PathVariable int stock,
      @PathVariable String productName, @PathVariable String productDescription,@PathVariable String filename) {
    int contentsno = vo.getContentsno();
    System.out.println(contentsno);
    System.out.println(price);
    System.out.println(stock);
    System.out.println(productName);
    System.out.println(productDescription);
    System.out.println(filename);
    
    int cnt = cartService.create(vo);
    System.out.println(cnt);

    return new ResponseEntity<Integer>(cnt, HttpStatus.OK);
  }
  
  @GetMapping("/mypage/cart")
  public String mypageCart(HttpSession session, Model model) {
    String id = (String) session.getAttribute("id");

    if (id == null) {
      return "redirect:/member/login/";
    } else {

      List<CartDTO> dto = cartService.list(id);
       
      model.addAttribute("list", dto);

      return "/mypage/cart";
    }
  }
}
