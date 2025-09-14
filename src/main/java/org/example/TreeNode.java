package org.example;

import java.util.*;

// Node for the tree structure
class TreeNode {
    private final String name;
    private final Map<String, TreeNode> children = new HashMap<>();

    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public Map<String, TreeNode> getChildren() { return children; }

    public TreeNode addChild(String childName) {
        return children.computeIfAbsent(childName, TreeNode::new);
    }
}


