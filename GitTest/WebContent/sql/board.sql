create table board(
   board_num number,            --�۹�ȣ
   board_name varchar2(30),      --�ۼ���
   board_pass varchar2(30),      --��й�ȣ
   board_subject varchar2(300),   --����
   board_content varchar2(4000),   --����
   board_file varchar2(50),      --÷�ε� ���ϸ�
   board_re_ref number,         --�亯 �� �ۼ��� �����Ǵ� ���� ��ȣ
   board_re_lev number,         --�亯 ���� ����
   board_re_seq number,         --�亯 ���� ����
   board_readcount number,         --���� ��ȸ��
   board_date date,            --���� �ۼ� ��¥
   primary key(board_num)
);
   
select * from board;

select * from member;

select * from (select rownum rnum, BOARD_NUM, BOARD_NAME, BOARD_SUBJECT,
					BOARD_RE_REF, BOARD_RE_LEV, BOARD_RE_SEQ from 
						(select * from board order by BOARD_RE_REF desc, BOARD_RE_SEQ asc)
					) where rnum>=1 and rnum<=12;
					
delete from board where BOARD_NUM=4;