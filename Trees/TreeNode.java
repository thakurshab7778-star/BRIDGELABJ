package Trees;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    String name;
    List<TreeNode> children;

    TreeNode(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    void addChild(TreeNode child) {
        children.add(child);
    }
}

public class TreeExample {

    static int getHeight(TreeNode root) {
        if (root == null) return -1;

        int maxHeight = -1;
        for (TreeNode child : root.children) {
            maxHeight = Math.max(maxHeight, getHeight(child));
        }
        return maxHeight + 1;
    }
    static int getDepth(TreeNode root, String target, int depth) {
        if (root == null) return -1;
        if (root.name.equals(target)) return depth;

        for (TreeNode child : root.children) {
            int d = getDepth(child, target, depth + 1);
            if (d != -1) return d;
        }
        return -1;
    }

    static boolean getAncestors(TreeNode root, String target, List<String> list) {
        if (root == null) return false;

        if (root.name.equals(target)) return true;

        for (TreeNode child : root.children) {
            if (getAncestors(child, target, list)) {
                list.add(root.name);
                return true;
            }
        }
        return false;
    }
static void getLeafNodes(TreeNode root) {
        if (root == null) return;

        if (root.children.size() == 0) {
            System.out.println(root.name);
        }

        for (TreeNode child : root.children) {
            getLeafNodes(child);
        }
    }

    public static void main(String[] args) {

    
        TreeNode CEO = new TreeNode("CEO");
        TreeNode CTO = new TreeNode("CTO");
        TreeNode CFO = new TreeNode("CFO");
        TreeNode devLead = new TreeNode("Dev Lead");
        TreeNode HR = new TreeNode("HR");
        TreeNode dev1 = new TreeNode("Dev1");
        TreeNode dev2 = new TreeNode("Dev2");


        CEO.addChild(CTO);
        CEO.addChild(CFO);

        CTO.addChild(devLead);
        CTO.addChild(HR);

        devLead.addChild(dev1);
        devLead.addChild(dev2);

        System.out.println("Leaf Nodes:");
        getLeafNodes(CEO);

        System.out.println("Height of Tree: " + getHeight(CEO));
        System.out.println("Depth of Dev Lead: " + getDepth(CEO, "Dev Lead", 0));
        List<String> ancestors = new ArrayList<>();
        getAncestors(CEO, "Dev1", ancestors);
        System.out.println("Ancestors of Dev1: " + ancestors);

        
        System.out.println("Degree of CTO: " + CTO.children.size());
    }
}
    

