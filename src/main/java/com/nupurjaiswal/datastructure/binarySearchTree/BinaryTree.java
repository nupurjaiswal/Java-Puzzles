package com.nupurjaiswal.datastructure.binarySearchTree;

public class BinaryTree {

    private TreeNode root;

    public void insert(Integer data){
        if(root == null)
            this.root = new TreeNode(data);
        else root.insert(data);
    }

    public TreeNode find(Integer data){

    if(root!=null){
        return root.find(data);
    }else{
        return null;
    }

    }

    public void delete(Integer data){

    }

    public Integer smallest(){
        if(this.root!=null)
            return root.smallest();
        return null;
    }

    public Integer largest(){
        if(this.root!=null)
            return root.largest();
        return null;
    }

}
