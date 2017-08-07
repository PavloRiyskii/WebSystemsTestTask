package com.websystems.testtask.services;

import com.websystems.testtask.entities.EquationInfo;
import com.websystems.testtask.models.EquationRequest;
import com.websystems.testtask.models.EquationResult;

import java.util.List;

/**
 * Created by Павло on 03.08.2017.
 */
public interface EquationService {
    EquationResult solve(EquationRequest equationRequest);
    List<EquationInfo> allSolvedEquations();
}
