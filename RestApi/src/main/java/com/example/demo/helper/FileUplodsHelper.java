package com.example.demo.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUplodsHelper {
	
	//public final String UPLOAD_DIR = "C:/Users/TN1047/PRACTICE/RestApi/src/main/resources/static/image";
	// Dynamic uploading
	
	public final String UPLOAD_DIR = new ClassPathResource("static/image/").getFile().getAbsolutePath();
	public FileUplodsHelper() throws IOException
	{
		
	}
	
	public boolean uploadFile(MultipartFile multipartfile)
	{
		boolean f = false;
		try {
			InputStream is = multipartfile.getInputStream();
			byte data[] = new byte[is.available()];
			is.read(data);
			// write 
			FileOutputStream fos = new FileOutputStream(UPLOAD_DIR+File.separator+multipartfile.getOriginalFilename());
			fos.write(data);
			fos.flush();
			fos.close();
			f = true;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}
