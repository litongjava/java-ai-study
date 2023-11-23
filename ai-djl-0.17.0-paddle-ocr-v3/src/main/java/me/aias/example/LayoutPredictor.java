package me.aias.example;

import java.io.IOException;

import ai.djl.MalformedModelException;
import ai.djl.inference.Predictor;
import ai.djl.modality.cv.Image;
import ai.djl.modality.cv.output.DetectedObjects;
import ai.djl.repository.zoo.ModelNotFoundException;
import ai.djl.repository.zoo.ModelZoo;
import ai.djl.repository.zoo.ZooModel;

public class LayoutPredictor {

  private static Predictor<Image, DetectedObjects> layoutPredictor = null;
  private static ZooModel<Image, DetectedObjects> detectionModel = null;
  static {
    LayoutDetection layoutDection = new LayoutDetection();
    try {
      detectionModel = ModelZoo.loadModel(layoutDection.criteria());
      layoutPredictor = detectionModel.newPredictor();
    } catch (ModelNotFoundException | MalformedModelException | IOException e) {
      e.printStackTrace();
    }
  }

  public static Predictor<Image, DetectedObjects> get() {
    return layoutPredictor;
  }
}
