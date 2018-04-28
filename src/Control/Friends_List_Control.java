package Control;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTree;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

import view.Friends_Lists;

public class Friends_List_Control extends Friends_Lists implements TreeModelListener,MouseListener,ActionListener{
	public Friends_List_Control() {
		//System.out.println("1");
		mytree.addMouseListener(this);
		BAddFriend.addActionListener(this);
		treemodel.addTreeModelListener(this);
	}

	@Override
	public void treeNodesChanged(TreeModelEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void treeNodesInserted(TreeModelEvent e) {
		// TODO Auto-generated method stub
		/*
		TreePath treePath = e.getTreePath(); 
		DefaultMutableTreeNode parent= (DefaultMutableTreeNode)  
				treePath.getLastPathComponent();
	    DefaultMutableTreeNode childNode =  
	            new DefaultMutableTreeNode("child"); 
	    childNode.setAllowsChildren(true);
		if(parent==top) {
			System.out.println("1");
			 treemodel.insertNodeInto(childNode, parent,  
                     parent.getChildCount());  
		}
		 */
		System.out.println("1");
	}
	@Override
	public void treeNodesRemoved(TreeModelEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void treeStructureChanged(TreeModelEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
            try {  
            	// TreePath parentPath=mytree.getSelectionPath();
            	 
            	
                JTree tree = (JTree) e.getSource();  
                int rowLocation = tree.getRowForLocation(e.getX(), e.getY());  
                TreePath treepath = tree.getPathForRow(rowLocation);  
                DefaultMutableTreeNode treenode = (DefaultMutableTreeNode) treepath.getLastPathComponent();//find the current node
                
                if(top==treenode) {
                	top.removeAllChildren();
                	treemodel.reload();
                	DefaultMutableTreeNode childNode =  
            	            new DefaultMutableTreeNode("child"); 
                	childNode.setAllowsChildren(true);
                	treemodel.insertNodeInto(childNode, treenode, treenode.getChildCount());
                	mytree.scrollPathToVisible(new TreePath(childNode.getPath()));
                	childNode.setAllowsChildren(false);
                	//System.out.println("1");
                }
                else {
                	
                }
                
            } catch (NullPointerException ne) {  
            	ne.printStackTrace();
            }  
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		Button ClickButton=(Button)event.getSource();
		if(ClickButton==BAddFriend) {
			Friend_Request_Control window=new Friend_Request_Control();
		}
	}
	/*
    public static void main(String[] args){
    	//System.out.println("1");
    	Friends_List_Control w=new Friends_List_Control();
    */
   
}
