package com.xxxx.server.pojo;

import jdk.nashorn.internal.objects.annotations.Property;
import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@Data
@NodeEntity(label = "Product")
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    @Property
    private Integer productId;

    @Property
    private String name;
}
