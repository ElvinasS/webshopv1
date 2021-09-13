package com.webshop.webshop.service;

import com.webshop.webshop.model.Goods;
import com.webshop.webshop.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GoodsService{

    private final GoodsRepository goodsRepository;

    @Autowired
    public GoodsService(GoodsRepository goodsRepository) {this.goodsRepository = goodsRepository;}

    public List<Goods> getGoods() {
        return goodsRepository.findAll();
    }

    public Optional<Goods> getGoodsById(long goodsId) {
        return goodsRepository.findById(goodsId);
    }

    public void addNewGoods(Goods goods) {
        goodsRepository.save(goods);
    }

}