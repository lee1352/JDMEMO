package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.ICloudService;

@Controller
public class ICloudController {
	@Autowired
	ICloudService service;
	
	ModelAndView mv=new ModelAndView();
	
	@RequestMapping("")
	public ModelAndView empty() {
		mv.addObject("change", "home.jsp");
		mv.addObject("list", service.list());
		mv.setViewName("/icloud/index");
		
		return mv;
	}
	@RequestMapping("/index")
	public ModelAndView index() {
		mv.addObject("change", "home.jsp");
		mv.addObject("list", service.list());
		mv.setViewName("/icloud/index");
		
		return mv;
	}
	@RequestMapping("/ICloud/index")
	public ModelAndView jsmemoIndex() {
		mv.addObject("change", "home.jsp");
		mv.addObject("list", service.list());
		mv.setViewName("/icloud/index");
		
		return mv;
	}
	
	
	@RequestMapping("/icloud/read")
	public ModelAndView read(int memoNum) {
		mv.addObject("change", "read.jsp");
		mv.addObject("memoNum", memoNum);
		mv.addObject("icloud", service.select(memoNum));
		mv.setViewName("/icloud/index");
		
		return mv;
	}
	
	@RequestMapping("/icloud/writeForm")
	public ModelAndView writeForm() {
		mv.addObject("change", "writeForm.jsp");
		mv.setViewName("/icloud/index");
		
		return mv;
	}
	@RequestMapping("/icloud/writeProc")
	public ModelAndView writeProc(String title, String content) {
		mv.addObject("change", "home.jsp");
		mv.addObject("icloud", service.insert(title, content)==1 ? "입력 성공":"입력 실패");
		mv.addObject("list", service.list());
		mv.setViewName("/icloud/index");
		
		return mv;
	}
	
	
	@RequestMapping("/icloud/updateForm")
	public ModelAndView updateForm(int memoNum, String title, String content) {
		mv.addObject("memoNum", memoNum);
		mv.addObject("title", title);
		mv.addObject("content", content);
		mv.addObject("change", "updateForm.jsp");
		mv.setViewName("/icloud/index");
		
		return mv;
	}
	@RequestMapping("/icloud/updateProc")
	public ModelAndView updateProc(int memoNum, String title, String content) {
		//System.out.println(memoNum);
		mv.addObject("change", "home.jsp");
		mv.addObject("icloud", service.update(memoNum, title, content)==1 ? "입력 성공":"입력 실패");
		mv.addObject("list", service.list());
		mv.setViewName("/icloud/index");
		
		return mv;
	}
	
	@RequestMapping("/icloud/delete")
	public ModelAndView deleteProc(int memoNum, String title, String content) {
		mv.addObject("change", "home.jsp");
		mv.addObject("icloud", service.delete(memoNum)==1 ? "입력 성공":"입력 실패");
		mv.addObject("list", service.list());
		mv.setViewName("/icloud/index");
		
		return mv;
	}
	
	
	
	
	
	
	
}