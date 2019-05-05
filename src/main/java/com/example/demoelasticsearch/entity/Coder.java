package com.example.demoelasticsearch.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Document(indexName = "person",type = "coder")
public class Coder implements Serializable {

    private Long id;

    private String name;
    private Integer age;

    private Map<String,Friend> friends = new HashMap<>();

    private List<String> address= new ArrayList<>();

    private SubCoder subCoder = new SubCoder();

}
