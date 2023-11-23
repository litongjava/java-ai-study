package com.litongjava.ai.djl;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import ai.djl.modality.cv.ImageFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ImageFactoryDemo01 {
  public static void main(String[] args) {
    //fromFile();
    ImageFactory imageFactory = ImageFactory.getInstance();
  }

  private static void fromFile() {
    Path imageFile = Paths.get("src/test/resources/layout.jpg");
    ImageFactory imageFactory = ImageFactory.getInstance();
    try {
      // 获取image对象
      ai.djl.modality.cv.Image image = imageFactory.fromFile(imageFile);
      log.info("image:{}", image);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
