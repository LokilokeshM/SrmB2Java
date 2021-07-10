package Day09_07;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JtreeExample {
	public static void main(String[] args) {
        
        JFrame JFrameMain = new JFrame();
        JFrameMain.setVisible(true);
        JFrameMain.setSize(400,400);
 
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("India");
         
        DefaultMutableTreeNode maharashtraNode = new DefaultMutableTreeNode("Maharashtra");
        DefaultMutableTreeNode gujrathNode = new DefaultMutableTreeNode("Gujrath");
        rootNode.add(maharashtraNode);
        rootNode.add(gujrathNode);
         
        DefaultMutableTreeNode mumbaiSubNode = new DefaultMutableTreeNode("Mumbai");
        DefaultMutableTreeNode puneSubNode = new DefaultMutableTreeNode("Pune");
        DefaultMutableTreeNode nashikSubNode = new DefaultMutableTreeNode("Nashik");
        DefaultMutableTreeNode nagpurSubNode = new DefaultMutableTreeNode("Nagpur");
         
        maharashtraNode.add(mumbaiSubNode);
        maharashtraNode.add(puneSubNode);
        maharashtraNode.add(nashikSubNode);
        maharashtraNode.add(nagpurSubNode);
 
        JTree tree = new JTree(rootNode);   
 
        JFrameMain.add(tree);
    }
}