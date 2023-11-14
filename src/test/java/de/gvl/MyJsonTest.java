package de.gvl;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class MyJsonTest {

  @Test
  void contextLoads() {
    // nothing to do. Just verify that the bootstrapping of the slice test @JsonTest is done

    // the error log shows something like this

    //Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'org.springframework.cloud.task.configuration.TaskLifecycleConfiguration': Un
    //satisfied dependency expressed through constructor parameter 0; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'org.spr
    //ingframework.cloud.task.configuration.TaskProperties' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {}
    //Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'org.springframework.cloud.task.configuration.TaskProperties' available: expected
    //at least 1 bean which qualifies as autowire candidate. Dependency annotations: {}
  }
}
