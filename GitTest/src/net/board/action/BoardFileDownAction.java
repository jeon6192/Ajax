package net.board.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardFileDownAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("euc-kr");
		String fileName=request.getParameter("filename");
		System.out.println("fileName : "+fileName);
		
		String savePath="boardupload";
		
		String sDownloadPath=request.getServletContext().getRealPath(savePath);
		
		String sFilePath=sDownloadPath+"\\"+fileName;
		System.out.println("sFilePath : "+sFilePath);
		
		byte[] b=new byte[4096];
		
		// sFilePath에 있는 파일의 MimeType을 구해옴
		String sMimeType=request.getServletContext().getMimeType(sFilePath);
		System.out.println("sMimeType >>> "+sMimeType);
		
		if(sMimeType==null)
			sMimeType="application/octet-stream";
				
		response.setContentType(sMimeType);
		
		String sEncoding=new String(fileName.getBytes("euc-kr"), "ISO-8859-1");
		System.out.println("sEncoding : "+sEncoding);
		
		response.setHeader("Content-Disposition", "attachment; filename="+sEncoding);
		
		ServletOutputStream so=response.getOutputStream();
		BufferedOutputStream out2=null;
		BufferedInputStream in=null;
		try{
			// 웹 브라우저로의 출력 스트림 생성
			in = new BufferedInputStream(new FileInputStream(sFilePath));
			out2=new BufferedOutputStream(so);
			int readByte = 0; 
			while((readByte=in.read(b, 0 , b.length)) != -1){ 
				out2.write(b, 0, readByte);	
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{ 
			try{
				if(in != null) 
					in.close(); 
				if(so != null) 
					so.close();
				if(out2 != null) 
					out2.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		return null;
	}

}
