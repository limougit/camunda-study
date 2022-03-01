import org.apache.ibatis.logging.LogFactory;
import org.camunda.bpm.dmn.engine.DmnDecisionTableResult;
import org.camunda.bpm.engine.*;
import org.camunda.bpm.engine.repository.Deployment;
import org.camunda.bpm.engine.repository.DeploymentBuilder;
import org.camunda.bpm.engine.repository.DeploymentWithDefinitions;
import org.camunda.bpm.engine.repository.ProcessDefinition;
import org.camunda.bpm.engine.test.ProcessEngineRule;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.*;

public class CamundaDemo {

    private ProcessEngine processEngine;
    private RepositoryService repositoryService;
    private RuntimeService runtimeService;
    private TaskService taskService;
    private DecisionService decisionService;

    @Before
    public void test(){
        processEngine = ProcessEngines.getDefaultProcessEngine();
        repositoryService = processEngine.getRepositoryService();
        runtimeService = processEngine.getRuntimeService();
        taskService = processEngine.getTaskService();
        decisionService = processEngine.getDecisionService();
    }

    @Test
   public void camundaTest(){

//       repositoryService.createDeployment().addClasspathResource("listenerDemo.bpmn").deploy();
       runtimeService.startProcessInstanceByKey("listenerDemo");
//        VariableMap variables = Variables.createVariables()
//                .putValue("season", "Spring")
//                .putValue("guestCount", 10);
//
//        DmnDecisionTableResult dishDecisionResult = decisionService.evaluateDecisionTableByKey("dish", variables);
//        String desiredDish = dishDecisionResult.getSingleEntry();
//        System.out.println(desiredDish);
    }
}
