package com.duanjunyu.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.duanjunyu.entity.Move;
import com.duanjunyu.entity.Type;
import com.duanjunyu.mapper.MoveDao;

@Service
public class MoveServiceImpl implements MoveService{
	@Resource
	private MoveDao md;

	@Override
	public List<Move> list() {
		return md.list();
	}

	@Override
	public List<Type> findtype() {
		// TODO Auto-generated method stub
		return md.findtype();
	}

}
