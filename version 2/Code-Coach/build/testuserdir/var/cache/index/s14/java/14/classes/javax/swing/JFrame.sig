����   4 � v w x y z | ~ AccessibleJFrame InnerClasses EXIT_ON_CLOSE I ConstantValue    defaultLookAndFeelDecoratedKey Ljava/lang/Object; defaultCloseOperation transferHandler Ljavax/swing/TransferHandler; rootPane Ljavax/swing/JRootPane; rootPaneCheckingEnabled Z accessibleContext 'Ljavax/accessibility/AccessibleContext; <init> ()V 
Exceptions  #(Ljava/awt/GraphicsConfiguration;)V org.netbeans.ParameterNames gc (Ljava/lang/String;)V title 5(Ljava/lang/String;Ljava/awt/GraphicsConfiguration;)V 	frameInit createRootPane ()Ljavax/swing/JRootPane; processWindowEvent (Ljava/awt/event/WindowEvent;)V e setDefaultCloseOperation (I)V 	operation getDefaultCloseOperation ()I setTransferHandler  (Ljavax/swing/TransferHandler;)V 
newHandler getTransferHandler ()Ljavax/swing/TransferHandler; update (Ljava/awt/Graphics;)V g setJMenuBar (Ljavax/swing/JMenuBar;)V menubar getJMenuBar ()Ljavax/swing/JMenuBar; isRootPaneCheckingEnabled ()Z setRootPaneCheckingEnabled (Z)V enabled addImpl *(Ljava/awt/Component;Ljava/lang/Object;I)V comp constraints index remove (Ljava/awt/Component;)V 	setLayout (Ljava/awt/LayoutManager;)V manager getRootPane setRootPane (Ljavax/swing/JRootPane;)V root setIconImage (Ljava/awt/Image;)V image getContentPane ()Ljava/awt/Container; setContentPane (Ljava/awt/Container;)V contentPane getLayeredPane ()Ljavax/swing/JLayeredPane; setLayeredPane (Ljavax/swing/JLayeredPane;)V layeredPane getGlassPane ()Ljava/awt/Component; setGlassPane 	glassPane getGraphics ()Ljava/awt/Graphics; repaint (JIIII)V time x y width height setDefaultLookAndFeelDecorated defaultLookAndFeelDecorated isDefaultLookAndFeelDecorated paramString ()Ljava/lang/String; getAccessibleContext )()Ljavax/accessibility/AccessibleContext; <clinit> 
SourceFile JFrame.java SourceID 0 CompilationID 1445081196774 javax/swing/JFrame java/awt/Frame javax/swing/WindowConstants javax/accessibility/Accessible javax/swing/RootPaneContainer � 1javax/swing/TransferHandler$HasGetTransferHandler HasGetTransferHandler #javax/swing/JFrame$AccessibleJFrame java/awt/HeadlessException javax/swing/TransferHandler !          
                                      #                                   !   "      !   #     $ %    & '      (  ) *      +  , -    . /      0  1 2    3 4      5  6 7      8  9 :    ; <    = >      ?  @ A      B C D  E F      B  G H      I  J %    K L      M  N O      P  Q R    S T      U  V W    X Y      Z  [ \    ] F      ^  _ `    a b     
 c d e f g 	 h >      i 	 j <    k l    m n    o     p    q r    s t    u 	          { }