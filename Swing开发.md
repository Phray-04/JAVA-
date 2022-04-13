# Swing开发手册（精华）


swing的实现不包含任何本地代码（轻量级），不受硬件平台限制

*（包含本地代码的AWT称为重量级组件）*

设计用户图形界面

1. 选取组件
2. 设计布局
3. 响应事件

Java抽象窗口工具集 —— AWT

图形界面GUI（窗口、标签、文本框、按钮），纯JAVA实现，组件在javax.swing. 下，类名以J开头

swing的4种顶层容器

- JFrame
- JApplet
- JDialog
- JWindow

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
