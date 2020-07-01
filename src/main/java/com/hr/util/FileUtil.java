package com.hr.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import com.hr.model.WorkVO;

public class FileUtil {
	public static void downloadFile(List<WorkVO> list, String filePath, HttpServletResponse resp) {
		UUID uid = UUID.randomUUID();

		String randomName = uid.toString() + ".txt";
		String path = filePath + "\\" + randomName;
		System.out.println(path);
		
		try {
			BufferedWriter fw = new BufferedWriter(new FileWriter(path, true));

			resp.setContentType("application/txt");
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

	public static String uploadFile(String uploadPath, String originalName, HttpServletResponse resp) throws Exception {

		resp.getOutputStream().flush();

		return "true";
	}
}
