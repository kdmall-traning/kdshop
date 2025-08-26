package com.kd.basic.admin.product;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AdProductService {
	
	private final AdProductMapper adProductMapper;
	
	public void pro_insert(ProductDTO dto) {
		adProductMapper.pro_insert(dto);
	}
}
