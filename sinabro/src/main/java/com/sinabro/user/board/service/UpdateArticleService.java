package com.sinabro.user.board.service;

import com.sinabro.model.BoardVO;

public interface UpdateArticleService {

	BoardVO getArticle(Integer num);

	String getPass(Integer num);

	void updateArticle(BoardVO boardVo);
}
