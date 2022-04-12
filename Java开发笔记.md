## Java开发笔记



### 概述


Java是静态面向对象编程语言。运行与机器无关的（平台独立与可移植性）二进制格式类文件.class	,JAVA前身Osk
javac.exe是java程序的编译器，在/bin目录下

Java应用场景：
- 桌面应用程序
- Web应用程序
- 分布式系统
- 嵌入式系统应用程序



#### 开发环境安装及配置



1.Java JDK 程序运行环境

[下载地址](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

Win + R 调出cmd输入指令 java -v 检测Java配置是否成功

2.IntelliJ IDEA 集成开发环境

[下载地址](https://www.jetbrains.com/idea/download/#section=windows)

下载社区版创建新项目创建新java文件填入代码输出helloworld

```java
public class HelloWorld {
    /* 第一个Java程序
     * 它将输出字符串 Hello World
     *这是多行注释
     */
    public static void main(String[] args) {	//主方法入口
        System.out.println("Hello World"); // 输出 Hello World	这是单行注释
    }
}
```


拓展：Eclipse环境配置



#### API

JAVA核心应用程序编程接口API文档



### Java编程基础


#### 基本语法

编程方法：
1. 大小写敏感，大驼峰式命名（类名），小驼峰命名（方法名）
2. 源文件名与类名一致，文件名后缀 .java


main函数 —— 主方法入口 ：所有的 Java 程序由 **public static void main(String[] args)** 方法开始执行。


#### 修饰符

- 访问控制修饰符 : default,protected,  public , private
- 非访问控制修饰符 : final, abstract, static, synchronized



#### 数据、变量和表达式



**<u>空白、注释、语句</u>**：

ENTER 换行表示一行结束	TAB 缩进在每行增加易读性	SPACE 空格不会被编译同时增加易读性

//单行注释	

/*一行或
多行注释 */	

语句用; 分号分隔	{大括号包含语句块}



<u>**关键字**</u>

| 类别                 | 关键字                         | 说明                 |
| :------------------- | :----------------------------- | :------------------- |
| 访问控制             | private                        | 私有的               |
| protected            | 受保护的                       |                      |
| public               | 公共的                         |                      |
| default              | 默认                           |                      |
| 类、方法和变量修饰符 | abstract                       | 声明抽象             |
| class                | 类                             |                      |
| extends              | 扩充,继承                      |                      |
| final                | 最终值,不可改变的              |                      |
| implements           | 实现（接口）                   |                      |
| interface            | 接口                           |                      |
| native               | 本地，原生方法（非 Java 实现） |                      |
| new                  | 新,创建                        |                      |
| static               | 静态                           |                      |
| strictfp             | 严格,精准                      |                      |
| synchronized         | 线程,同步                      |                      |
| transient            | 短暂                           |                      |
| volatile             | 易失                           |                      |
| 程序控制语句         | break                          | 跳出循环             |
| case                 | 定义一个值以供 switch 选择     |                      |
| continue             | 继续                           |                      |
| default              | 默认                           |                      |
| do                   | 运行                           |                      |
| else                 | 否则                           |                      |
| for                  | 循环                           |                      |
| if                   | 如果                           |                      |
| instanceof           | 实例                           |                      |
| return               | 返回                           |                      |
| switch               | 根据值选择执行                 |                      |
| while                | 循环                           |                      |
| 错误处理             | assert                         | 断言表达式是否为真   |
| catch                | 捕捉异常                       |                      |
| finally              | 有没有异常都执行               |                      |
| throw                | 抛出一个异常对象               |                      |
| throws               | 声明一个异常可能被抛出         |                      |
| try                  | 捕获异常                       |                      |
| 包相关               | import                         | 引入                 |
| package              | 包                             |                      |
| 基本类型             | boolean                        | 布尔型               |
| byte                 | 字节型                         |                      |
| char                 | 字符型                         |                      |
| double               | 双精度浮点                     |                      |
| float                | 单精度浮点                     |                      |
| int                  | 整型                           |                      |
| long                 | 长整型                         |                      |
| short                | 短整型                         |                      |
| 变量引用             | super                          | 父类,超类            |
| this                 | 本类                           |                      |
| void                 | 无返回值                       |                      |
| 保留关键字           | goto                           | 是关键字，但不能使用 |
| const                | 是关键字，但不能使用           |                      |

**<u>标识符</u>**

由字母数字下划线或美元符号组成的字符串;数字不能开头;不允许有空白;标识符区分大小写，无长度限制



<u>**数据类型**</u>

boolean：true/false	(不能进行类型转换)

char：\u0000 - \uffff(十进制0到65535)

不同类型数据自动转换规则：

byte(8) - 0，short(16) - 0，char Unicode字符(16) - '\u000' < int(32) - 0 < long(64) - 0L < float单精度浮点(32) - 0.0f < double双精度(64) - 0.0d

```
//强制类型转换实例
int i = 1;
byte b = (byte)i;	//将 i 的类型强制转换为byte
```

final关键字修饰常量，声明方式与变量类似（运行时不可修改）





<u>**运算符**</u>

算术运算符：		加 +	减 -	乘 *	除 /	取模 %（取模可对整型/浮点型）

关系运算符：		大于 >	大于等于 >=	小于 <	小于等于 <=	等于 ==	不等于 !=

逻辑运算符:		二元运算符：	逻辑与 &&	逻辑或 ||	一元运算符：	逻辑非 ！

位运算符（操作二进制）：按位取反	按位与	按位或	异或	右移	左移	无符号右移	

![](D:\App\JAVA\运算符优先级.png)

多使用小括号进行优先级设置



<u>**表达式**</u>：

常量/变量





#### 流程控制语句



```
int x = 1;	//赋值语句
//循环语句
while( 布尔表达式 ) {	//while循环
  //循环内容，当布尔表达式的值为true时运行下去
}
do {	//do...while循环（至少执行一次）
       //代码语句
}while(布尔表达式);	//表达式成立继续执行
for(初始化; 布尔表达式; 更新) {	//for循环的次数在执行前就可以确定
    //代码语句
}
//条件语句
if(布尔表达式)	//if条件TRUE执行，否则执行else
{
   //如果布尔表达式为true将执行的语句
}
else{
if(x=3){	//if语句可以嵌套
System.out.print(x"="3);
}
else if(x=4){
break;//跳出循环
}
else{
continue;//跳出当前语句
}
//分支语句
i = 1;
switch(i){
    case value :	//可以有多条case语句分支,格式：case 比较值 : 
       //语句
       break; //跳转语句：该语句出现直接跳出分支循环
    case 1 :
       //此时匹配成功，若无break语句则后续值全部输出
       //break; 
    //你可以有任意数量的case语句
    default : //可选，可在任意顺序
       //语句，不需要break
}
```



#### 数组和字符串



访问数组元素 java.util.Arrays类操作数组

- 给数组赋值：通过 fill 方法。
- 对数组排序：通过 sort 方法,按升序。
- 比较数组：通过 equals 方法比较数组中元素值是否相等。
- 查找数组元素：通过 binarySearch 方法能对排序好的数组进行二分查找法操作。

```java
//创建、初始化、操纵数组
public class TestArray {
   public static void main(String[] args) {
      double[] myList = {1.9, 2.9, 3.4, 3.5}; // 数组声明方法1:dataType[] arrayRefVar = {value0, value1, ..., valuek}
       //数组声明方法2：dataType[] arrayRefVar; 	
 //创建数组	arrayRefVar = new dataType[arraySize];			
//数组声明同时创建数组	dataType[] arrayRefVar = new dataType[arraySize];
      // 打印所有数组元素
      for (int i = 0; i < myList.length; i++) {
         System.out.println(myList[i] + " ");
      }
       //使用for-each循环打印所有数组元素
       for (double element: myList) {
         System.out.println(element);
      }
      // 计算所有元素的总和
      double total = 0;
      for (int i = 0; i < myList.length; i++) {
         total += myList[i];
      }
      System.out.println("Total is " + total);
      // 查找最大元素
      double max = myList[0];
      for (int i = 1; i < myList.length; i++) {
         if (myList[i] > max) max = myList[i];
      }
      System.out.println("Max is " + max);
   }
}
```



##### 二维数组和多维数组

Vector类class

```java
String[][] str = new String[3][4];	//数组的数组，行列式
```





#### 异常处理机制



##### 异常捕获

```java
public void withdraw(double amount) throws RemoteException,
                              InsufficientFundsException{
  // 一个代码抛出多个异常，之间用逗号分隔
 try
{
   // 需要被保护的程序代码（有可能出现异常的代码块）
}catch(ExceptionName e1)
{
   //Catch 块
   //多重捕获
}
catch(异常类型3 异常的变量名3){
  // 程序代码
  }
  finally{
  //无论是否发生异常，finally 代码块中的代码总会被执行
  /*finally代码放在catch后面用于收尾性工作（非强制但建议）
  }
  
  }
```



##### 声明自定义异常

异常都必须是 Throwable 的子类。

- 检查性异常类——继承 Exception 类。
- 运行时异常类——继承 RuntimeException 类。



### Java高级编程



#### String & StringBuffer & StringBuilder

| [char charAt(int index)](https://www.runoob.com/java/java-string-charat.html) 返回指定索引处的 char 值。 |                                                              |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| 2                                                            | [int compareTo(Object o)](https://www.runoob.com/java/java-string-compareto.html) 把这个字符串和另一个对象比较。 |
| 3                                                            | [int compareTo(String anotherString)](https://www.runoob.com/java/java-string-compareto.html) 按字典顺序比较两个字符串。 |
| 4                                                            | [int compareToIgnoreCase(String str)](https://www.runoob.com/java/java-string-comparetoignorecase.html) 按字典顺序比较两个字符串，不考虑大小写。 |
| 5                                                            | [String concat(String str)](https://www.runoob.com/java/java-string-concat.html) 将指定字符串连接到此字符串的结尾。 |
| 6                                                            | [boolean contentEquals(StringBuffer sb)](https://www.runoob.com/java/java-string-contentequals.html) 当且仅当字符串与指定的StringBuffer有相同顺序的字符时候返回真。 |
| 7                                                            | [static String copyValueOf(char[\] data)](https://www.runoob.com/java/java-string-copyvalueof.html) 返回指定数组中表示该字符序列的 String。 |
| 8                                                            | [static String copyValueOf(char[\] data, int offset, int count)](https://www.runoob.com/java/java-string-copyvalueof.html) 返回指定数组中表示该字符序列的 String。 |
| 9                                                            | [boolean endsWith(String suffix)](https://www.runoob.com/java/java-string-endswith.html) 测试此字符串是否以指定的后缀结束。 |
| 10                                                           | [boolean equals(Object anObject)](https://www.runoob.com/java/java-string-equals.html) 将此字符串与指定的对象比较。 |
| 11                                                           | [boolean equalsIgnoreCase(String anotherString)](https://www.runoob.com/java/java-string-equalsignorecase.html) 将此 String 与另一个 String 比较，不考虑大小写。 |
| 12                                                           | [byte[\] getBytes()](https://www.runoob.com/java/java-string-getbytes.html)  使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。 |
| 13                                                           | [byte[\] getBytes(String charsetName)](https://www.runoob.com/java/java-string-getbytes.html) 使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。 |
| 14                                                           | [void getChars(int srcBegin, int srcEnd, char[\] dst, int dstBegin)](https://www.runoob.com/java/java-string-getchars.html) 将字符从此字符串复制到目标字符数组。 |
| 15                                                           | [int hashCode()](https://www.runoob.com/java/java-string-hashcode.html) 返回此字符串的哈希码。 |
| 16                                                           | [int indexOf(int ch)](https://www.runoob.com/java/java-string-indexof.html) 返回指定字符在此字符串中第一次出现处的索引。 |
| 17                                                           | [int indexOf(int ch, int fromIndex)](https://www.runoob.com/java/java-string-indexof.html) 返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。 |
| 18                                                           | [int indexOf(String str)](https://www.runoob.com/java/java-string-indexof.html)  返回指定子字符串在此字符串中第一次出现处的索引。 |
| 19                                                           | [int indexOf(String str, int fromIndex)](https://www.runoob.com/java/java-string-indexof.html) 返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。 |
| 20                                                           | [String intern()](https://www.runoob.com/java/java-string-intern.html)  返回字符串对象的规范化表示形式。 |
| 21                                                           | [int lastIndexOf(int ch)](https://www.runoob.com/java/java-string-lastindexof.html)  返回指定字符在此字符串中最后一次出现处的索引。 |
| 22                                                           | [int lastIndexOf(int ch, int fromIndex)](https://www.runoob.com/java/java-string-lastindexof.html) 返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索。 |
| 23                                                           | [int lastIndexOf(String str)](https://www.runoob.com/java/java-string-lastindexof.html) 返回指定子字符串在此字符串中最右边出现处的索引。 |
| 24                                                           | [int lastIndexOf(String str, int fromIndex)](https://www.runoob.com/java/java-string-lastindexof.html)  返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索。 |
| 25                                                           | [int length()](https://www.runoob.com/java/java-string-length.html) 返回此字符串的长度。 |
| 26                                                           | [boolean matches(String regex)](https://www.runoob.com/java/java-string-matches.html) 告知此字符串是否匹配给定的正则表达式。 |
| 27                                                           | [boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)](https://www.runoob.com/java/java-string-regionmatches.html) 测试两个字符串区域是否相等。 |
| 28                                                           | [boolean regionMatches(int toffset, String other, int ooffset, int len)](https://www.runoob.com/java/java-string-regionmatches.html) 测试两个字符串区域是否相等。 |
| 29                                                           | [String replace(char oldChar, char newChar)](https://www.runoob.com/java/java-string-replace.html) 返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。 |
| 30                                                           | [String replaceAll(String regex, String replacement)](https://www.runoob.com/java/java-string-replaceall.html) 使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。 |
| 31                                                           | [String replaceFirst(String regex, String replacement)](https://www.runoob.com/java/java-string-replacefirst.html)  使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。 |
| 32                                                           | [String[\] split(String regex)](https://www.runoob.com/java/java-string-split.html) 根据给定正则表达式的匹配拆分此字符串。 |
| 33                                                           | [String[\] split(String regex, int limit)](https://www.runoob.com/java/java-string-split.html) 根据匹配给定的正则表达式来拆分此字符串。 |
| 34                                                           | [boolean startsWith(String prefix)](https://www.runoob.com/java/java-string-startswith.html) 测试此字符串是否以指定的前缀开始。 |
| 35                                                           | [boolean startsWith(String prefix, int toffset)](https://www.runoob.com/java/java-string-startswith.html) 测试此字符串从指定索引开始的子字符串是否以指定前缀开始。 |
| 36                                                           | [CharSequence subSequence(int beginIndex, int endIndex)](https://www.runoob.com/java/java-string-subsequence.html)  返回一个新的字符序列，它是此序列的一个子序列。 |
| 37                                                           | [String substring(int beginIndex)](https://www.runoob.com/java/java-string-substring.html) 返回一个新的字符串，它是此字符串的一个子字符串。 |
| 38                                                           | [String substring(int beginIndex, int endIndex)](https://www.runoob.com/java/java-string-substring.html) 返回一个新字符串，它是此字符串的一个子字符串。 |
| 39                                                           | [char[\] toCharArray()](https://www.runoob.com/java/java-string-tochararray.html) 将此字符串转换为一个新的字符数组。 |
| 40                                                           | [String toLowerCase()](https://www.runoob.com/java/java-string-tolowercase.html) 使用默认语言环境的规则将此 String 中的所有字符都转换为小写。 |
| 41                                                           | [String toLowerCase(Locale locale)](https://www.runoob.com/java/java-string-tolowercase.html)  使用给定 Locale 的规则将此 String 中的所有字符都转换为小写。 |
| 42                                                           | [String toString()](https://www.runoob.com/java/java-string-tostring.html)  返回此对象本身（它已经是一个字符串！）。 |
| 43                                                           | [String toUpperCase()](https://www.runoob.com/java/java-string-touppercase.html) 使用默认语言环境的规则将此 String 中的所有字符都转换为大写。 |
| 44                                                           | [String toUpperCase(Locale locale)](https://www.runoob.com/java/java-string-touppercase.html) 使用给定 Locale 的规则将此 String 中的所有字符都转换为大写。 |
| 45                                                           | [String trim()](https://www.runoob.com/java/java-string-trim.html) 返回字符串的副本，忽略前导空白和尾部空白。 |
| 46                                                           | [static String valueOf(primitive data type x)](https://www.runoob.com/java/java-string-valueof.html) 返回给定data type类型x参数的字符串表示形式。 |
| 47                                                           | [contains(CharSequence chars)](https://www.runoob.com/java/java-string-contains.html) 判断是否包含指定的字符系列。 |
| 48                                                           | [isEmpty()](https://www.runoob.com/java/java-string-isempty.html) 判断字符串是否为空。 |





#### Swing GUI



##### AWT和Swing

Java抽象窗口工具集 —— AWT

图形界面GUI（窗口、标签、文本框、按钮），纯JAVA实现，组件在javax.swing. 下，类名以J开头

元素即组件component

顶层容器属于窗口类组件，可以独立显示，一个图形界面至少需要一个窗口，例如:
1. JFrame:	一个普通的窗口（绝大多数 Swing 图形界面程序使用 JFrame 作为顶层容器）
2. JDialog:	对话框
3. 中间容器：充当（若干）基本组件的载体，不可独立显示，添加到窗口中。

常用的中间容器（面板）:

1. JPanel	一般轻量级面板容器组件
2. JScrollPane	带滚动条的，可以水平和垂直滚动的面板组件
3. JSplitPane	分隔面板
4. JTabbedPane	选项卡面板
5. JLayeredPane	层级面板


特殊的中间容器:

1. JMenuBar	菜单栏
2. JToolBar	工具栏
3. JPopupMenu	弹出菜单
4. JInternalFrame	内部窗口

常用的简单的基本组件（container）:

JLabel	标签		JButton	按钮		JRadioButton	单选按钮		JCheckBox	复选框
JToggleButton	开关按钮		JTextField	文本框		JPasswordField	密码框
JTextArea 文本区域		JComboBox 下拉列表框		JList 列表		JProgressBar 进度条	JSlider 块



选取器组件:1、JFileChooser 文件选取器	2、JColorChooser	颜色选取器
其他较为复杂的基本组件:	1、JTable 表格	2、JTree 树

常用的布局管理器LayoutManager（将JComponent添加到面板容器JPanel中）:

1	FlowLayout	流式布局，按组件加入的顺序，按水平方向排列，排满一行换下一行继续排列。
2	GridLayout	网格布局，把Container按指定行列数分隔出若干网格，每一个网格按顺序放置一个控件。
3	GridBagLayout	网格袋布局，按网格划分Container，每个组件可占用一个或多个网格，可将组件垂直、水平或沿它们的基线对齐。
4	BoxLayout	箱式布局，将Container中的多个组件按 水平 或 垂直 的方式排列。
5	GroupLayout	分组布局，将组件按层次分组（串行 或 并行），分别确定 组件组 在 水平 和 垂直 方向上的位置。
6	CardLayout	卡片布局，将Container中的每个组件看作一张卡片，一次只能显示一张卡片，默认显示第一张卡片。
7	BorderLayout	边界布局，把Container按方位分为 5 个区域（东、西、南、北、中），每个区域放置一个组件。
8	SpringLayout	弹性布局，通过定义组件四条边的坐标位置来实现布局。
9	null	绝对布局，通过设置组件在Container中的坐标位置来放置组件。


```java
//所有包package都在javax.swing中
import javax.swing.JButton;	//按钮
import javax.swing.JFrame;//框架
import javax.swing.JLabel;//显示图像、垂直媒体
import javax.swing.JPanel;//相当于HTML中的div块
import javax.swing.JPasswordField;//允许一行加密输入
import javax.swing.JTextField;//允许编辑单行文本的输入筐
public class SwingLoginExample {

    public static void main(String[] args) {
        // 创建 JFrame 实例
        JFrame frame = new JFrame("Login Example");
        // Setting the width and height of frame
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* 创建面板，这个类似于 HTML 的 div 标签
         * 我们可以创建多个面板并在 JFrame 中指定位置
         * 面板中我们可以添加文本字段，按钮及其他组件。
         */
        JPanel panel = new JPanel();
        // 添加面板
        frame.add(panel);
        /*
         * 调用用户定义的方法并添加组件到面板
         */
        placeComponents(panel);

        // 设置界面可见
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        /* 布局部分我们这边不多做介绍
         * 这边设置布局为 null
         */
        panel.setLayout(null);

        // 创建 JLabel
        JLabel userLabel = new JLabel("User:");
        /* 这个方法定义了组件的位置。
         * setBounds(x, y, width, height)
         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
         */
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);//组件通过add()添加到容器Container中

        /*
         * 创建文本域用于用户输入
         */
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        // 输入密码的文本域
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        /*
         *这个类似用于输入的文本域
         * 但是输入的信息会以点号代替，用于包含密码的安全性
         */
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        // 创建登录按钮
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
    }

}
```



#### 流Stream、文件File、I/O

java.io操作输入/输出类

把System.in（控制台输入）包装在BufferedReader对象中创建一个绑定到控制台的字符流

read（）读取字符；readLine读取字符串

System.out控制输出（PrintStream)



##### 文件和I/O

File class

FileReader class

FileWriter class



mkdir()创建文件夹

mkdirs()床架文件夹和他的所有父文件夹



java.io.File.delete()删除文件及目录



#### 接口interface

抽象方法的集合，类通过继承接口继承其抽象方法

接口含多个公有的方法，保存在.java中，

```
import java.lang.*;
//引入包
 
public interface NameOfInterface	//interface声明接口
{
   //任何类型 final, static 字段（成员变量的默认修饰符）
   //抽象方法（成员方法）	abstart
}
```



### OOP面向对象技术



OOP面向对象的程序设计：封装、继承、多态

OOA面向对象分析

OOD面向对象设计



#### 方法



解决问题的有序组合（代码块）含于类或对象中

小驼峰命名法

```java
访问修饰符 返回值类型 方法名(参数类型 参数名.参数类型 参数名){
    ...
    方法体
    ...
    return 返回值;
}
```



#### 类和对象，抽象



定义方法

包装类class



String类创建和操作字符串（不可变）

```java
String s1 = "Runoob";              // String 直接创建
String s5 = new String("Runoob");   // String 对象创建
//String方法的length方法返回字符串长度
public class StringDemo {
    public static void main(String args[]) {
        String site = "wwwstringcom";
        int len = site.length();
        System.out.println( "字符串长度 : " + len );	//length方法返回字符串长度，加号链接字符串
        System.out.println( "字符串长度 : ".concat("String2") );	//length方法返回字符串长度
   }
}
```



StringBuffer & StringBuilder类可修改





#### 继承、多态、封装



##### 继承

类的继承格式：

```java
public class Father {	//super class 被继承的类：超类
    private String name;  
    private int id; 
    public Animal(String myName, int myid) { 
        name = myName; 
        id = myid;
    } 
    public void eat(){ 
        System.out.println(name+"正在吃"); 
    }
}
 
class son extends Father {	//subclass 派生类：子类。extends关键字继承
    public class Penguin extends Animal { 
    public Penguin(String myName, int myid) { 
        super(myName, myid); 
    } 
        //子类可含有父类没有的属性和方法（可扩展性）
        public void sleep(){
        System.out.println(name+"正在睡");
    }
        void eat() {
    System.out.println("dog : eat");
  }
    }
        //多重继承
    public class imp implements Father，son {	//implements关键字变相实现多继承
    public class Penguin extends Animal { 
    public Penguin(String myName, int myid) { 
        super(myName, myid); 
    } 
        void eat() {
    System.out.println("dog : eat");
  }
        //this/super方法
  void eatTest() {
    this.eat();   // this 调用自己的方法
    super.eat();  // super 调用父类方法
  }

}
```

Java不支持多继承（一个类继承多个类;可以用implements实现多继承），支持多重继承、不同类继承同一类！	——父类___<u>一对多</u>___子类



*继承使类之间产生关系，是多态的前提*



##### 多态

对象在不同时刻表现出不同状态



##### 封装

```java
public class Person {	//将属性可见性限制为private
    private String name;	//设为私有后只有本类能访问
    private int age;
}
```



##### 包package



```java
package
    import packname
```



#### 实例和方法



#### 进程和线程

一个进程并发多线程执行不同任务（一对多，资源节省）；

线程不独立存在（是进程的一部分，所有从属的线程执行完进程才能结束）

线程生命周期的五大状态：新生，就绪，运行，阻塞，死亡

```java
class ThreadDemo extends Thread{	//通过继承 Thread来创建线程
    
}

Thread name = new Thread();	//新生状态：线程创建，开辟工作空间
name.start();	//就绪状态：可运行还未运行或解除原有的阻塞状态
name.run();	//运行状态：执行线程体代码（前提处于就绪状态）
sleep();占用资源/wait()不占资源等待;/join();加入合并或插队/write();/read();IO系统操作阻塞
stop();/destroy();	//死亡状态（手动强制死亡）
```



| 1    | **public void start()** 使该线程开始执行；**Java**虚拟机调用该线程的运行方法。 |
| ---- | ------------------------------------------------------------ |
| 2    | **public void run()** 如果该线程是使用独立的Runnable 运行对象构造的，则调用该Runnable对象的run方法；否则，该方法不执行任何操作并返回。 |
| 3    | **public final void setName(String name)** 改变线程名称，使之与参数名称相同。 |
| 4    | **public final void setPriority(int priority)**  更改线程的优先级。 |
| 5    | **public final void setDaemon(boolean on)** 场景线程标记为守护线程或用户线程。 |
| 6    | **public final void join(long millisec)** 等待线程终止的时间为**毫秒毫秒**。 |
| 7    | **public void interrupt()** 中断线程。                       |
| 8    | **public final boolean isAlive()** 测试线程是否出现活动状态。 |

Thead类方法

| 1    | **public static void yield()** 暂停当前正在执行的线程对象，并执行其他线程。 |
| ---- | ------------------------------------------------------------ |
| 2    | **public static void sleep(long millisec)** 在的毫秒数内让当前正在执行的线程休眠（暂停执行），此操作指定系统调用和调度程序精确和精确的影响。 |
| 3    | **public static boolean holdLock(Object x)** 当且仅当当前线程在指定的对象上保持健康锁时，才返回true。 |
| 4    | **public static Thread currentThread()** 返回对当前正在执行的线程对象的引用。 |
| 5    | **public static void dump()** 将当前线程的堆栈放电打印至标准错误。 |



线程的优先级（用整数表示）：1 （Thread.MIN_PRIORITY ） - 10 （Thread.MAX_PRIORITY ）

线程的基本控制：挂起、停止、恢复。线程的互斥、同步和死锁

