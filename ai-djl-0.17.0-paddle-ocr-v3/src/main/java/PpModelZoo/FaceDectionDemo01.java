package PpModelZoo;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import ai.djl.Application;
import ai.djl.paddlepaddle.zoo.PpModelZoo;
import ai.djl.repository.Artifact;
import ai.djl.repository.zoo.ModelNotFoundException;

public class FaceDectionDemo01 {

  public static void main(String[] args) {
    Map<Application, List<Artifact>> listModels;
    try {
      listModels = PpModelZoo.listModels();
      for(Map.Entry<Application, List<Artifact>> e:listModels.entrySet()) {
        System.out.println(e);
      }
    } catch (ModelNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    
  }
}
