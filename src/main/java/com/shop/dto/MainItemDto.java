package com.shop.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MainItemDto {

    private Long id;

    private String itemNm;

    private String company;

    private String itemDetail;

    private String imgUrl;

    private Integer price;

    @QueryProjection
    public MainItemDto(Long id, String itemNm, String company, String itemDetail, String imgUrl,Integer price){
        this.id = id;
        this.itemNm = itemNm;
        this.company = company;
        this.itemDetail = itemDetail;
        this.imgUrl = imgUrl;
        this.price = price;
    }

}