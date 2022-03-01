package com.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class TransitionListener implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("连线监听器：" + execution.getCurrentTransitionId() + ":  " + execution.getCurrentActivityId());
    }
}
