package com.kd.basic.admin.product;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class ProductDTO {
	private Integer  pro_num;
	private Integer cate_code; //카테고리 코드
    private String  pro_name;
    private int pro_price;
    private int pro_discount; //할인율
    private String  pro_publisher;
    private String pro_content;
    private String pro_up_folder;
    private String pro_img; //상품이미지
    private int pro_amount;
    private String pro_buy;
    private int pro_review;
    private Date pro_date;
    private Date pro_updatedate;

}
