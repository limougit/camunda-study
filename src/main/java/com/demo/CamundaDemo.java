package com.demo;

import org.apache.ibatis.logging.LogFactory;
import org.camunda.bpm.engine.*;
import org.camunda.bpm.engine.repository.Deployment;
import org.camunda.bpm.engine.repository.DeploymentBuilder;
import org.camunda.bpm.engine.repository.DeploymentWithDefinitions;
import org.camunda.bpm.engine.repository.ProcessDefinition;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CamundaDemo {


    public static void main(String[] args) {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        RepositoryService repositoryService = processEngine.getRepositoryService();
//        List<ProcessDefinition> demo1 = repositoryService.createProcessDefinitionQuery().processDefinitionKey("demo").list();
//        demo1.forEach(System.out::println);

//        RepositoryService repositoryService = processEngine.getRepositoryService();
//        DeploymentBuilder deploymentBuilder = repositoryService.createDeployment();
//        DeploymentWithDefinitions deploymentWithDefinitions = deploymentBuilder.addClasspathResource("demo.bpmn")
//                .addClasspathResource("demo1.bpmn").name("第二次部署").deployWithResult();
//        for (ProcessDefinition processDefinition : deploymentWithDefinitions.getDeployedProcessDefinitions()) {
//            String key = processDefinition.getKey();
//            String resourceName = processDefinition.getResourceName();
//            String name = processDefinition.getName();
//            System.out.println("流程key = " + key + ",资源名称 = " + resourceName + "流程名称 = " + name );
//        }
//        String id = deploymentWithDefinitions.getId();
//        String name = deploymentWithDefinitions.getName();
//        Date deploymentTime = deploymentWithDefinitions.getDeploymentTime();
//        String source = deploymentWithDefinitions.getSource();
//        System.out.println("流程部署的id = " + id + " 名称 = " + name + "部署时间 + " + deploymentTime + "资源 " + source);
//        RuntimeService runtimeService = processEngine.getRuntimeService();
//        runtimeService.startProcessInstanceByKey("demo");
//        TaskService taskService = processEngine.getTaskService();
//        Map<String,Object> variables = new HashMap<>();
//        variables.put("localKey1","localValue1");
//        taskService.complete("315");

    }
}
