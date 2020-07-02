package com.hr.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

import com.hr.model.WorkVO;

public class FileUtil {
	public static void downloadFile(List<WorkVO> list, String filePath, HttpServletResponse resp) {
		UUID uid = UUID.randomUUID();

		String randomName = uid.toString() + ".txt";
		String path = filePath + "\\" + randomName;
		System.out.println(path);
		
		try {
			BufferedWriter fw = new BufferedWriter(new FileWriter(path, true));
			
			resp.setContentType("application/octet-stream");
			resp.setHeader("Content-Disposition", "attachment; filename=\"" + randomName + "\";");
			resp.setHeader("Content-Transfer-Encoding", "binary");

			for (WorkVO vo : list) {
				StringBuffer sb = new StringBuffer();
				sb.append(vo.getId() + " ");
				sb.append(vo.getName() + " ");
				sb.append(vo.getDepartment() + " ");
				sb.append(vo.getStaff() + " ");
				sb.append(vo.getDate() + " ");
				sb.append(vo.getDay() + " ");
				sb.append(vo.getStartTime() + " ");
				sb.append(vo.getEndTime() + " ");
				sb.append(vo.getAddTime() + " ");
				sb.append(vo.getWorkCode() + "\n");
				fw.write(sb.toString());
			}
			Path file = Paths.get(filePath, randomName);
			Files.copy(file, resp.getOutputStream());
			resp.getOutputStream().flush();

			fw.flush();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}

	}

	public static List<WorkVO> uploadFile( MultipartFile file,HttpServletRequest req,HttpServletResponse resp)  {

		
		List<WorkVO> a = new ArrayList<WorkVO>();
		WorkVO vo;
		
		try {
			String originalName = file.getOriginalFilename();
			String ext = originalName.substring(originalName.lastIndexOf(".") + 1);
			if(!ext.equalsIgnoreCase("txt")) {
				return null;
			}
			InputStreamReader isr = new InputStreamReader(file.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			String line;
		
			while((line = br.readLine()) != null) {
				String arr[] = line.split(" ");
				System.out.println(line);
				vo  = new WorkVO();
				vo.setId(Integer.parseInt(arr[0]));
				vo.setName(arr[1]);
				vo.setDepartment(arr[2]);
				vo.setStaff(arr[3]);
				vo.setDate(Date.valueOf(arr[4]));
				vo.setDay(arr[5]);
				vo.setStartTime(arr[6]);
				vo.setEndTime(arr[7]);
				vo.setAddTime(arr[8]);
				vo.setWorkCode(arr[9]);
				a.add(vo);
			}
			
	
		} catch (Exception e) {
			e.printStackTrace();
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		
		return a;

	}
}
