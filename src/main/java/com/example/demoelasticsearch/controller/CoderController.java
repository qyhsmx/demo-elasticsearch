package com.example.demoelasticsearch.controller;

import com.example.demoelasticsearch.entity.Coder;
import com.example.demoelasticsearch.repository.EsUserRepository;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/person/coder")
public class CoderController {

    @Autowired
    private EsUserRepository repository;

    @GetMapping("/getcoder")
    public ResponseEntity get(){

        List<Coder> orders = repository.findByNameIsLikeOrderByAgeDesc("1");

        System.out.println("*********正在执行查询操作************");

        return new ResponseEntity(orders, HttpStatus.OK);
    }

    @GetMapping("/add")
    public void add(HttpServletResponse response)throws Exception{


        Coder coder = new Coder();
        coder.setId(3L);
        coder.setAge(12);
        coder.setAddress(Arrays.asList("French","English","America"));
        coder.setName("白展堂");

        Coder save = repository.save(coder);

        //response.getWriter().write("值已经插入》》》》》"+coder);

        response.getOutputStream().write(("值已经插入》》》》》"+coder).getBytes());




    }

    @RequestMapping("/query")
    public Coder query(@RequestParam Map<String,String> map) {
        Coder info = repository.queryCoderById(Long.parseLong(map.get("id")));
        System.err.println("查到的值是："+info);
        return info;
    }


}
