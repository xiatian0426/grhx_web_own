package com.acc.controller;

import com.acc.exception.ExceptionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@Controller
@RequestMapping(value="/jess")
public class JessController {
	private static Logger _logger = LoggerFactory.getLogger(JessController.class);
	
	/**
	 * 对你说(第一封信)
	 * @param request
	 * @param response
	 * @param model
	 * @return 
	 * @throws Exception
	 */
	@RequestMapping(value = "/oneLetter", method = RequestMethod.GET)
	public ModelAndView oneLetter (ModelAndView mav, final HttpServletRequest request) {
		Map<String, Object> model = mav.getModel();
		try {
			mav=new ModelAndView("/jess/oneLetter", model);
		} catch (Exception e) {
			_logger.error("转到对你说(第一封信)失败：" + ExceptionUtil.getMsg(e));
			mav = new ModelAndView("/common/erroprom", model);
		}
		return mav;
	}
}
