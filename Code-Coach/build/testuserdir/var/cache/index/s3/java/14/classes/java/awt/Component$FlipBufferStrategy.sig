����   4 F > @ 
numBuffers I caps Ljava/awt/BufferCapabilities; 
drawBuffer Ljava/awt/Image; drawVBuffer Ljava/awt/image/VolatileImage; validatedContents Z width height this$0 Ljava/awt/Component; <init> 5(Ljava/awt/Component;ILjava/awt/BufferCapabilities;)V 
Exceptions A org.netbeans.ParameterNames createBuffers !(ILjava/awt/BufferCapabilities;)V updateInternalBuffers ()V getBackBuffer ()Ljava/awt/Image; flip C FlipContents InnerClasses -(Ljava/awt/BufferCapabilities$FlipContents;)V 
flipAction flipSubRegion 1(IIIILjava/awt/BufferCapabilities$FlipContents;)V x1 y1 x2 y2 destroyBuffers getCapabilities ()Ljava/awt/BufferCapabilities; getDrawGraphics ()Ljava/awt/Graphics; 
revalidate (Z)V 	checkSize contentsLost ()Z contentsRestored show showSubRegion (IIII)V dispose 
SourceFile Component.java SourceID 0 CompilationID 1447397356030 D %java/awt/Component$FlipBufferStrategy FlipBufferStrategy java/awt/image/BufferStrategy java/awt/AWTException E (java/awt/BufferCapabilities$FlipContents java/awt/Component java/awt/BufferCapabilities !                      	 
                                                                            !   " #     
 $ % & ' !  (     ) *    + ,    -      - .      /  0 1    2 1    3      4 5      $ % & '  6     7    8 9    : ;    <       B    = ? 