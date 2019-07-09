package com.duanjunyu.mapper;

import java.util.List;

import com.duanjunyu.entity.Move;
import com.duanjunyu.entity.Type;

public interface MoveDao {

	List<Move> list();

	List<Type> findtype();

}
