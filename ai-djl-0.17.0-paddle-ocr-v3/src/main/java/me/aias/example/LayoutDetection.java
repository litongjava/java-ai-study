package me.aias.example;

import ai.djl.modality.cv.Image;
import ai.djl.modality.cv.output.DetectedObjects;
import ai.djl.repository.zoo.Criteria;
import ai.djl.training.util.ProgressBar;

public final class LayoutDetection {

  String modelUrls = "https://aias-home.oss-cn-beijing.aliyuncs.com/models/ocr_models/ppyolov2_r50vd_dcn_365e_publaynet_infer.zip";

  public LayoutDetection() {
  }

  public Criteria<Image, DetectedObjects> criteria() {
    Criteria<Image, DetectedObjects> criteria = Criteria.builder()
        // engine
        .optEngine("PaddlePaddle")
        // type
        .setTypes(Image.class, DetectedObjects.class)
        // modelurl
        .optModelUrls(modelUrls)
        // .optModelUrls(
        // "/Users/calvin/.paddledet/inference_model/ppyolov2_r50vd_dcn_365e_publaynet/ppyolov2_r50vd_dcn_365e_publaynet_infer")
        // translator
        .optTranslator(new LayoutDetectionTranslator())
        // progrress
        .optProgress(new ProgressBar())
        //
        .optFilter("flavor", "server")
        // build
        .build();

    return criteria;
  }
}
