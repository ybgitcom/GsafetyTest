# Web学习计划与JavaSE学习总结

## Web前端自学计划

| 学习时间 | 学习内容 | 学习目标 | 学习形式 |
|:---:|:---|:---|:---|
| **5/20** | 制作前端学习计划表，总结JavaSE学习心得，配置VScode前端开发插件环境，了解bootstrap框架 | 熟悉使用VScode编写前端网页，并应用各种插件规范代码编写与格式 | 通过博客、官方文档了解Vscode前端插件以及bootstrap框架 |
| **5/21~5/22** | 用html+css+js+bootstrap编写前端测试项目，了解前端代码结构及特性 | 一天完成一项前端界面的编写任务，熟悉使用bootstrap框架，了解Javascript编程 | 通过博客、慕课网等网络资料以及参考书籍了解前端编写特性 |
| **5/23** | 前端项目编写总结 | 制作总结Markdown文档 |  |
| **5/25~5/27** | 深入学习JavaScript前端开发，以及JSP开发技术（Ajax等） | 完成Javascript学习资料相关章节习题 | 网页资料、参考书籍、代码实践等 |
| **5/28~5/29** | 开发阶段测试项目 |  |  |
| **5/30** | 总结Web前端自学内容，准备项目测试 | 复习前面的代码实践工程，熟悉Web前端开发特性 | 项目实践、参考书籍复习等 |

## JavaSE学习总结

* 学习内容总结

  * 半个月时间将JavaSE重新复习了一遍，有许多新的发现，包括Java的IntelliJIDEA开发工具，许多快捷键都非常有用
  * 对Java的正则表达式了解到了更多，发现正则表达式的应用非常广泛，如手机号码验证等
  * Java使用继承`Thread类`与实现`Runnable接口`操作多线程的方式有不同之处，但都是实现`run()方法`然后通过`start()方法`启动
  * 进一步巩固了java网络通信`Socket原理`以及`TCP/IP、UDP传输协议`，并了解了java反射机制、`Annotation`接口特性
  * Java抽象类可实现单继承，单接口可以多实现

  ```java 
  /** 
  * 验证手机号码 
  *  
  * 移动号码段:139、138、137、136、135、134、150、151、152、157、158、159、182、183、187、188、147 
  * 联通号码段:130、131、132、136、185、186、145 
  * 电信号码段:133、153、180、189 
  *  
  * @param cellphone 
  * @return 
  */
  public static boolean checkCellphone(String cellphone) { 
    String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8}$";  
    return check(cellphone, regex); 
  } 
 
  /** 
  * 验证固话号码 
  *  
  * @param telephone 
  * @return 
  */
  public static boolean checkTelephone(String telephone) { 
    String regex = "^(0\\d{2}-\\d{8}(-\\d{1,4})?)|(0\\d{3}-\\d{7,8}(-\\d{1,4})?)$"; 
    return check(telephone, regex); 
  }
  ```

* 学习心得体会

  * 温故而知新，任何时候要学会总结学习内容，会发现新的东西
  * 多与同事分享自己所学的知识，并参与他们的分享
  * 开发项目要尽量想的更全面，也要贴近客户的需求
  * 多了解springboot等Java开发框架，敏捷开发很重要
  * 做程序要多想到`友好访问`的问题

* 学习网站mark

  * [IntelliJ官方文档](https://www.jetbrains.com/help/idea/2017.1/meet-intellij-idea.html)
  * [IntelliJ快捷键总结](https://blog.csdn.net/wei83523408/article/details/60472168)
  * [Java抽象类与接口总结](http://www.cnblogs.com/azai/archive/2009/11/10/1599584.html)
