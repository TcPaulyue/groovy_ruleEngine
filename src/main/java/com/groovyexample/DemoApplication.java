package com.groovyexample;

import com.groovyexample.groovy.bean.RuleEngineExecuteContext;
import com.groovyexample.groovy.service.GroovyScriptService;
import com.groovyexample.groovy.service.GroovyScriptTemplate;
import com.groovyexample.groovy.service.impl.RuleEngineGroovyModuleRuleExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    RuleEngineGroovyModuleRuleExecutor ruleEngineGroovyModuleRuleExecutor;

    @Autowired
    GroovyScriptService groovyScriptService;

    @Autowired
    GroovyScriptTemplate groovyScriptTemplate;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String scriptClassName = "testGroovy";
        //这一部分String的获取逻辑进行可配置化
        String StrategyLogicUnit = "if(context >= 0 ){\n" +
                "            result = 100 \n" +
                "            return true\n" +
                "        }\n" +
                "        ";


        ruleEngineGroovyModuleRuleExecutor.praseAndCache(scriptClassName,StrategyLogicUnit);

        RuleEngineExecuteContext context = new RuleEngineExecuteContext();
        Map<String,Object> map = new HashMap<>();
        map.put("context",100);
        map.put("result",20);
        context.setData(map);
        Object o = groovyScriptService.fragmentEval(context, scriptClassName);
        System.out.println("+++++++++++result: "+o);


    }
}
