import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MenuExample implements ActionListener{
    JFrame f;

    JMenuBar mb;
    JMenu file,edit,check,tool,help;
    JMenuItem new_folder,open,save,save_as,script,exit;
    JMenuItem cut,copy,paste,selectAll;
    JMenuItem reductant,search;
    JMenuItem counter,ip_search,reptile;
    JMenuItem about,helpword,panelhelp;

    JPanel pel1,pel2,pel3,pel4;
    JButton tool1_reptile,tool2_counter,tool3_ipsearch,tool4_onlinetest;

    JLabel username;

    JTextArea ta;

    MenuExample(){
        f=new JFrame();

//        file
        new_folder=new JMenuItem("新建");
        open=new JMenuItem("打开");
        save=new JMenuItem("保存");
        save_as=new JMenuItem("另存为");
        script=new JMenuItem("脚本");
        exit=new JMenuItem("退出");
        new_folder.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        save_as.addActionListener(this);
        script.addActionListener(this);
        exit.addActionListener(this);
        //        edit
        cut=new JMenuItem("剪切");
        copy=new JMenuItem("拷贝");
        paste=new JMenuItem("粘贴");
        selectAll=new JMenuItem("全选");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
//        check
        reductant=new JMenuItem("还原");
        search=new JMenuItem("查找");
        reductant.addActionListener(this);
        search.addActionListener(this);
//        tool
        counter=new JMenuItem("计算器");
        ip_search=new JMenuItem("IP地址查询");
        reptile=new JMenuItem("爬虫");
        counter.addActionListener(this);
        ip_search.addActionListener(this);
        reptile.addActionListener(this);
//        Help
        about=new JMenuItem("关于");
        helpword=new JMenuItem("帮助教程");
        panelhelp=new JMenuItem("面板");
        about.addActionListener(this);
        helpword.addActionListener(this);
        panelhelp.addActionListener(this);

        mb=new JMenuBar();
        file=new JMenu("文件");
        edit=new JMenu("编辑");
        check=new JMenu("查看");
        tool=new JMenu("工具");
        help=new JMenu("帮助");

        file.add(new_folder);file.add(open);file.add(save);file.add(save_as);file.add(script);file.add(exit);
        edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);
        check.add(reductant);check.add(search);
        tool.add(counter);tool.add(ip_search);tool.add(reptile);
        help.add(about);help.add(helpword);help.add(panelhelp);
        mb.add(file);mb.add(edit);mb.add(check);mb.add(tool);mb.add(help);

//      panel
//        pel1: username / headimage
        pel1=new JPanel();
        pel1.setBounds(0,0,160,200);
        pel1.setBackground(Color.gray);
        f.add(pel1);
//        pel2
        pel2=new JPanel();
        pel2.setBounds(0,200,160,300);
        pel2.setBackground(Color.black);
        f.add(pel2);
//        pel3
        pel3=new JPanel();
        pel3.setBounds(160,0,340,200);
        pel3.setBackground(Color.blue);
        f.add(pel3);
//        pel4
        pel4=new JPanel();
        pel4.setBounds(160,200,340,300);
        pel4.setBackground(Color.lightGray);
        f.add(pel4);

//        TextArea
        ta=new JTextArea();
        ta.setBounds(200,50,250,100);
        f.add(mb);f.add(ta);
        f.setJMenuBar(mb);
        f.setLayout(null);
        f.setTitle("swing开发测试");
        f.setSize(500,500);
        f.setVisible(true);

//        username
        username= new JLabel("username");
        username.setBounds(10,10,0,0);
        pel1.add(username);

//        tool
        tool1_reptile= new JButton("reptile");
        tool1_reptile.setBounds(20, 20, 60, 20);
        pel2.add(tool1_reptile);

        tool2_counter= new JButton("counter");
        tool2_counter.setBounds(60, 20, 60, 20);
        pel2.add(tool2_counter);

        tool3_ipsearch= new JButton("ipsearch");
        tool3_ipsearch.setBounds(100, 20, 60, 20);
        pel2.add(tool3_ipsearch);

        tool4_onlinetest= new JButton("counter");
        tool4_onlinetest.setBounds(140, 20, 60, 20);
        pel2.add(tool4_onlinetest);

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cut)
            ta.cut();
        if(e.getSource()==paste)
            ta.paste();
        if(e.getSource()==copy)
            ta.copy();
        if(e.getSource()==selectAll)
            ta.selectAll();
    }
    public static void main(String[] args) {
        new MenuExample();
    }
}

//javac MenuExample.java
//java MenuExample