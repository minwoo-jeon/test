package com.project.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.project.domain.PaginationVO;
import com.project.domain.SearchVO;
import com.project.mapper.SearchMapper;
@Service
public class FestivalServiceImpl implements FestivalService{
	@Inject
    private SearchMapper FestivalDAO; // Assuming the existence of a FestivalDAO class

    public List<SearchVO> getSearchList(String keyword) {
        return FestivalDAO.getSearchList(keyword);
    }

    public List<SearchVO> getSearchListPaging(PaginationVO vo) {
        return FestivalDAO.getSearchListPaging(vo);
    }

   

    public int getTotalCount(PaginationVO v) {
        return FestivalDAO.getTotalCount(v);
    }

    public SearchVO getSearch(String FESTIVAL_NAME) {
        return FestivalDAO.getSearch(FESTIVAL_NAME);
    }
}

