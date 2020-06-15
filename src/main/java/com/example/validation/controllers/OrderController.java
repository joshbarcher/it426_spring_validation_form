package com.example.validation.controllers;

import com.example.validation.entities.OrderInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Slf4j
@Controller
public class OrderController
{
    @GetMapping("/order/form")
    public String showOrderForm(Model model)
    {
        model.addAttribute(new OrderInfo());

        return "order-form";
    }

    @PostMapping("/order/form")
    public String handleOrderForm(OrderInfo orderInfo)
    {
        return "order-form";
    }
}
