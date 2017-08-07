package com.websystems.testtask.services.impl;

import com.websystems.testtask.entities.EquationInfo;
import com.websystems.testtask.models.EquationRequest;
import com.websystems.testtask.models.EquationResult;
import com.websystems.testtask.repositories.EquationInfoRepository;
import com.websystems.testtask.services.EquationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Павло on 03.08.2017.
 */
@Service
public class EquationServiceImpl implements EquationService {

    @Autowired
    private EquationInfoRepository repository;

    @Transactional
    public EquationResult solve(EquationRequest equationRequest) {
        Double d = StrictMath.pow(equationRequest.getB(),2) - 4 * equationRequest.getA() * equationRequest.getC();
        EquationResult result = new EquationResult();
        result.setX1((-1 * equationRequest.getB() + StrictMath.sqrt(d)) / (2 * equationRequest.getA()));
        result.setX2((-1 * equationRequest.getB() - StrictMath.sqrt(d)) / (2 * equationRequest.getA()));
        saveInfo(result, equationRequest);
        return result;
    }

    @Transactional
    public List<EquationInfo> allSolvedEquations() {
        return repository.findAll();
    }

    private void saveInfo(EquationResult result, EquationRequest request) {
        EquationInfo info = new EquationInfo();
        info.setA(request.getA());
        info.setB(request.getB());
        info.setC(request.getC());

        result.setX1(result.getX1().isNaN() || result.getX1().isInfinite() ? null : result.getX1());
        result.setX2(result.getX2().isNaN() || result.getX2().isInfinite() ? null : result.getX2());

        this.repository.save(info);
    }
}
