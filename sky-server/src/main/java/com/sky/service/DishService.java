package com.sky.service;

import com.sky.dto.DishDTO;
import org.springframework.stereotype.Service;

@Service
public interface DishService {
    public void savaWithFlavor(DishDTO dishDTO);
}
