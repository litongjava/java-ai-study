package me.aias.example;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import ai.djl.ModelException;
import ai.djl.inference.Predictor;
import ai.djl.modality.cv.Image;
import ai.djl.modality.cv.ImageFactory;
import ai.djl.modality.cv.output.DetectedObjects;
import ai.djl.translate.TranslateException;
import lombok.extern.slf4j.Slf4j;

/**
 * 布局检测.
 */
@Slf4j
public final class LayoutDetectionExample {

  public static void main(String[] args) throws IOException, ModelException, TranslateException {
    log.info("start loding model");
    Predictor<Image, DetectedObjects> layoutPredictor = LayoutPredictor.get();
    log.info("end loding model");

    Path imageFile = Paths.get("src/test/resources/layout.jpg");
    // 获取image对象
    Image image = ImageFactory.getInstance().fromFile(imageFile);

    // 运行处理
    long start = System.currentTimeMillis();
    DetectedObjects process = process(layoutPredictor, image);
    long end = System.currentTimeMillis();
    System.out.println((end - start) + ":(ms)");
    //no filter,14339:(ms)
    //filter 14282:(ms)
//    log.info("toString");
//    log.info(process.toString());
//    log.info("toJSON");
//    log.info(process.toJson());
//    process(layoutPredictor, image);
//    process(layoutPredictor, image);
    log.info("end");
    // 画出矩形区域
    // ImageUtils.saveBoundingBoxImage(image, detections,"layout_detect_result.png", "build/output");
    // log.info("{}", detections);
  }

  private static DetectedObjects process(Predictor<Image, DetectedObjects> layoutPredictor, Image image)
      throws TranslateException {
    // 运行推理
    log.info("start predict");
    DetectedObjects detections = layoutPredictor.predict(image);
    log.info("start end");
    // 遍历推理集合
    List<DetectedObjects.DetectedObject> boxes = detections.items();
    for (DetectedObjects.DetectedObject result : boxes) {
      System.out.println(result.getClassName() + " : " + result.getProbability());
    }
    return detections;
  }
}
