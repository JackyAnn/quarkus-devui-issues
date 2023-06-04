package org.acme;

import io.quarkus.jsonb.JsonbConfigCustomizer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.NormalScope;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Singleton;
import jakarta.json.bind.JsonbConfig;
import jakarta.json.bind.config.PropertyVisibilityStrategy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author JackyAnn
 */
@Singleton
public class JsonConfigCustomizer implements JsonbConfigCustomizer {
  @Override
  public void customize(JsonbConfig jsonbConfig) {
    jsonbConfig.withFormatting(true);
  }

  @Produces
  @ApplicationScoped
  public ApplicationRecord create1(){
    return new ApplicationRecord("ApplicationRecord");
  }

  @Produces
  @Singleton
  public SingletonRecord create2(){
    return new SingletonRecord("SingletonRecord");
  }

  public record ApplicationRecord(String name){

  }

  public record SingletonRecord(String name){

  }

}
