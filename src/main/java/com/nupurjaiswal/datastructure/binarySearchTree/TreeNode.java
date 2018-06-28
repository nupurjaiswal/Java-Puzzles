package com.nupurjaiswal.datastructure.binarySearchTree;



public class TreeNode {


    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(Integer data){
        this.data = data;
    }

    public TreeNode find(Integer data){

        if(this.data == data){
            return this;
        }

        if (data < this.data && leftChild != null){
            return leftChild.find(data);
        }

        if (data > this.data && rightChild != null){
            return rightChild.find(data);
        }

        else{
            return null;
        }

    }

    public void insert(Integer data){

        if(data >= this.data){
            if(this.rightChild == null)
                this.rightChild = new TreeNode(data);

            else
                this.rightChild.insert(data);
        }else {
            if(this.leftChild == null)
                this.leftChild = new TreeNode(data);

            else
                this.leftChild.insert(data);
        }
    }

    public Integer smallest(){
        if(this.leftChild == null)
            return this.data;
        return this.leftChild.smallest();

    }
    public Integer largest(){
        if(this.rightChild == null)
            return this.data;
        return this.rightChild.largest();

    }

    public Integer getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }






}


