package me.aias.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import ai.djl.modality.cv.Image;
import ai.djl.modality.cv.output.DetectedObjects;

public class ImageUtils {

  /**
   * 保存图片,含检测框
   *
   * @author Calvin
   */
  public static void saveBoundingBoxImage(Image img, DetectedObjects detection, String name, String path)
      throws IOException {
    Path outputDir = Paths.get(path);
    Files.createDirectories(outputDir);
    Path imagePath = outputDir.resolve(name);

    // Make image copy with alpha channel because original image was jpg
    img.drawBoundingBoxes(detection);
    // OpenJDK can't save jpg with alpha channel
    img.save(Files.newOutputStream(imagePath), "png");
  }
}