package com.example.spring_application_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApplicationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApplicationDemoApplication.class, args);
	}

}

//todo -> These are the default life cycle phases in maven::

//todo ->  validate - validate the project is correct and all necessary information is available
//todo -> compile - compile the source code of the project
//todo -> test - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
//todo -> package - take the compiled code and package it in its distributable format, such as a JAR.
//todo -> verify - run any checks on results of integration tests to ensure quality criteria are met
//todo -> install - install the package into the local repository, for use as a dependency in other projects locally
//todo -> deploy - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.