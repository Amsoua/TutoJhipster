package com.amadou.tuto.jhpster.cucumber.stepdefs;

import com.amadou.tuto.jhpster.TutoJHipsterApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TutoJHipsterApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
