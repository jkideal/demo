package com.example.demo;

import com.example.product;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;
import java.util.stream.Stream;

@Controller
public class aa {

    @RequestMapping("java")
    public String javaa(){


        //map存储集合
        HashMap<String,List<product>> map = new HashMap<>();
        //原产品集合
        List<product> oldProduct = new ArrayList<>();
        for (product product : oldProduct) {
            //如果存在 存入list
            if (map.get(product.getSku())!=null){
                map.get(product.getSku()).add(product);
            }else {
                //如果不存在 自己创建 list 存入

                ArrayList<product> products = new ArrayList<>();
                products.add(product);
                map.put(product.getSku(),products);
            }
            String s = "dsafasdfsd1212341dfsfas312";

        }







        return "java";
    }
}
