# Swing开发手册（精华）

---

swing的实现不包含任何本地代码（轻量级），不受硬件平台限制

*（包含本地代码的Java抽象窗口工具集AWT称为重量级组件）*

项目开发：

设计用户图形界面

1. 选取组件（元素即组件component）
2. 设计布局
3. 响应事件

纯JAVA实现，组件在javax.swing. 下，类名以J开头

顶层容器

- JFrame（绝大多数场景）
- JApplet
- JDialog:对话框
- JWindow


中间容器

1. JPanel	一般轻量级面板容器组件
2. JScrollPane	带滚动条的，可以水平和垂直滚动的面板组件
3. JSplitPane	分隔面板
4. JTabbedPane	选项卡面板
5. JLayeredPane	层级面板
6. -----------------------------------------------特殊的
7. JMenuBar	菜单栏
8. JToolBar	工具栏
9. JPopupMenu	弹出菜单
10. JInternalFrame	内部窗口
11. ---------------------------------------------基本组件
12. JLabel	标签
13. JButton	按钮
14. JRadioButton 单选按钮
15. JCheckBox 复选框
16. JToggleButton 开关按钮
17. JTextField	文本框
18. JPasswordField	密码框
19. JTextArea 文本区域
20. JComboBox 下拉列表框
21. JList 列表
22. JProgressBar 进度条
23. JSlider 块
24. ----------------------------------------------选取器组件
25. JFileChooser 文件选取器
26. JColorChooser	颜色选取器
27. -----------------------------------其他较为复杂的基本组件
28. JTable 表格
29. JTree 树


1. 布局管理器LayoutManager（将JComponent添加到面板容器JPanel中）:

1	FlowLayout	流式布局，按组件加入的顺序，按水平方向排列，排满一行换下一行继续排列。
2	GridLayout	网格布局，把Container按指定行列数分隔出若干网格，每一个网格按顺序放置一个控件。
3	GridBagLayout	网格袋布局，按网格划分Container，每个组件可占用一个或多个网格，可将组件垂直、水平或沿它们的基线对齐。
4	BoxLayout	箱式布局，将Container中的多个组件按 水平 或 垂直 的方式排列。
5	GroupLayout	分组布局，将组件按层次分组（串行 或 并行），分别确定 组件组 在 水平 和 垂直 方向上的位置。
6	CardLayout	卡片布局，将Container中的每个组件看作一张卡片，一次只能显示一张卡片，默认显示第一张卡片。
7	BorderLayout	边界布局，把Container按方位分为 5 个区域（东、西、南、北、中），每个区域放置一个组件。
8	SpringLayout	弹性布局，通过定义组件四条边的坐标位置来实现布局。
9	null	绝对布局，通过设置组件在Container中的坐标位置来放置组件。


