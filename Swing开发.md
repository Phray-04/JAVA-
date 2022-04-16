# Swing开发报告（更新中..）

---

swing的实现不包含任何本地代码（轻量级），不受硬件平台限制 *（包含本地代码的Java抽象窗口工具集AWT称为重量级组件）*

纯JAVA实现，组件在javax.swing. 下，类名以J开头


### 项目开发步骤：

项目定位：旨在Java和Java Swing的学习记录，集成一个桌面小项目，定位为**辅助工作软件**


1. 选取组件（元素即组件component）
   - 选取顶层容器[^1]：JFrame 
   - 选取中间容器[^2]：JPanel   | JDialog
   - 选取组件容器[^3]：JMenuBar   |   JToolBar
   - 选取基本组件[^4]: JLabel | JButton | JPasswordField  | JTextArea | JTable  | JRadioButton  | JCheckBox | JComboBox |  JSlider
   - 选取功能组件[^5]: JFileChooser   |   JColorChooser


2. 设计布局[^6]

   使用LayoutManager布局管理的
      1. GridBagLayout	网格袋布局
      2. null绝对布局
  
3. 响应事件

   **实现初级功能**
   1. 打开关闭文件（文件夹浏览）
   2. 登录注册表单
   3. 记事本功能（复制粘贴保存导出）
   4. 计算器
   5. IP查询
   6. 简单HTML爬虫
   7. 在线测试

   **计划实现的高级功能**
   1. 打包为exe桌面应用程序
   2. 与数据库文件对接，实现用户数据管理





[^1]:顶层容器： 1. JFrame（绝大多数场景） 2. JApplet 3. JDialog:对话框 4. JWindow   (仅4个)
[^2]:中间容器： 1. JPanel	一般轻量级面板容器组件  2. JScrollPane	带滚动条的，可以水平和垂直滚动的面板组件  3. JSplitPane	分隔面板  4. JTabbedPane	选项卡面板  5. JLayeredPane	层级面板
[^3]:组件容器:  1. JMenuBar	菜单栏 2.  JToolBar	工具栏 3.  JPopupMenu	弹出菜单 4. JInternalFrame	内部窗口
[^4]:基本组件:  1. JLabel	标签  2. JButton	按钮 3. JRadioButton 单选按钮  4. JCheckBox 复选框  5. JToggleButton 开关按钮  6. JTextField	文本框  7. JPasswordField	密码框  8. JTextArea 文本区域  9. JComboBox 下拉列表框  10. JList 列表  11. JProgressBar 进度条  12. JSlider 滑块  13. JTable 表格  14. JTree 树  15. JSeparator 分隔线  16. JProgressBar 显示任务进度
[^5]:功能组件:  1. JFileChooser 文件选取器  2. JColorChooser	颜色选取器 3. JOptionPane标准对话框 4. JMenuItem&JMenu菜单栏
[^6]:布局管理器LayoutManager（将JComponent添加到面板容器JPanel中）: -	FlowLayout	流式布局，按组件加入的顺序，按水平方向排列，排满一行换下一行继续排列。-	GridLayout	网格布局，把Container按指定行列数分隔出若干网格，每一个网格按顺序放置一个控件。-	GridBagLayout	网格袋布局，按网格划分Container，每个组件可占用一个或多个网格，可将组件垂直、水平或沿它们的基线对齐。-	BoxLayout	箱式布局，将Container中的多个组件按 水平 或 垂直 的方式排列。-	GroupLayout	分组布局，将组件按层次分组（串行 或 并行），分别确定 组件组 在 水平 和 垂直 方向上的位置。-	CardLayout	卡片布局，将Container中的每个组件看作一张卡片，一次只能显示一张卡片，默认显示第一张卡片。-	BorderLayout	边界布局，把Container按方位分为 5 个区域（东、西、南、北、中），每个区域放置一个组件。-	SpringLayout	弹性布局，通过定义组件四条边的坐标位置来实现布局。-	null	绝对布局，通过设置组件在Container中的坐标位置来放置组件。
