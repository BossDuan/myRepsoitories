package com.duanjunyu.service;

import java.util.List;

import com.duanjunyu.entity.Move;
import com.duanjunyu.entity.Type;

public interface MoveService {

	List<Move> list();

	List<Type> findtype();

}
