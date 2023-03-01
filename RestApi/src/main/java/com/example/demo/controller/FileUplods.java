package com.example.demo.controller;

import org.omg.PortableServer.Servant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.helper.FileUplodsHelper;

@RestController
public class FileUplods

{    
	@Autowired
	private FileUplodsHelper fileuolodshelper;

	@PostMapping("/Uplods-file")
	public ResponseEntity<String>uplodsFile(@RequestParam("image") MultipartFile file)
	{
		
		
		
			

		/*	System.out.println(file.getOriginalFilename());
			System.out.println(file.getSize());
			System.out.println(file.getContentType());
			System.out.println(file.getName());
			return ResponseEntity.ok("Welcome to my projet & have a nice day");
			
			*/
	// file upload codes
		
		try {
			
			boolean f = fileuolodshelper.uploadFile(file);
			
			if(f)
			{
				//return ResponseEntity.ok("File Uploads Successful");
				// Dynamic uoloads
				return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/image/").path(file.getOriginalFilename()).toUriString());
				
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Somthing went wrong & try Again");
		
		
	}

}
