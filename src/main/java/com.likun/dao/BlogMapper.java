package com.likun.dao;


import com.likun.entity.Blog;
import com.likun.entity.vo.BlogVO;

import java.util.List;

public interface BlogMapper {

    List<BlogVO> selectBlogVO();

    List<BlogVO> selectFullBlogVO();
}