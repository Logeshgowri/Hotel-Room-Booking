package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import com.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\feature\\Adactin.feature", glue="com.stepdefinition")
public class RunnerFile extends BaseClass{
	@BeforeClass
	public static void browser(){
		browserlaunch();
		
	}

}
