```shell
在M2上的测试结果
(base) ping@PingdeMacBook-Pro ai-djl-0.22.1-paddle-ocr-v4 % mvn exec:java -Dexec.mainClass="com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample"
[INFO] Scanning for projects...
...
01:02:31.263 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.repository.zoo.DefaultModelZoo - Scanning models in repo: class ai.djl.repository.SimpleRepository, file:/Users/ping/code/java/java-ai-study/ai-djl-0.22.1-paddle-ocr-v4/models/ch_PP-OCRv4_det_infer/inference.onnx
01:02:31.269 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.repository.zoo.ModelZoo - Loading model with Criteria:
	Application: UNDEFINED
	Input: interface ai.djl.modality.cv.Image
	Output: class ai.djl.ndarray.NDList
	Engine: OnnxRuntime
	ModelZoo: ai.djl.localmodelzoo

01:02:31.269 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.repository.zoo.ModelZoo - Searching model in specified model zoo: ai.djl.localmodelzoo
01:02:31.274 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.engine.Engine - Registering EngineProvider: PyTorch
01:02:31.275 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.engine.Engine - Registering EngineProvider: OnnxRuntime
01:02:31.276 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.engine.Engine - Found default engine: PyTorch
01:02:35.300 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.repository.zoo.ModelZoo - Checking ModelLoader: ai.djl.localmodelzoo:inference.onnx UNDEFINED [
	ai.djl.localmodelzoo/inference.onnx/inference.onnx {}
]
01:02:35.317 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.repository.MRL - Preparing artifact: file:/Users/ping/code/java/java-ai-study/ai-djl-0.22.1-paddle-ocr-v4/models/ch_PP-OCRv4_det_infer/inference.onnx, ai.djl.localmodelzoo/inference.onnx/inference.onnx {}
01:02:35.318 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.repository.SimpleRepository - Skip prepare for local repository.
Loading:     100% |████████████████████████████████████████|
01:02:36.330 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.util.cuda.CudaUtils - cudart library not found.
01:02:37.494 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.pytorch.jni.LibUtils - Using cache dir: /Users/ping/.djl.ai/pytorch/1.13.1-cpu-osx-x86_64
01:02:37.496 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] INFO ai.djl.pytorch.jni.LibUtils - Downloading https://publish.djl.ai/pytorch/1.13.1/cpu/osx-x86_64/native/lib/libtorch_cpu.dylib.gz ...
01:03:15.680 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] INFO ai.djl.pytorch.jni.LibUtils - Downloading https://publish.djl.ai/pytorch/1.13.1/cpu/osx-x86_64/native/lib/libiomp5.dylib.gz ...
01:03:16.098 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] INFO ai.djl.pytorch.jni.LibUtils - Downloading https://publish.djl.ai/pytorch/1.13.1/cpu/osx-x86_64/native/lib/libtorch.dylib.gz ...
01:03:16.183 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] INFO ai.djl.pytorch.jni.LibUtils - Downloading https://publish.djl.ai/pytorch/1.13.1/cpu/osx-x86_64/native/lib/libc10.dylib.gz ...
01:03:16.403 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.pytorch.jni.LibUtils - Loading native library: /Users/ping/.djl.ai/pytorch/1.13.1-cpu-osx-x86_64/libiomp5.dylib
01:03:16.499 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.pytorch.jni.LibUtils - Loading native library: /Users/ping/.djl.ai/pytorch/1.13.1-cpu-osx-x86_64/libc10.dylib
01:03:16.516 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.pytorch.jni.LibUtils - Loading native library: /Users/ping/.djl.ai/pytorch/1.13.1-cpu-osx-x86_64/libtorch_cpu.dylib
01:03:26.974 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.pytorch.jni.LibUtils - Loading native library: /Users/ping/.djl.ai/pytorch/1.13.1-cpu-osx-x86_64/libtorch.dylib
01:03:26.978 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] INFO ai.djl.pytorch.jni.LibUtils - Downloading jni https://publish.djl.ai/pytorch/1.13.1/jnilib/0.22.1/osx-x86_64/cpu/libdjl_torch.dylib to cache ...
01:03:29.398 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.pytorch.jni.LibUtils - Loading native library: /Users/ping/.djl.ai/pytorch/1.13.1-cpu-osx-x86_64/0.22.1-libdjl_torch.dylib
01:03:29.513 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] INFO ai.djl.pytorch.engine.PtEngine - PyTorch graph executor optimizer is enabled, this may impact your inference latency and throughput. See: https://docs.djl.ai/docs/development/inference_performance_optimization.html#graph-executor-optimization
01:03:29.514 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] INFO ai.djl.pytorch.engine.PtEngine - Number of inter-op threads is 4
01:03:29.514 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] INFO ai.djl.pytorch.engine.PtEngine - Number of intra-op threads is 4
01:03:29.617 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.repository.zoo.DefaultModelZoo - Scanning models in repo: class ai.djl.repository.SimpleRepository, file:/Users/ping/code/java/java-ai-study/ai-djl-0.22.1-paddle-ocr-v4/models/ch_PP-OCRv4_rec_infer/inference.onnx
01:03:29.618 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.repository.zoo.ModelZoo - Loading model with Criteria:
	Application: UNDEFINED
	Input: interface ai.djl.modality.cv.Image
	Output: class java.lang.String
	Engine: OnnxRuntime
	ModelZoo: ai.djl.localmodelzoo

01:03:29.618 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.repository.zoo.ModelZoo - Searching model in specified model zoo: ai.djl.localmodelzoo
01:03:29.618 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.repository.zoo.ModelZoo - Checking ModelLoader: ai.djl.localmodelzoo:inference.onnx UNDEFINED [
	ai.djl.localmodelzoo/inference.onnx/inference.onnx {}
]
01:03:29.618 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.repository.MRL - Preparing artifact: file:/Users/ping/code/java/java-ai-study/ai-djl-0.22.1-paddle-ocr-v4/models/ch_PP-OCRv4_rec_infer/inference.onnx, ai.djl.localmodelzoo/inference.onnx/inference.onnx {}
01:03:29.618 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] DEBUG ai.djl.repository.SimpleRepository - Skip prepare for local repository.
Loading:     100% |████████████████████████████████████████|
[W LegacyTypeDispatch.h:79] Warning: AutoNonVariableTypeMode is deprecated and will be removed in 1.10 release. For kernel implementations please use AutoDispatchBelowADInplaceOrView instead, If you are looking for a user facing API to enable running your inference-only workload, please use c10::InferenceMode. Using AutoDispatchBelowADInplaceOrView in user code is under risk of producing silent wrong result in some edge cases. See Note [AutoDispatchBelowAutograd] for more details. (function operator())
time: 847
纯臻营养护发素 
产品信息/参数 
（45元／每公斤，100公斤起订） 
每瓶22元，1000瓶起订） 
【品牌】：代加工方式/OEMODM 
【品名】：纯臻营养护发素 
【产品编号】：YM-X-3011 ODMOEM 
【净含量】：220ml 
【适用人群】：适合所有肤质 
【主要成分】：鲸蜡硬脂醇、燕麦β-葡聚 
糖、椰油酰胺丙基甜菜碱、泛醌 （成品包材） 
【主要功能】：可紧致头发磷层，从而达到 
即时持久改善头发光泽的效果，给干燥的头 
发足够的滋养 

01:03:32.371 [com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample.main()] INFO com.litongjava.djl.paddle.ocr.v4.OcrV4RecExample - [com.litongjava.djl.paddle.ocr.v4.common.RotatedBox@2640400a, com.litongjava.djl.paddle.ocr.v4.common.RotatedBox@72fcaf0c, com.litongjava.djl.paddle.ocr.v4.common.RotatedBox@572002ee, com.litongjava.djl.paddle.ocr.v4.common.RotatedBox@5da5f71e, com.litongjava.djl.paddle.ocr.v4.common.RotatedBox@79c1bcb0, com.litongjava.djl.paddle.ocr.v4.common.RotatedBox@6e52e84b, com.litongjava.djl.paddle.ocr.v4.common.RotatedBox@3932b01d, com.litongjava.djl.paddle.ocr.v4.common.RotatedBox@4bddbd22, com.litongjava.djl.paddle.ocr.v4.common.RotatedBox@3f0dacd5, com.litongjava.djl.paddle.ocr.v4.common.RotatedBox@46641bcf, com.litongjava.djl.paddle.ocr.v4.common.RotatedBox@6afae946, com.litongjava.djl.paddle.ocr.v4.common.RotatedBox@4c686d96, com.litongjava.djl.paddle.ocr.v4.common.RotatedBox@1ed10bca, com.litongjava.djl.paddle.ocr.v4.common.RotatedBox@788dc1bc, com.litongjava.djl.paddle.ocr.v4.common.RotatedBox@4500a732, com.litongjava.djl.paddle.ocr.v4.common.RotatedBox@4a0b76d9]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  01:06 min
[INFO] Finished at: 2023-11-23T01:03:32-10:00
[INFO] ------------------------------------------------------------------------
```