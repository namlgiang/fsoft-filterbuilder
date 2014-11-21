package com.directv.filter.service;

import com.directv.filter.dto.FilterDTO;
import com.directv.filter.repository.FilterDAO;

public class FilterServiceImpl implements FilterService{
    private FilterDAO filterDAO;

    public void setFilterDAO(FilterDAO filterDAO) {
        this.filterDAO = filterDAO;
    }


    @Override
    public void addFilter(FilterDTO filter) {
	// TODO Auto-generated method stub
	
    }
    
}
