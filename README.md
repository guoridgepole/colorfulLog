# colorfulLog 彩色的日志
colorfulLog 彩色的日志
<h1>介绍</h1>
在平时的开发中，如果想在控制台的一堆调试信息中找到自己打印出的log信息，是非常头疼的问题，有时不得不一次次清空掉信息然后重新调试，比如这样
<img src="https://raw.githubusercontent.com/guoridgepole/colorfulLog/master/pic1.png"  width="700px" height="200px"/>
不想再这么找了，因此写了一个小功能，用来进行有色彩的log内容输出
<img src="https://raw.githubusercontent.com/guoridgepole/colorfulLog/master/pic2.png" width="700px" height="200px"/>
提示类型分为五种
 * CLog.v 颜色灰色 用于输出无关紧要的内容 <br/>
 * CLog.d 颜色青色，仅输出debug调试 <br/>
 * CLog.i 颜色蓝色，用来输出提示性消息 <br/>
 * CLog.w 颜色橙色，用来作为警告信息 <br/>
 * CLog.e 颜色红色，用于error错误
 在intellij idea中的效果（主题为intelliJ 白色主题）<br/>
 <img src="https://raw.githubusercontent.com/guoridgepole/colorfulLog/master/show1.png"/>
  在intellij idea中的效果（主题为Darcula 黑主题）<br/>
  <img src="https://raw.githubusercontent.com/guoridgepole/colorfulLog/master/show2.png"/>
 使用方式很简单，只要把对应的jar包放入项目中，就可以直接使用了。<br/>
 使用范例:<br/>
 如CLog.v(msg) 或 CLog.v(tag, msg),tag与msg目前都只能为String类型
 <img src="https://raw.githubusercontent.com/guoridgepole/colorfulLog/master/show3.png"/>