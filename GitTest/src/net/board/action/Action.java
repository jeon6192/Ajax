package net.board.action;

import javax.servlet.http.*;

// 특정 비즈니스 요청으로 수행하고 결과 값음 ActionForward 타입으로 반환하는 메서드가 정의되어있음
public interface Action {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
		
}
