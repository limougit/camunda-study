package com.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.pvm.delegate.ActivityBehavior;
import org.camunda.bpm.engine.impl.pvm.delegate.ActivityExecution;

public class StartDelegate implements JavaDelegate {


    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("当前执行活动id" + execution.getCurrentActivityId());
    }
}
