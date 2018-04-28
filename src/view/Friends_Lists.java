package view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

public class Friends_Lists extends JFrame{
	/*
    private Box b;
    protected JTree mytree;
    protected DefaultTreeModel treemodel;
    protected DefaultMutableTreeNode top;
    private JPanel add,list;
    protected Button AddFriend,FriendList;
    public Friends_Lists() {
		this.setTitle("My Friends");	
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Image/QQButton.png")));
		b = Box.createVerticalBox();
		this.setSize(300,700);   
		
    	AddFriend=new Button("Add Friends");
    	add=new JPanel();
    	add.add(AddFriend);
    	b.add(add);
	    this.add(b);   
	    
	    list=new JPanel();
	    top= new DefaultMutableTreeNode("My Friends"); 
	    DefaultMutableTreeNode leafnode = new DefaultMutableTreeNode("公司文件");
	    top.add(leafnode);
	    treemodel= new DefaultTreeModel(top); 
	    mytree=new JTree(treemodel);
	    mytree.getSelectionModel().setSelectionMode  
	     (TreeSelectionModel.SINGLE_TREE_SELECTION); 
	    //JScrollPane treeView = new JScrollPane(mytree);
	    
	    list.add(mytree);
	    b.add(list);
	    
	    
	    this.setContentPane(b);	
    	this.setVisible(true);
    	
    }
    */
    protected JTree mytree;
    protected DefaultTreeModel treemodel;
    protected DefaultMutableTreeNode top;
    protected Button BAddFriend;
    public Friends_Lists() {
		this.setTitle("My Friends");	
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Image/QQButton.png")));
		Container contentPane = this.getContentPane(); 
		BAddFriend=new Button("Add Friends");
		
		top= new DefaultMutableTreeNode("My Friends"); 
	    treemodel= new DefaultTreeModel(top); 
	    mytree=new JTree(treemodel);
	    mytree.getSelectionModel().setSelectionMode (TreeSelectionModel.SINGLE_TREE_SELECTION); 
	    JScrollPane scrollPane = new JScrollPane();  
        scrollPane.setViewportView(mytree);  
        contentPane.add(scrollPane, BorderLayout.CENTER);  
        contentPane.add(BAddFriend, BorderLayout.SOUTH);  
        this.pack();  
        this.setVisible(true);  
        this.addWindowListener(new WindowAdapter() {  
  
            public void windowClosing(WindowEvent e) {  
                System.exit(0);  
            }  
        });  
    }

}
