package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dto.Item;
import com.example.dto.ItemImage;
import com.example.mapper.ItemMapper;

import lombok.RequiredArgsConstructor;

// 설계부분을 구현하는 클래스 -> 매퍼를 호출함.
@Service
@RequiredArgsConstructor // 객체 생성 어노테이션(lombok)
public class ItemServiceImpl implements ItemService{

    final ItemMapper iMapper; // 매퍼 객체 생성 또는 @Autowired ItemMapper iMapper;

    @Override
    public List<Item> selectItemList() {
      try {
        return iMapper.selectItemList();        
      } 
      catch (Exception e) {
        e.printStackTrace(); // 오류발생시 터미널에 표시
        return null; // 오류발생시 null반환
      }
    }

    @Override
    public int insertItemImageOne(ItemImage obj) {
      try {
        return iMapper.insertItemImageOne(obj);
      } catch (Exception e) {
        e.printStackTrace();
        return 0;
      }
    }
    
}
