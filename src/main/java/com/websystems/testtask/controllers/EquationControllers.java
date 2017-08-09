package com.websystems.testtask.controllers;

import com.websystems.testtask.models.EquationRequest;
import com.websystems.testtask.models.EquationResult;
import com.websystems.testtask.services.EquationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Павло on 03.08.2017.
 */
@Controller
public class EquationControllers {

    @Autowired
    private EquationService equationService;

    @RequestMapping(value = "/calculate")
   public ModelAndView calculate(EquationRequest request) {
        ModelAndView calculate = new ModelAndView("result");
        EquationResult result = this.equationService.solve(new EquationRequest(request.getA(), request.getB(), request.getC()));
        calculate.addObject("x1", result.getX1());
        calculate.addObject("x2", result.getX2());
        return calculate;
    }

    @RequestMapping(value = "/allequations")
    public ModelAndView allEquations() {
        ModelAndView mav = new ModelAndView("allequations");
        mav.addObject("equationsList", equationService.allSolvedEquations());
        return mav;
    }

    @RequestMapping(value = "/equation")
    public ModelAndView equation() {
        return new ModelAndView("equation");
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ModelAndView mMethodArgumentTypeMismatchExceptionHandler(MethodArgumentTypeMismatchException ex) {
        ModelAndView view = new ModelAndView("error");
        view.addObject("errorMassage", "Перевірте правильність введених данних!");
        view.addObject("errorClass", ex.getClass());
        return view;

    }

    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandle(Exception ex) {
        ModelAndView view = new ModelAndView("error");
        view.addObject("errorMassage", ex.getMessage());
        view.addObject("errorClass", ex.getClass());
        return view;
    }


}
