package com.mj_eno.sidedish.domain.bestMenuCategory;

import org.springframework.data.annotation.Id;

public class BestMenuCategory {

    @Id
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
