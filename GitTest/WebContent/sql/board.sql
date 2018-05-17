create table board(
   board_num number,            --글번호
   board_name varchar2(30),      --작성자
   board_pass varchar2(30),      --비밀번호
   board_subject varchar2(300),   --제목
   board_content varchar2(4000),   --내용
   board_file varchar2(50),      --첨부될 파일명
   board_re_ref number,         --답변 글 작성시 참조되는 글의 번호
   board_re_lev number,         --답변 글의 깊이
   board_re_seq number,         --답변 글의 순서
   board_readcount number,         --글의 조회수
   board_date date,            --글의 작성 날짜
   primary key(board_num)
);
   
select * from board;

select * from member;

select * from (select rownum rnum, BOARD_NUM, BOARD_NAME, BOARD_SUBJECT,
					BOARD_RE_REF, BOARD_RE_LEV, BOARD_RE_SEQ from 
						(select * from board order by BOARD_RE_REF desc, BOARD_RE_SEQ asc)
					) where rnum>=1 and rnum<=12;
					
delete from board where BOARD_NUM=4;