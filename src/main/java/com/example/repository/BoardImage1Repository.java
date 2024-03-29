package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.BoardImage1;



@Repository
public interface BoardImage1Repository extends JpaRepository<BoardImage1, Long>{

    // 추가, 수정, 삭제... 

    // 조회
    // 변수명 객체 Board1_no ,No, Name, Age
    // findBy변수명OrderBy변수명Asc
    
    // 게시글번호가 일치하는 것중에서 이미지번호가 가장 작은것을 반환
    // select * from boardimage1 where board1.no=13 order by no asc limit 1;
     BoardImage1 findTop1ByBoard1_noOrderByNoAsc(Long no);

     // 게시글 번호가 일치하는 모든 이미지
     // select * from boardimage1 where board1.no=13 order by no asc;
     List<BoardImage1> findByBoard1_noOrderByNoAsc(Long no);
}
