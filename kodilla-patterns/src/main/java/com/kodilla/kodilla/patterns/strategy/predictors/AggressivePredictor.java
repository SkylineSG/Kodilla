package com.kodilla.kodilla.patterns.strategy.predictors;

import com.kodilla.kodilla.patterns.strategy.BuyPredictor;

public class AggressivePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] Buy stock of XYZ";
    }
}