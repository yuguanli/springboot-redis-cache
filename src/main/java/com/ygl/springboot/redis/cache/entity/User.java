package com.ygl.springboot.redis.cache.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "test.user")
public class User implements Serializable {

    private static final long serialVersionUID = 8153549362207125918L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}