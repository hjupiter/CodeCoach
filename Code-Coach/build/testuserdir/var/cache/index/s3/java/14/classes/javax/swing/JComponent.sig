����   4  ReadObjectCallback InnerClasses AccessibleJComponent KeyboardState	 	IntVector
 ActionStandin 	uiClassID Ljava/lang/String; ConstantValue readObjectCallbacks Ljava/util/Hashtable; 	Signature ]Ljava/util/Hashtable<Ljava/io/ObjectInputStream;Ljavax/swing/JComponent$ReadObjectCallback;>; !managingFocusForwardTraversalKeys Ljava/util/Set; (Ljava/util/Set<Ljavax/swing/KeyStroke;>; "managingFocusBackwardTraversalKeys NOT_OBSCURED I     PARTIALLY_OBSCURED    COMPLETELY_OBSCURED    DEBUG_GRAPHICS_LOADED Z INPUT_VERIFIER_SOURCE_KEY Ljava/lang/Object; isAlignmentXSet 
alignmentX F isAlignmentYSet 
alignmentY ui Ljavax/swing/plaf/ComponentUI; listenerList %Ljavax/swing/event/EventListenerList; clientProperties Ljavax/swing/ArrayTable; vetoableChangeSupport "Ljava/beans/VetoableChangeSupport; autoscrolls border Ljavax/swing/border/Border; flags inputVerifier Ljavax/swing/InputVerifier; verifyInputWhenFocusTarget paintingChild Ljava/awt/Component; WHEN_FOCUSED "WHEN_ANCESTOR_OF_FOCUSED_COMPONENT WHEN_IN_FOCUSED_WINDOW UNDEFINED_CONDITION���� KEYBOARD_BINDINGS_KEY WHEN_IN_FOCUSED_WINDOW_BINDINGS TOOL_TIP_TEXT_KEY 
NEXT_FOCUS 	popupMenu Ljavax/swing/JPopupMenu; IS_DOUBLE_BUFFERED ANCESTOR_USING_BUFFER IS_PAINTING_TILE 	IS_OPAQUE    KEY_EVENTS_ENABLED    FOCUS_INPUTMAP_CREATED    ANCESTOR_INPUTMAP_CREATED    WIF_INPUTMAP_CREATED    ACTIONMAP_CREATED    CREATED_DOUBLE_BUFFER   	 IS_PRINTING    IS_PRINTING_ALL    IS_REPAINTING    WRITE_OBJ_COUNTER_FIRST    
RESERVED_1    
RESERVED_2    
RESERVED_3    
RESERVED_4    
RESERVED_5    
RESERVED_6    WRITE_OBJ_COUNTER_LAST    REQUEST_FOCUS_DISABLED    INHERITS_POPUP_MENU    
OPAQUE_SET    AUTOSCROLLS_SET     FOCUS_TRAVERSAL_KEYS_FORWARD_SET    !FOCUS_TRAVERSAL_KEYS_BACKWARD_SET    revalidateRunnableScheduled +Ljava/util/concurrent/atomic/AtomicBoolean; tempRectangles Ljava/util/List; &Ljava/util/List<Ljava/awt/Rectangle;>; focusInputMap Ljavax/swing/InputMap; ancestorInputMap windowInputMap Ljavax/swing/ComponentInputMap; 	actionMap Ljavax/swing/ActionMap; defaultLocale componentObtainingGraphicsFrom "componentObtainingGraphicsFromLock 
aaTextInfo focusController  Lsun/awt/RequestFocusController; safelyGetGraphics )(Ljava/awt/Component;)Ljava/awt/Graphics; org.netbeans.ParameterNames c =(Ljava/awt/Component;Ljava/awt/Component;)Ljava/awt/Graphics; root getGraphicsInvoked (Ljava/awt/Component;)V  isComponentObtainingGraphicsFrom (Ljava/awt/Component;)Z $getManagingFocusForwardTraversalKeys ()Ljava/util/Set; *()Ljava/util/Set<Ljavax/swing/KeyStroke;>; %getManagingFocusBackwardTraversalKeys fetchRectangle ()Ljava/awt/Rectangle; recycleRectangle (Ljava/awt/Rectangle;)V rect setInheritsPopupMenu (Z)V value getInheritsPopupMenu ()Z setComponentPopupMenu (Ljavax/swing/JPopupMenu;)V popup getComponentPopupMenu ()Ljavax/swing/JPopupMenu; <init> ()V updateUI setUI !(Ljavax/swing/plaf/ComponentUI;)V newUI uninstallUIAndProperties getUIClassID ()Ljava/lang/String; getComponentGraphics ((Ljava/awt/Graphics;)Ljava/awt/Graphics; g paintComponent (Ljava/awt/Graphics;)V paintChildren paintBorder update paint paintForceDoubleBuffered 
isPainting adjustPaintFlags printAll print printComponent printChildren printBorder isPaintingTile isPaintingForPrint isManagingFocus 
Deprecated RuntimeVisibleAnnotations Ljava/lang/Deprecated; registerNextFocusableComponent nextFocusableComponent  deregisterNextFocusableComponent setNextFocusableComponent 
aComponent getNextFocusableComponent ()Ljava/awt/Component; setRequestFocusEnabled requestFocusEnabled isRequestFocusEnabled requestFocus (Z)Z 	temporary requestFocusInWindow 	grabFocus setVerifyInputWhenFocusTarget getVerifyInputWhenFocusTarget getFontMetrics '(Ljava/awt/Font;)Ljava/awt/FontMetrics; font setPreferredSize (Ljava/awt/Dimension;)V preferredSize getPreferredSize ()Ljava/awt/Dimension; Ljava/beans/Transient; setMaximumSize maximumSize getMaximumSize setMinimumSize minimumSize getMinimumSize contains (II)Z x y 	setBorder (Ljavax/swing/border/Border;)V 	getBorder ()Ljavax/swing/border/Border; 	getInsets ()Ljava/awt/Insets; $(Ljava/awt/Insets;)Ljava/awt/Insets; insets getAlignmentY ()F setAlignmentY (F)V getAlignmentX setAlignmentX setInputVerifier (Ljavax/swing/InputVerifier;)V getInputVerifier ()Ljavax/swing/InputVerifier; getGraphics ()Ljava/awt/Graphics; setDebugGraphicsOptions (I)V debugOptions getDebugGraphicsOptions ()I shouldDebugGraphics registerKeyboardAction L(Ljava/awt/event/ActionListener;Ljava/lang/String;Ljavax/swing/KeyStroke;I)V anAction aCommand 
aKeyStroke 
aCondition registerWithKeyboardManager 	onlyIfNew unregisterWithKeyboardManager componentInputMapChanged "(Ljavax/swing/ComponentInputMap;)V inputMap (Ljavax/swing/KeyStroke;)V :(Ljava/awt/event/ActionListener;Ljavax/swing/KeyStroke;I)V unregisterKeyboardAction getRegisteredKeyStrokes ()[Ljavax/swing/KeyStroke; getConditionForKeyStroke (Ljavax/swing/KeyStroke;)I getActionForKeyStroke 8(Ljavax/swing/KeyStroke;)Ljava/awt/event/ActionListener; resetKeyboardActions setInputMap (ILjavax/swing/InputMap;)V 	condition map getInputMap (I)Ljavax/swing/InputMap; ()Ljavax/swing/InputMap; setActionMap (Ljavax/swing/ActionMap;)V am getActionMap ()Ljavax/swing/ActionMap; (IZ)Ljavax/swing/InputMap; create (Z)Ljavax/swing/ActionMap; getBaseline (II)I width height getBaselineResizeBehavior BaselineResizeBehavior -()Ljava/awt/Component$BaselineResizeBehavior; requestDefaultFocus 
setVisible aFlag 
setEnabled enabled setForeground (Ljava/awt/Color;)V fg setBackground bg setFont (Ljava/awt/Font;)V getDefaultLocale ()Ljava/util/Locale; setDefaultLocale (Ljava/util/Locale;)V l processComponentKeyEvent (Ljava/awt/event/KeyEvent;)V e processKeyEvent processKeyBinding 5(Ljavax/swing/KeyStroke;Ljava/awt/event/KeyEvent;IZ)Z ks pressed processKeyBindings (Ljava/awt/event/KeyEvent;Z)Z "processKeyBindingsForAllComponents 1(Ljava/awt/event/KeyEvent;Ljava/awt/Container;Z)Z 	container setToolTipText (Ljava/lang/String;)V text getToolTipText /(Ljava/awt/event/MouseEvent;)Ljava/lang/String; event getToolTipLocation -(Ljava/awt/event/MouseEvent;)Ljava/awt/Point; getPopupLocation createToolTip ()Ljavax/swing/JToolTip; scrollRectToVisible aRect setAutoscrolls getAutoscrolls setTransferHandler  (Ljavax/swing/TransferHandler;)V 
newHandler getTransferHandler ()Ljavax/swing/TransferHandler; dropLocationForPoint DropLocation <(Ljava/awt/Point;)Ljavax/swing/TransferHandler$DropLocation; p setDropLocation Q(Ljavax/swing/TransferHandler$DropLocation;Ljava/lang/Object;Z)Ljava/lang/Object; location state forDrop dndDone processMouseEvent (Ljava/awt/event/MouseEvent;)V processMouseMotionEvent superProcessMouseMotionEvent setCreatedDoubleBuffer newValue getCreatedDoubleBuffer enable disable getClientProperties ()Ljavax/swing/ArrayTable; getClientProperty &(Ljava/lang/Object;)Ljava/lang/Object; key putClientProperty '(Ljava/lang/Object;Ljava/lang/Object;)V clientPropertyChanged 9(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V oldValue setUIProperty '(Ljava/lang/String;Ljava/lang/Object;)V propertyName setFocusTraversalKeys (ILjava/util/Set;)V -(ILjava/util/Set<+Ljava/awt/AWTKeyStroke;>;)V id 
keystrokes isLightweightComponent #org.netbeans.SourceLevelAnnotations Ljava/lang/SuppressWarnings; deprecation reshape (IIII)V w h 	getBounds *(Ljava/awt/Rectangle;)Ljava/awt/Rectangle; rv getSize *(Ljava/awt/Dimension;)Ljava/awt/Dimension; getLocation "(Ljava/awt/Point;)Ljava/awt/Point; getX getY getWidth 	getHeight isOpaque 	setOpaque rectangleIsObscured (IIII)Z computeVisibleRect +(Ljava/awt/Component;Ljava/awt/Rectangle;)V visibleRect getVisibleRect firePropertyChange (Ljava/lang/String;ZZ)V (Ljava/lang/String;II)V (Ljava/lang/String;CC)V fireVetoableChange 9(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V 
Exceptions addVetoableChangeListener &(Ljava/beans/VetoableChangeListener;)V listener removeVetoableChangeListener getVetoableChangeListeners &()[Ljava/beans/VetoableChangeListener; getTopLevelAncestor ()Ljava/awt/Container; getAncestorNotifier  ()Ljavax/swing/AncestorNotifier; addAncestorListener '(Ljavax/swing/event/AncestorListener;)V removeAncestorListener getAncestorListeners '()[Ljavax/swing/event/AncestorListener; getListeners -(Ljava/lang/Class;)[Ljava/util/EventListener; :<T::Ljava/util/EventListener;>(Ljava/lang/Class<TT;>;)[TT; listenerType 	addNotify removeNotify repaint (JIIII)V tm r 
revalidate isValidateRoot Ljava/lang/Override; isOptimizedDrawingEnabled isPaintingOrigin paintImmediately alwaysOnTop setPaintingChild _paintImmediately paintToOffscreen (Ljava/awt/Graphics;IIIIII)V maxX maxY getObscuredState (IIIII)I 	compIndex checkIfChildObscuredBySibling setFlag (IZ)V aValue getFlag (I)Z setWriteObjCounter (Ljavax/swing/JComponent;B)V comp count getWriteObjCounter (Ljavax/swing/JComponent;)B setDoubleBuffered isDoubleBuffered getRootPane ()Ljavax/swing/JRootPane; compWriteObjectNotify 
readObject (Ljava/io/ObjectInputStream;)V s writeObject (Ljava/io/ObjectOutputStream;)V paramString hide lambda$revalidate$59 <clinit> 
SourceFile JComponent.java SourceID 0 CompilationID 1447397356864 javax/swing/JComponent java/awt/Container java/io/Serializable 1javax/swing/TransferHandler$HasGetTransferHandler HasGetTransferHandler )javax/swing/JComponent$ReadObjectCallback +javax/swing/JComponent$AccessibleJComponent $javax/swing/JComponent$KeyboardState  javax/swing/JComponent$IntVector $javax/swing/JComponent$ActionStandin ComponentUI _KeyboardBindings _WhenInFocusedWindow ToolTipText 	nextFocus JComponent.defaultLocale )java/awt/Component$BaselineResizeBehavior (javax/swing/TransferHandler$DropLocation  java/beans/PropertyVetoException java/io/IOException  java/lang/ClassNotFoundException javax/swing/TransferHandler java/awt/Component!      F                   
         
                             !       "  # $    % &    ' $    ( )    * $    + )   � , -    . /   � 0 1    2 3    4 $    5 6    7     8 9    : $   � ; <    =         >          ?       "  @       A  B       C  D       E  F       G  H       I  J K    L         M          N       "  O       P  Q       R  S       T  U       V  W       X  Y       Z  [       \  ]       ^  _       `  a       b  c       d  e       f  g       h  i       j  k       l  m       n  o       p  q       r  s       t  u       v  w       x  y       z  {       |  }       ~ �  �   
 � �      �  � �    � �    � �    � �    �       � 
 � <   
 � &   � � &    � �   �  � �  �    �  � �  �    � �  � �  �    � 
 � �  �    �  � �      �  � �      � 
 � �   
 � �  �    �  � �  �    �  � �    � �  �    �  � �    � �    � �    � �  �    �  � �    � �    � �  �    �  � �  �    �  � �  �    �  � �  �    �  � �  �    �  � �  �    �   � �  �    �   � �    � �    � �  �    �  � �  �    �  � �  �    �  � �  �    �  � �  �    �  � �    � �    � �  �     �     �    � �    � �  �    �  � �    � �  �     �     �   �    �  � �  �     �     �    � �  �    �  � �    � �    � �  �    �  � �    � �  �    �  � �    � �  �    :  � �    � �  �    �  � �  �    �  � �  �     �    � �  �    �  � �  �     �    � �  �    �  � �  �     �    � �  �    � �  � �  �    5  � �    � �    � �  �    �  � �    � �  �    +  � �     �  �    (   �    8         �   	 
         �     �  �     �      �      �      �      �      �         �     !  �    " �   #$  �   %& '(  �   % ')   *+  �   , -.   '/  �   %0 -1  �   0 23  �   45 69   : �  �     �     �   ; �  �   < = �  �   > ?@  �   A B@  �   C DE  �    � 	FG   	HI  �   J KL  �   M NL  �   M OP  �   QM%R  ST  �   MR UV  �   MWR XY  �   Z [ �   [\  �   ] ^_  �   ] `_  �   ] ab   c �  �   d e �  �    4 f �   gh  �   i jk    lo  �   p  qr  �   stu  v �   wx  �   M yx  �   M  zx  �   M  { �  �   |  } �   ~ �  �     �     �    �  �     �     �   ��   ��  �   � ��  �   � �  ��  �   ��|  ��  �   � � ��     � �   �� 	� � �    �  �[ s� �    � ��  �     �     �   �    � ��� ��  �   � ��  �   � ��  �   � �   �   �   �   � �   � �  �   �  ��  �    � �45 ��  �    �� � �  �   � � �   ��  �   ��| ��  �   ��| ��  �   ��| �� �    � �   ��| !��  �   � !��  �   � !��   ��   ��   ��  �   � ��  �   � ��   ��     � �   � � �   � �   ��  �   
� � �45 � �  �   � � �   � � �    �   � �   � �   ��  �    � ��� � �  �   �  � �    � �  �    ;  ��  �    � ���  ��  �    � � ����� ��  �   
� � �45  � �   ��  �   <� ��  �   < ��  �   �� ��  �   � � �  �   < � �   ��    � �   �� �    �� �   � �� �    � �   � � �   � �  �     �     �  �    �  � �   � �   �   ��   ��   �    B        	 
           78@mn 	 