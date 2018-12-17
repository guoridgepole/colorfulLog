# colorfulLog 彩色的日志
colorfulLog 彩色的日志
<h1>介绍</h1>
<p>
 在平时的开发中，如果想在控制台的一堆调试信息中找到自己打印出的log信息，是非常头疼的问题，有时不得不一次次清空掉信息然后重新调试，比如这样
 <img src="https://raw.githubusercontent.com/guoridgepole/colorfulLog/master/pic1.png"  width="700px" height="200px"/><br/>
 不想再这么找了，因此写了一个小功能，用来进行有色彩的log内容输出
 <img src="https://raw.githubusercontent.com/guoridgepole/colorfulLog/master/pic2.png" width="700px" height="200px"/>
 </p>
<p>
 提示类型分为五种
 <ul>
  <li>CLog.v 颜色灰色 用于输出无关紧要的内容</li>
  <li>CLog.d 颜色青色，仅输出debug调试</li>
  <li>CLog.i 颜色蓝色，用来输出提示性消息</li>
  <li>CLog.w 颜色橙色，用来作为警告信息</li>
  <li>CLog.e 颜色红色，用于error错误</li>
 </ul>
</p>
<p>
 在intellij idea中的效果（主题为intelliJ 白色主题）<br/>
 <img src="https://raw.githubusercontent.com/guoridgepole/colorfulLog/master/show1.png"/><br/>
  在intellij idea中的效果（主题为Darcula 黑主题）<br/>
  <img src="https://raw.githubusercontent.com/guoridgepole/colorfulLog/master/show2.png"/>
</p>
 使用方式很简单，只要把对应的jar包放入项目中，就可以直接使用了。
 使用范例:<br/>
 如CLog.v(msg) 或 CLog.v(tag, msg),tag与msg目前都只能为String类型
 <img src="https://raw.githubusercontent.com/guoridgepole/colorfulLog/master/show3.png"/>



===================================以下为机器翻译========================================
========================The following is a machine translation==========================

<h1>introduce</h1>
<p>
 In the usual development, if you want to be in a heap of debugging information in the console to find your print log information, is a very headache problem, sometimes have to again and again to empty out information to debug, then such as this
 <img src="https://raw.githubusercontent.com/guoridgepole/colorfulLog/master/pic1.png"  width="700px" height="200px"/><br/>
 Don't want to find so much, so to write a small function, used for color content of the log output
 <img src="https://raw.githubusercontent.com/guoridgepole/colorfulLog/master/pic2.png" width="700px" height="200px"/>
 </p>
<p>
 Tip is classified into five kinds
 <ul>
  <li>CLog.v The Color gray It doesn't matter is used to output content</li>
  <li>CLog.d The Cyan color, only the debug output debugging</li>
  <li>CLog.i The color blue, which is used to output message of presentation</li>
  <li>CLog.w The Color orange, used as a warning message</li>
  <li>CLog.e The Color red, for the error</li>
 </ul>
</p>
<p>
 In intellij idea effect (theme of intellij white theme)<br/>
 <img src="https://raw.githubusercontent.com/guoridgepole/colorfulLog/master/show1.png"/><br/>
  Effect in intellij idea (topic) for Darcula dark themes <br/>
  <img src="https://raw.githubusercontent.com/guoridgepole/colorfulLog/master/show2.png"/>
</p>
 Use method is very simple, as long as the corresponding jar package is put into the project, can use directly.
 examples:<br/>
 Such as the CLog.v(msg) or CLog.v(tag, msg),tag and msg now can only type String
 <img src="https://raw.githubusercontent.com/guoridgepole/colorfulLog/master/show3.png"/>
